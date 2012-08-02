/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videoMixerLite.resources;

import processing.core.*;

/**
 *
 * @author User
 */
public class Preview extends PApplet
{
    private PImage img;// = new PImage();
    private int w;
    private int h;
    
    public Preview(int w, int h)
    {
        this.w = w;
        this.h = h;
    }
    
    @Override
    public void setup()
    {
        size(w, h);
        background(64);
        noLoop();
    }
    
    @Override
    public void draw()
    {
        background(64);
        if(img != null)
        {
            image(img, 0, 0, w, h);
        }
    }
    
    public void setImage(PImage img)
    {
        this.img = img;
        redraw();
    }
    
    public void clear()
    {
        this.img = null;
        redraw();
    }
}
