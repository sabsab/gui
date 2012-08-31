/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CoreProperties.java
 *
 * Created on 24.07.2012, 2:04:24
 */
package videoMixerLite.resources;


/**
 *
 * @author User
 */
public class CoreProperties extends javax.swing.JPanel {

    public Core core;
    
    public OutputProperties[] outputProperties = new OutputProperties[12];
    
    
    
    /** Creates new form CoreProperties */
    public CoreProperties() {
        initComponents();
    }
    
    public void init(Core core)
    {
        this.core = core;
        
        effectsPanel1.init(this);
        
        
        outputProperties[0] = outputProperties1;
        outputProperties[1] = outputProperties2;
        outputProperties[2] = outputProperties3;
        outputProperties[3] = outputProperties4;
        outputProperties[4] = outputProperties5;
        outputProperties[5] = outputProperties6;
        outputProperties[6] = outputProperties7;
        outputProperties[7] = outputProperties8;
        outputProperties[8] = outputProperties9;
        outputProperties[9] = outputProperties10;
        outputProperties[10] = outputProperties11;
        outputProperties[11] = outputProperties12;
        
        
        
        outputProperties[0].init(core, "Output 1", 0,   0, 320, 180,    0, 0, 800, 600);
        outputProperties[1].init(core, "Output 2", 320, 0, 320, 180,  800, 0, 800, 600);
        outputProperties[2].init(core, "Output 3", 640, 0, 320, 180, 1600, 0, 800, 600);
        
        outputProperties[3].init(core, "Output 4", 0,   180, 320, 180,    0, 600, 800, 600);
        outputProperties[4].init(core, "Output 5", 320, 180, 320, 180,  800, 600, 800, 600);
        outputProperties[5].init(core, "Output 6", 640, 180, 320, 180, 1600, 600, 800, 600);
        
        outputProperties[6].init(core, "Output 7", 0,   360, 320, 180,    0, 1200, 800, 600);
        outputProperties[7].init(core, "Output 8", 320, 360, 320, 180,  800, 1200, 800, 600);
        outputProperties[8].init(core, "Output 9", 640, 360, 320, 180, 1600, 1200, 800, 600);
        
        outputProperties[9].init(core,  "Output 10", 0,   540, 320, 180,    0, 1800, 800, 600);
        outputProperties[10].init(core, "Output 11", 320, 540, 320, 180,  800, 1800, 800, 600);
        outputProperties[11].init(core, "Output 12", 640, 540, 320, 180, 1600, 1800, 800, 600);
        
        
        /*
        outputProperties[0].init(core, "Output 1", 1920, 0, 640, 480,    0, 0, 800, 600);
        outputProperties[1].init(core, "Output 2", 2560, 0, 640, 480,  800, 0, 800, 600);
        outputProperties[2].init(core, "Output 3", 3200, 0, 640, 480, 1600, 0, 800, 600);
        
        outputProperties[3].init(core, "Output 4", 1920, 480, 640, 480,    0, 600, 800, 600);
        outputProperties[4].init(core, "Output 5", 2560, 480, 640, 480,  800, 600, 800, 600);
        outputProperties[5].init(core, "Output 6", 3200, 480, 640, 480, 1600, 600, 800, 600);
        
        outputProperties[6].init(core, "Output 7", 1920, 960, 640, 480,    0, 1200, 800, 600);
        outputProperties[7].init(core, "Output 8", 2560, 960, 640, 480,  800, 1200, 800, 600);
        outputProperties[8].init(core, "Output 9", 3200, 960, 640, 480, 1600, 1200, 800, 600);
        
        outputProperties[9].init(core,  "Output 10", 1920, 2304, 1440, 480,    0, 1800, 800, 600);
        outputProperties[10].init(core, "Output 11", 2560, 2304, 1440, 480,  800, 1800, 800, 600);
        outputProperties[11].init(core, "Output 12", 3200, 2304, 1440, 480, 1600, 1800, 800, 600);
        */
        /*
        outputProperties[0].init(core, "Output 1", 1920, 0, 800, 600,    0, 0, 800, 600);
        outputProperties[1].init(core, "Output 2", 2720, 0, 800, 600,  800, 0, 800, 600);
        outputProperties[2].init(core, "Output 3", 3520, 0, 800, 600, 1600, 0, 800, 600);
        
        outputProperties[3].init(core, "Output 4", 1920, 768, 800, 600,    0, 600, 800, 600);
        outputProperties[4].init(core, "Output 5", 2720, 768, 800, 600,  800, 600, 800, 600);
        outputProperties[5].init(core, "Output 6", 3520, 768, 800, 600, 1600, 600, 800, 600);
        
        outputProperties[6].init(core, "Output 7", 1920, 1536, 800, 600,    0, 1200, 800, 600);
        outputProperties[7].init(core, "Output 8", 2720, 1536, 800, 600,  800, 1200, 800, 600);
        outputProperties[8].init(core, "Output 9", 3520, 1536, 800, 600, 1600, 1200, 800, 600);
        
        outputProperties[9].init(core,  "Output 10", 1920, 2304, 800, 600,    0, 1800, 800, 600);
        outputProperties[10].init(core, "Output 11", 2720, 2304, 800, 600,  800, 1800, 800, 600);
        outputProperties[11].init(core, "Output 12", 3520, 2304, 800, 600, 1600, 1800, 800, 600);
        */
        
        
        
        /*
        outputProperties[0].init(core, "Output 1", 1920, 0, 1024, 768,    0, 0, 800, 600);
        outputProperties[1].init(core, "Output 2", 2944, 0, 1024, 768,  800, 0, 800, 600);
        outputProperties[2].init(core, "Output 3", 3968, 0, 1024, 768, 1600, 0, 800, 600);
        
        outputProperties[3].init(core, "Output 4", 1920, 768, 1024, 768,    0, 600, 800, 600);
        outputProperties[4].init(core, "Output 5", 2944, 768, 1024, 768,  800, 600, 800, 600);
        outputProperties[5].init(core, "Output 6", 3968, 768, 1024, 768, 1600, 600, 800, 600);
        
        outputProperties[6].init(core, "Output 7", 1920, 1536, 1024, 768,    0, 1200, 800, 600);
        outputProperties[7].init(core, "Output 8", 2944, 1536, 1024, 768,  800, 1200, 800, 600);
        outputProperties[8].init(core, "Output 9", 3968, 1536, 1024, 768, 1600, 1200, 800, 600);
        
        outputProperties[9].init(core,  "Output 10", 1920, 2304, 1024, 768,    0, 1800, 800, 600);
        outputProperties[10].init(core, "Output 11", 2944, 2304, 1024, 768,  800, 1800, 800, 600);
        outputProperties[11].init(core, "Output 12", 3968, 2304, 1024, 768, 1600, 1800, 800, 600);
        */
        /*
        outputProperties[0].init(core, "Output 1", 1920, 0, 1152, 864,    0, 0, 800, 600);
        outputProperties[1].init(core, "Output 2", 3072, 0, 1152, 864,  800, 0, 800, 600);
        outputProperties[2].init(core, "Output 3", 4224, 0, 1152, 864, 1600, 0, 800, 600);
        
        outputProperties[3].init(core, "Output 4", 1920, 864, 1152, 864,    0, 600, 800, 600);
        outputProperties[4].init(core, "Output 5", 3072, 864, 1152, 864,  800, 600, 800, 600);
        outputProperties[5].init(core, "Output 6", 4224, 864, 1152, 864, 1600, 600, 800, 600);
        
        outputProperties[6].init(core, "Output 7", 1920, 1728, 1152, 864,    0, 1200, 800, 600);
        outputProperties[7].init(core, "Output 8", 3072, 1728, 1152, 864,  800, 1200, 800, 600);
        outputProperties[8].init(core, "Output 9", 4224, 1728, 1152, 864, 1600, 1200, 800, 600);
        
        outputProperties[9].init(core,  "Output 10", 1920, 2592, 1152, 864,    0, 1800, 800, 600);
        outputProperties[10].init(core, "Output 11", 3072, 2592, 1152, 864,  800, 1800, 800, 600);
        outputProperties[11].init(core, "Output 12", 4224, 2592, 1152, 864, 1600, 1800, 800, 600);
        */
        
        /*
        outputProperties[0].init(core, "Output 1", 1920, 0, 1280, 960,    0, 0, 800, 600);
        outputProperties[1].init(core, "Output 2", 3200, 0, 1280, 960,  800, 0, 800, 600);
        outputProperties[2].init(core, "Output 3", 4480, 0, 1280, 960, 1600, 0, 800, 600);
        
        outputProperties[3].init(core, "Output 4", 1920, 960, 1280, 960,    0, 600, 800, 600);
        outputProperties[4].init(core, "Output 5", 3200, 960, 1280, 960,  800, 600, 800, 600);
        outputProperties[5].init(core, "Output 6", 4480, 960, 1280, 960, 1600, 600, 800, 600);
        
        outputProperties[6].init(core, "Output 7", 1920, 1920, 1280, 960,    0, 1200, 800, 600);
        outputProperties[7].init(core, "Output 8", 3200, 1920, 1280, 960,  800, 1200, 800, 600);
        outputProperties[8].init(core, "Output 9", 4480, 1920, 1280, 960, 1600, 1200, 800, 600);
        
        outputProperties[9].init(core,  "Output 10", 1920, 2880, 1280, 960,    0, 1800, 800, 600);
        outputProperties[10].init(core, "Output 11", 3200, 2880, 1280, 960,  800, 1800, 800, 600);
        outputProperties[11].init(core, "Output 12", 4480, 2880, 1280, 960, 1600, 1800, 800, 600);
        */
    }
    
    /*
    public void setOutputProperties()
    {
        outputProperties[0] = outputProperties_1;
    }
    */
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        effectsPanel1 = new videoMixerLite.resources.EffectsPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        outputProperties1 = new videoMixerLite.resources.OutputProperties();
        outputProperties2 = new videoMixerLite.resources.OutputProperties();
        outputProperties3 = new videoMixerLite.resources.OutputProperties();
        outputProperties4 = new videoMixerLite.resources.OutputProperties();
        outputProperties5 = new videoMixerLite.resources.OutputProperties();
        outputProperties6 = new videoMixerLite.resources.OutputProperties();
        outputProperties7 = new videoMixerLite.resources.OutputProperties();
        outputProperties8 = new videoMixerLite.resources.OutputProperties();
        outputProperties9 = new videoMixerLite.resources.OutputProperties();
        outputProperties10 = new videoMixerLite.resources.OutputProperties();
        outputProperties11 = new videoMixerLite.resources.OutputProperties();
        outputProperties12 = new videoMixerLite.resources.OutputProperties();

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outputProperties12, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addComponent(outputProperties11, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addComponent(outputProperties10, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addComponent(outputProperties9, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addComponent(outputProperties8, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addComponent(outputProperties7, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addComponent(outputProperties6, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addComponent(outputProperties5, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addComponent(outputProperties4, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addComponent(outputProperties3, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addComponent(outputProperties2, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addComponent(outputProperties1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(outputProperties1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputProperties2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputProperties3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputProperties4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputProperties5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputProperties6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputProperties7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputProperties8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputProperties9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputProperties10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputProperties11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputProperties12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
            .addComponent(effectsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(effectsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private videoMixerLite.resources.EffectsPanel effectsPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private videoMixerLite.resources.OutputProperties outputProperties1;
    private videoMixerLite.resources.OutputProperties outputProperties10;
    private videoMixerLite.resources.OutputProperties outputProperties11;
    private videoMixerLite.resources.OutputProperties outputProperties12;
    private videoMixerLite.resources.OutputProperties outputProperties2;
    private videoMixerLite.resources.OutputProperties outputProperties3;
    private videoMixerLite.resources.OutputProperties outputProperties4;
    private videoMixerLite.resources.OutputProperties outputProperties5;
    private videoMixerLite.resources.OutputProperties outputProperties6;
    private videoMixerLite.resources.OutputProperties outputProperties7;
    private videoMixerLite.resources.OutputProperties outputProperties8;
    private videoMixerLite.resources.OutputProperties outputProperties9;
    // End of variables declaration//GEN-END:variables
}
