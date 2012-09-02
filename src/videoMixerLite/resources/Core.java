/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videoMixerLite.resources;

/**
 *
 * @author User
 */


import processing.core.*;
import codeanticode.glgraphics.*;
import codeanticode.gsvideo.*;
//import java.text.StringCharacterIterator;


public class Core extends PApplet 
{
    public Channel[] channel;
    
    private int w = 100, h = 100;
    
    public int coreWidth = 2400;
    public int coreHeight = 2400;
    
    private Effect[] effect;
    
    private GLTextureFilter[] filterEffect = new GLTextureFilter[2];
    
    
    private GLTextureFilter filterMask;
    private GLTextureFilter[] filterBlend = new GLTextureFilter[27];
    
    private GLTexture texEmpty, texBG, texBase, texMasked, texResult;
    private GLTexture[] texMask = new GLTexture[2];
    private GLTexture[] texBlend = new GLTexture[2];
    
    
    //private GLGraphicsOffScreen offscreen;
    
    public VideoMixerLite parent;
    
    private CoreProperties coreProperties;
    
    
    
    public Core(VideoMixerLite parent, int w, int h, CoreProperties cp)
    {
        this.parent = parent;
        channel = parent.channel;
        
        this.w = w;
        this.h = h;
        
        coreProperties = cp;
    }
    
    
    
    @Override
    public void setup()
    {
        size(w, h, GLConstants.GLGRAPHICS);
        background(0);
        noLoop();
        
        
        //System.out.println("Put \"data\" folder here ---->  " + this.sketchPath);
        
        
        //offscreen = new GLGraphicsOffScreen(this, 800, 600);
        
        
        effect = new Effect[0];
        
        
        filterMask = new GLTextureFilter(this, "core/mask.xml");
        
        
        
        filterBlend[0] = new GLTextureFilter(this, "blends/BlendUnmultiplied.xml");
        
        filterBlend[2] = new GLTextureFilter(this, "blends/BlendDarken.xml");
        filterBlend[3] = new GLTextureFilter(this, "blends/BlendMultiply.xml");
        filterBlend[4] = new GLTextureFilter(this, "blends/BlendColorBurn.xml");
        
        filterBlend[7] = new GLTextureFilter(this, "blends/BlendLighten.xml");
        filterBlend[8] = new GLTextureFilter(this, "blends/BlendScreen.xml");
        filterBlend[9] = new GLTextureFilter(this, "blends/BlendColorDodge.xml");
        
        filterBlend[12] = new GLTextureFilter(this, "blends/BlendOverlay.xml");
        filterBlend[13] = new GLTextureFilter(this, "blends/BlendSoftLight.xml");
        filterBlend[14] = new GLTextureFilter(this, "blends/BlendHardLight.xml");
        
        filterBlend[19] = new GLTextureFilter(this, "blends/BlendDifference.xml");
        filterBlend[20] = new GLTextureFilter(this, "blends/BlendExclusion.xml");
        filterBlend[21] = new GLTextureFilter(this, "blends/BlendSubtract.xml");
        
        filterBlend[25] = new GLTextureFilter(this, "blends/BlendColor.xml");
        filterBlend[26] = new GLTextureFilter(this, "blends/BlendLuminance.xml");
        
        
        
        
        
        filterEffect[0] = new GLTextureFilter(this, "effects/RGBA.xml");
        filterEffect[1] = new GLTextureFilter(this, "effects/GreyScale.xml");
        
        
        
        //System.out.println(filterBlend[0].getDescription());
        
        
        
        
        
        
        
        
        
        
        texEmpty = new GLTexture(this);
        texBG = new GLTexture(this);
        texBase = new GLTexture(this);
        /*
        texResult = new GLTexture(this, 1280, 320);
        texMasked = new GLTexture(this, 1280, 320);
        
        
        
        
        PImage imgBG = createImage(1280, 320, RGB);
        */
        texResult = new GLTexture(this, coreWidth, coreHeight);
        texMasked = new GLTexture(this, coreWidth, coreHeight);
        
        
        
        
        PImage imgBG = createImage(coreWidth, coreHeight, RGB);
        imgBG.loadPixels();
        for (int i = 0; i < imgBG.pixels.length; i++) 
        {
            imgBG.pixels[i] = color(0);
        }
        imgBG.updatePixels();
        texBG.putPixelsIntoTexture(imgBG);
        
        
        
        for(int i=0; i<channel.length; i++)
        {
            channel[i].init(this);
        }
        
        
        coreProperties.init(this);
        
    }
    
    
    
    @Override
    public void draw()
    {
        
        background(0);
        
        texBase = texEmpty;
        texResult.copy(texBG);
        
        
        for(int i=0; i<channel.length; i++)
        {
            channel[i].redraw();
        }
        
        
        
        
        
        for(int i=0; i<channel.length; i++)
        {
            
            Channel ch = channel[i];
            
            
            
            Footage f = ch.footageSelected;
            
            if(ch.isMaskOutput)
            {
                texResult.copy(texEmpty);
                texMask[0] = texBase;
                
                if(ch.footageSelected == null)
                {
                    texMask[1] = texEmpty;
                }
                else
                {
                    texMask[1] = f.tex;
                }
                
                filterMask.apply(texMask, texResult); 
            }
            else if(f != null && !ch.isMaskLayer)
            {
                
                texResult.copy(texEmpty);
                texBlend[0] = texBase;
                
                if(ch.maskChannel == -1)
                {
                    texBlend[1] = f.tex; 
                }
                else
                {
                    if(channel[ch.maskChannel].footageSelected == null)
                    {
                        texBlend[1] = texEmpty;
                    }
                    else
                    {
                        texMasked.copy(texEmpty);
                        texMask[0] = f.tex;
                        texMask[1] = channel[ch.maskChannel].footageSelected.tex;
                        filterMask.apply(texMask, texMasked);
                        texBlend[1] = texMasked;
                    }
                }
                
                filterBlend[ch.blendNum].setParameterValue("Opacity", ch.opacity);
                filterBlend[ch.blendNum].apply(texBlend, texResult);
                
                //System.out.println(f.effect.length);
                for(int j=0; j<f.effect.length; j++)
                {
                    if(f.effect[j].isEnabled)
                    {
                        f.effect[j].getFilterEffect().apply(texResult, texResult);
                    }
                }
                
                
                //System.out.println(ch.effect.length);
                for(int j=0; j<ch.effect.length; j++)
                {
                    if(ch.effect[j].isEnabled)
                    {
                        ch.effect[j].getFilterEffect().apply(texResult, texResult);
                    }
                }
                
                
                texBase = texResult;
            }
        }
        
        for(int j=0; j<effect.length; j++)
        {
            if(effect[j].isEnabled)
            {
                effect[j].getFilterEffect().apply(texResult, texResult);
            }
        }
        
        if(channel[channel.length-1].isMaskOutput)
        {
            texBlend[0] = texBG;
            texBlend[1] = texResult;
            filterBlend[0].setParameterValue("Opacity", (float)1);
            filterBlend[0].apply(texBlend, texResult);
        }
        
        /*
        coreProperties.outputProperties[0].redraw(texResult);
        coreProperties.outputProperties[1].redraw(texResult);
        coreProperties.outputProperties[2].redraw(texResult);
        coreProperties.outputProperties[3].redraw(texResult);
        coreProperties.outputProperties[4].redraw(texResult);
        coreProperties.outputProperties[5].redraw(texResult);
        coreProperties.outputProperties[6].redraw(texResult);
        coreProperties.outputProperties[7].redraw(texResult);
        coreProperties.outputProperties[8].redraw(texResult);
        /*
        coreProperties.outputProperties[9].redraw(texResult);
        coreProperties.outputProperties[10].redraw(texResult);
        coreProperties.outputProperties[11].redraw(texResult);
        */
        
        OutputProperties out[] = coreProperties.outputProperties;
        
        for(int i=0; i<out.length; i++)
        {
            /*
            if(out[i].isDisplayed)
            {
                out[i].redraw(texResult);
            }
            */
            out[i].redraw(texResult);
        }
        
        
        image(texResult, 0, 0, w, h);
    }
    
    
    public void movieEvent(GSMovie movie)
    {
        //System.out.println("movieEvent");
        movie.read();
        redraw();
    }
    
    
    public GLTextureFilter getFilterEffect(int effectNum)
    {
        return filterEffect[effectNum];
    }
    
    
    
    public void addEffect(Effect eff)
    {
        Effect[] temp = effect;
        effect = new Effect[effect.length + 1];
        System.arraycopy(temp, 0, effect, 0, temp.length);
        effect[temp.length] = eff;
    }
    
    
    public void removeEffect(Effect eff)
    {
        Effect[] temp = effect;
        effect = new Effect[effect.length - 1];
        int j = 0;
        for(int i = 0; i < temp.length; i++)
        {
          if(temp[i] != eff)
          {
            effect[j++] = temp[i];
          }
        }
    }
    
    
}
