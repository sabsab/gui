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
import javax.media.opengl.*;
import com.sun.opengl.util.FPSAnimator;


public class GLTextureCanvas 
{
    protected String name;
    protected boolean hasBorder;
    protected boolean resizable;
    protected GLRenderer renderer;
    protected GLCanvas canvas;
    protected GLContext mainContext;
    protected GLCapabilities mainCaps;  
    protected GLTexture outTex;
    protected GLGraphics pgl;
    protected boolean restoreVisibility = false;
    protected long frameRateLastNanos = 0;
    protected boolean useOwnFrameRate = false;
    protected float frameRateTarget = 60;
    protected FPSAnimator animator;
    
    public GLTextureCanvas(PApplet parent)
    {
        outTex = new GLTexture();
        /*
        this.parent = parent;
        */
        pgl = (GLGraphics) parent.g;

        mainContext = pgl.getContext();
        mainCaps = pgl.getCapabilities();
        renderer = new GLRenderer();
        renderer.started = true;

        canvas = new GLCanvas(mainCaps, null, mainContext, null);
        canvas.addGLEventListener(renderer);
        animator = new FPSAnimator(canvas, (int)frameRateTarget);
        animator.start();
    }
    
    public void setTexture(GLTexture tex)
    {
        outTex = tex;
    }
    
    public GLCanvas getCanvas()
    {
        return canvas;
    }
    
    public boolean isInitialized()
    {
        return renderer.initalized;
    }
    
    protected class GLRenderer implements GLEventListener
    {
        float r, g, b, a;
        GL gl;
        GLContext context;
        boolean initalized;
        boolean started;
        
        public GLRenderer()
        {
            super();
            initalized = false;
            started = false;
            r = g = b = a = 1.0f;
        }
        
        public void delete()
        {
            if (context != null)
            {
                context.destroy();
                context = null;
            }
        }
        
        @Override
        public void init(GLAutoDrawable drawable)
        {
            gl = drawable.getGL();
            context = drawable.getContext();
            
            gl.glClearColor(0, 0, 0, 0);
            initalized = true;
        }
        
        @Override
        public void display(GLAutoDrawable drawable)
        {
            if (!initalized || !started || (outTex == null))
            {
                return;
            }
            int w = drawable.getWidth();
            int h = drawable.getHeight();
            
            gl = drawable.getGL();
            context = drawable.getContext();
            detainContext();
            
            // Setting orthographics view to display the texture.
            gl.glViewport(0, 0, w, h);
            gl.glMatrixMode(GL.GL_PROJECTION);
            gl.glLoadIdentity();
            gl.glOrtho(0.0, w, 0.0, h, -100.0, +100.0);
            gl.glMatrixMode(GL.GL_MODELVIEW);
            gl.glLoadIdentity();
            
            float uscale = outTex.getMaxTextureCoordS();
            float vscale = outTex.getMaxTextureCoordT();
            
            float cx = 0.0f;
            float sx = +1.0f;
            if (outTex.isFlippedX())
            {
                cx = 1.0f;
                sx = -1.0f;
            }
            
            float cy = 0.0f;
            float sy = +1.0f;
            if (outTex.isFlippedY())
            {
                cy = 1.0f;
                sy = -1.0f;
            }
            
            gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
            gl.glEnable(outTex.getTextureTarget());
            gl.glActiveTexture(GL.GL_TEXTURE0);
            gl.glBindTexture(outTex.getTextureTarget(), outTex.getTextureID());
            gl.glColor4f(r, g, b, a);
            gl.glBegin(GL.GL_QUADS);
            gl.glTexCoord2f((cx + sx * 0.0f) * uscale, (cy + sy * 1.0f) * vscale);
            gl.glVertex2f(0.0f, 0.0f);
            
            gl.glTexCoord2f((cx + sx * 1.0f) * uscale, (cy + sy * 1.0f) * vscale);
            gl.glVertex2f(w, 0.0f);
            
            gl.glTexCoord2f((cx + sx * 1.0f) * uscale, (cy + sy * 0.0f) * vscale);
            gl.glVertex2f(w, h);
            
            gl.glTexCoord2f((cx + sx * 0.0f) * uscale, (cy + sy * 0.0f) * vscale);
            gl.glVertex2f(0.0f, h);
            gl.glEnd();
            gl.glBindTexture(outTex.getTextureTarget(), 0);
            
            gl.glFlush();
            
            releaseContext();
        }
        
        @Override
        public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height)
        {
        }
        
        @Override
        public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged)
        {
        }
        
        protected void detainContext()
        {
            try
            {
                while (context.makeCurrent() == GLContext.CONTEXT_NOT_CURRENT)
                {
                    Thread.sleep(10);
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        
        protected void releaseContext()
        {
            context.release();
        }
    }
}
