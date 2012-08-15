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
import java.text.StringCharacterIterator;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;


public class Core extends PApplet 
{
    public Channel[] channel;
    
    private int w = 100, h = 100;
    
    /*
    private int outX = 1050;
    private int outY = 0;
    private int outWidth = 320;
    private int outHeight = 180;
    */
    
    private GLTextureFilter filterMask;
    private GLTextureFilter[] filterBlend = new GLTextureFilter[27];
    
    private GLTexture texEmpty, texBG, texBase, texMasked, texResult;//texOutput;
    private GLTexture[] texMask = new GLTexture[2];
    private GLTexture[] texBlend = new GLTexture[2];
    
    public VideoMixerLite parent;
    
    private CoreProperties coreProperties;
    
    
    private JFrame outputFrame;
    /*
    private GLTextureCanvas outputCanvas;
    */
    
    private GLTextureWindow_New2 texWin;
    
    private Timer timer;
    
    public Core(VideoMixerLite parent, int w, int h)
    {
        this.parent = parent;
        channel = parent.channel;
        
        this.w = w;
        this.h = h;
        
        coreProperties = new CoreProperties();
        //parent.setProperties(coreProperties);
    }
    
    
    /*
    public void setCoreSize(int w, int h)
    {
        this.w = w;
        this.h = h;
    }
    */
    
    @Override
    public void setup()
    {
        size(w, h, GLConstants.GLGRAPHICS);
        background(0);
        noLoop();
        
        
        //System.out.println("Put \"data\" folder here ---->  " + this.sketchPath);
        
        filterMask = new GLTextureFilter(this, "core/mask.xml");
        //filterMask = new GLTextureFilter(this, "blends/!.xml");
        
        //filterBlend[0] = new GLTextureFilter(this, "blends/!.xml");
        
        
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
        
        //System.out.println(filterBlend[0].getDescription());
        
        texEmpty = new GLTexture(this);
        texBG = new GLTexture(this);
        texBase = new GLTexture(this);
        texResult = new GLTexture(this, 1280, 320);
        texMasked = new GLTexture(this, 1280, 320);
        
        
        
        PImage imgBG = createImage(1280, 320, RGB);
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
        
        
        
        
        
        
       // outputCanvas GLTextureCanvas = new GLTextureCanvas(this);
        /*
        outputCanvas.setTexture(texResult);
        
        outputFrame = new JFrame();
        outputFrame.setVisible(true);
        outputFrame.getContentPane().add(outputCanvas.getCanvas());
        
        timer = new Timer();
        timer.schedule(new outputCanvasReadyWait(), 1);
        */
        
        
        
        texWin = new GLTextureWindow_New2(this, 1050, 0, 320, 180);
        texWin.setTexture(texResult);
        //texWin.hide();
        
        /*
        outputFrame = new JFrame();
        outputFrame.setVisible(true);
        outputFrame.setSize(320, 180);
        outputFrame.setLocation(1000, 0);
        //outputFrame.getContentPane().add(texWin.getFrm());
        //System.out.println(outputFrame.isActive());
        timer = new Timer();
        timer.schedule(new frmReadyWait(), 1);
        */
        
        
        timer = new Timer();
        timer.schedule(new texWinReadyWait(), 1);
        
        
    }
    
    
    /*
    class frmReadyWait extends TimerTask
    {
        @Override
        public void run()
        {
            timer.cancel();
            if(outputFrame.isActive())
            {
                outputFrame.getContentPane().add(texWin.getFrm());
            }
            else
            {
                timer = new Timer();
                timer.schedule(new frmReadyWait(), 1);
            }
            
        }
    }
    */
    
    
    class texWinReadyWait extends TimerTask
    {
        @Override
        public void run()
        {
            timer.cancel();
            if(texWin.isInitialized())
            {
                //System.out.println("texWin Ready");
                texWin.hide();
            }
            else
            {
                timer = new Timer();
                timer.schedule(new texWinReadyWait(), 1);
            }
        }
    }
    
    
    /*
    class outputCanvasReadyWait extends TimerTask
    {
        @Override
        public void run()
        {
            //System.out.println("outputCanvas " + outputCanvas.isInitialized());
            timer.cancel();
            
            if(outputCanvas.isInitialized())
            {
                //outputFrame.setVisible(false);
            }
            else
            {
                timer = new Timer();
                timer.schedule(new outputCanvasReadyWait(), 1);
            }
            
        }
    }
    */
    
    
    @Override
    public void draw()
    {
        
        background(0);
        
        texBase = texEmpty;//texBG;
        //texResult.clear(0);// = texBG;
        texResult.copy(texBG);
        //texResult.copy(texEmpty);
        
        
        for(int i=0; i<channel.length; i++)
        {
            channel[i].redraw();
        }
        
        
        
        
        
        for(int i=0; i<channel.length; i++)
        {
            
            Channel ch = channel[i];
            //ch.redraw();
            
            
            
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
                
                texBase = texResult;
            }
        }
        
        image(texResult, 0, 0, w, h);
        
        
        
    }
    
    public void showOutput(boolean bln)
    {
        /*
        outputFrame.setSize(320, 180);
        outputFrame.setVisible(visible);
        */
        if(bln)
        {
            texWin.show();
            //texWin.initImpl(1050, 0, w, h);
            
            redraw();
        }
        else
        {
            texWin.hide();
        }
    }
    
    
    
    public void outputSetX(int value)
    {
        texWin.setLocation(value, texWin.getY());
    }
    
    
    public void outputSetY(int value)
    {
        texWin.setLocation(texWin.getX(), value);
    }
    
    
    /*
    public void outputSetSize(int w, int h)
    {
        
    }
    */
    
    public void movieEvent(GSMovie movie)
    {
        //System.out.println("movieEvent");
        movie.read();
        redraw();
    }
    
    
    public Integer integerValidator(String str) 
    {
        String outString = "";
        StringCharacterIterator iterator = new StringCharacterIterator(str);
        char character = iterator.current();
        while (character != StringCharacterIterator.DONE) 
        {
            boolean isValidChar = Character.isDigit(character) || character == '-';
            
            if(isValidChar)
            {
                outString += character;
            }
            
            character = iterator.next();
        }
        
        if("-".equals(outString))
        {
            outString = "0";
        }
        
        return Integer.parseInt(outString);
    } 
    
}
