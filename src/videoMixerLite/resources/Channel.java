/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Channel.java
 *
 * Created on 09.07.2012, 23:48:20
 */
package videoMixerLite.resources;

//import java.awt.Color;

import java.awt.Color;
import javax.swing.JPanel;

//import javax.swing.BorderFactory;
//import processing.core.PApplet;

/**
 *
 * @author User
 */
public class Channel extends javax.swing.JPanel {
    
    
    public Core core;
    
    public int num;
    
    private Footage[] footage;
    
    public Effect[] effect;
    
    public Footage footageSelected;
    
    private Preview preview;
    
    public float opacity = (float)0.5;
    
    public int blendNum = 0;
    
    public boolean isMaskLayer = false;
    public boolean isMaskOutput = false;
    public int maskChannel = -1;
    
    
    private PropertiesPanel propertiesPanel;
    public ChannelProperties channelProperties;
    
    
    //public boolean isPropertiesPanelOpen = false;
    public JPanel displayedPopertiesPanel;
    
    
    
    
    /** Creates new form Channel */
    public Channel() {
        initComponents();
    }
    
    
    public void setPropertiesPanel(PropertiesPanel panel)
    {
        propertiesPanel = panel;
        propertiesPanel.init(this);
    }
    
    
    public void setChannelProperties()
    {
        channelProperties = new ChannelProperties();
        channelProperties.init(this);
    }

    
    public void setPreview()
    {
        preview = new Preview(134, 73);
        displayPanel.add(preview);
        preview.init();
    }
    
    
    
    public void setChannelName(String name)
    {
        jLabel1.setText(name);
        channelProperties.setChannelName(name);
        for(int i=0; i<core.channel.length; i++)
        {
            core.channel[i].channelProperties.channelMaskCheckBox[num].setText(name);
        }
    }
    
    
    public void setMaskToChannel(int channelNum)
    {
        isMaskLayer = true;
        core.channel[channelNum].maskChannel = num;
        jPanel2.setVisible(false);
    }
    
    public void resetMaskToChannel(int channelNum)
    {
        for(int i=0; i<=channelNum; i++)
        {
            if(core.channel[i].maskChannel == num)
            {
                core.channel[i].maskChannel = -1;
            }
        }
        
        isMaskLayer = false;
        for(int i=channelNum+1; i<num; i++)
        {
            if(core.channel[i].maskChannel == num)
            {
                isMaskLayer = true;
                break;
            }
        }
        
        if(!isMaskLayer)
        {
            jPanel2.setVisible(true);
        }
    }
    
    
    public void setOutputMask()
    {
        isMaskOutput = true;
        jPanel2.setVisible(false);
    }
    
    public void resetOutputMask()
    {
        isMaskOutput = false;
        jPanel2.setVisible(true);
    }
    
    
    public void init(Core core)
    {
        
        this.core = core;
        
        
        setChannelName("Channel " + (num + 1));
        
        //System.out.println("Channel  " + num);
        
        //setChannelProperties();
        channelProperties.setMaskCheckBoxes();
        
        
        footage = new Footage[]
        {
            footage1, 
            footage2, 
            footage3, 
            footage4, 
            footage5, 
            footage6, 
            footage7, 
            footage8
        };
        
        
        for(int i=0; i<footage.length; i++)
        {
            footage[i].init(this);
        }
        
        
        effect = new Effect[0];
        
    }
    
    
    
    public void redraw()
    {
        for(int i=0; i<footage.length; i++)
        {
            footage[i].redraw();
        }
    }
    
    
    public void selectFootage(Footage footage)
    {
        clear();
        footageSelected = footage;
        //footageSelected.setBorder(BorderFactory.createEtchedBorder(new Color(255, 255, 0), new Color(255, 255, 0)));
        preview.setImage(footage.image);
    }
    
    
    public void clear()
    {
        if(footageSelected != null)
        {
            footageSelected.deselect();
            //footageSelected.setBorder(BorderFactory.createEtchedBorder());
        }
        footageSelected = null;
        preview.clear();
        core.redraw();
    }
    
    
    public void showPropertiesPanel(JPanel panel)
    {
        //isPropertiesPanelOpen = true;
        displayedPopertiesPanel = panel;
        
        clearPropertiesPanel();
        propertiesPanel.setPanel(panel);
        
        propertiesPanel.setVisible(true);
        jSeparator1.setVisible(false);
        
        this.getRootPane().revalidate();
    }
    
    
    public void hidePropertiesPanel()
    {
        //isPropertiesPanelOpen = false;
        displayedPopertiesPanel = null;
        
        clearPropertiesPanel();
        propertiesPanel.setVisible(false);
        jSeparator1.setVisible(true);
    }
    
    private void clearPropertiesPanel()
    {
        jButton1.setBackground(new Color(212, 208, 200));
        for(int i=0; i<footage.length; i++)
        {
            footage[i].setEditable(false);
        }
        propertiesPanel.clearPanel();
    }
    
    
    /*
    public void setPropertiesPanelVisible(boolean bln)
    {
        if(bln)
        {
            propertiesPanel.setVisible(true);
            jSeparator1.setVisible(false);
        }
        else
        {
            propertiesPanel.setVisible(false);
            jSeparator1.setVisible(true);
        }
    }
    */
    
    
    
    public void addEffect(Effect eff)
    {
        Effect[] temp = effect;
        effect = new Effect[effect.length + 1];
        /*
        for(int i = 0; i < temp.length; i++)
        {
            effect[i] = temp[i];
        }
        */
        System.arraycopy(temp, 0, effect, 0, temp.length);
        effect[temp.length] = eff;
        
        //System.out.println("Channel addEffect: " + effect.length);
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
        
        //System.out.println("Channel removeEffect: " + effect.length);
    }
    
    
    
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        displayFrame = new javax.swing.JPanel();
        displayPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        footage1 = new videoMixerLite.resources.Footage();
        footage2 = new videoMixerLite.resources.Footage();
        footage3 = new videoMixerLite.resources.Footage();
        footage4 = new videoMixerLite.resources.Footage();
        footage5 = new videoMixerLite.resources.Footage();
        footage6 = new videoMixerLite.resources.Footage();
        footage7 = new videoMixerLite.resources.Footage();
        footage8 = new videoMixerLite.resources.Footage();
        jPanel2 = new javax.swing.JPanel();
        opacitySlider = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(158, 679));
        setRequestFocusEnabled(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel1.setPreferredSize(new java.awt.Dimension(158, 655));

        displayFrame.setBackground(new java.awt.Color(64, 64, 64));
        displayFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        displayFrame.setPreferredSize(new java.awt.Dimension(136, 77));

        displayPanel.setBackground(new java.awt.Color(64, 64, 64));

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout displayFrameLayout = new javax.swing.GroupLayout(displayFrame);
        displayFrame.setLayout(displayFrameLayout);
        displayFrameLayout.setHorizontalGroup(
            displayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        displayFrameLayout.setVerticalGroup(
            displayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(footage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(footage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(footage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(footage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(footage5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(footage6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(footage7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(footage8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(footage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(footage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(footage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(footage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(footage5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(footage6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(footage7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(footage8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel3);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        opacitySlider.setOrientation(javax.swing.JSlider.VERTICAL);
        opacitySlider.setFocusable(false);
        opacitySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opacitySliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opacitySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opacitySlider, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        jButton1.setText("Properties");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" ");
        jLabel1.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(displayFrame, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void opacitySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opacitySliderStateChanged
        // TODO add your handling code here:
        opacity = (float)opacitySlider.getValue() / (float)100;
        //System.out.println(opacity);
        core.redraw();
    }//GEN-LAST:event_opacitySliderStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //if(isPropertiesPanelOpen)
        if(displayedPopertiesPanel == channelProperties)
        {
            hidePropertiesPanel();
        }
        else
        {
            showPropertiesPanel(channelProperties);
            jButton1.setBackground(new Color(255, 255, 0));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel displayFrame;
    private javax.swing.JPanel displayPanel;
    private videoMixerLite.resources.Footage footage1;
    private videoMixerLite.resources.Footage footage2;
    private videoMixerLite.resources.Footage footage3;
    private videoMixerLite.resources.Footage footage4;
    private videoMixerLite.resources.Footage footage5;
    private videoMixerLite.resources.Footage footage6;
    private videoMixerLite.resources.Footage footage7;
    private videoMixerLite.resources.Footage footage8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider opacitySlider;
    // End of variables declaration//GEN-END:variables
}
