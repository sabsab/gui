/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ChannelProperties.java
 *
 * Created on 02.08.2012, 14:45:47
 */
package videoMixerLite.resources;

//import codeanticode.glgraphics.GLTextureFilter;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

/**
 *
 * @author User
 */
public class ChannelProperties extends javax.swing.JPanel {
    
    public Channel channel;
    
    private JRadioButton[] blendRadioButton;
    
    public JCheckBox[] channelMaskCheckBox;
    
    public JCheckBox outputMaskCheckBox;

    /** Creates new form ChannelProperties */
    public ChannelProperties() {
        initComponents();
    }
    
    public void init(Channel c)
    {
        channel = c;
        
        blendRadioButton = new JRadioButton[]
        {
            jRadioButton1,
            jRadioButton2,
            jRadioButton3,
            jRadioButton4,
            jRadioButton5,
            jRadioButton6,
            jRadioButton7,
            jRadioButton8,
            jRadioButton9,
            jRadioButton10,
            jRadioButton11,
            jRadioButton12,
            jRadioButton13,
            jRadioButton14,
            jRadioButton15,
            jRadioButton16,
            jRadioButton17,
            jRadioButton18,
            jRadioButton19,
            jRadioButton20,
            jRadioButton21,
            jRadioButton22,
            jRadioButton23,
            jRadioButton24,
            jRadioButton25,
            jRadioButton26,
            jRadioButton27
        };
        
        channelMaskCheckBox = new JCheckBox[]
        {
            jCheckBox1,
            jCheckBox2,
            jCheckBox3,
            jCheckBox4,
            jCheckBox5,
            jCheckBox6,
            jCheckBox7,
            jCheckBox8
        };
        
        outputMaskCheckBox = jCheckBox9;
        
        effectsPanel1.init(this);
    }
    
    
    public void setChannelName(String name)
    {
        jTextField1.setText(name);
    }
    
    private void renameChannel(String name)
    {
        channel.setChannelName(name);
    }
    
    private void setChannelBlend(int blendNum)
    {
        channel.blendNum = blendNum;
        channel.isMaskOutput = false;
        channel.core.redraw();
        resetMaskToChannel(channel.num - 1);
    }
    
    
    private void setMaskToChannel(int channelNum)
    {
        channel.setMaskToChannel(channelNum);
        setMaskCheckBoxes();
    }
    
    private void resetMaskToChannel(int channelNum)
    {
        channel.resetMaskToChannel(channelNum);
        setMaskCheckBoxes();
    }
    
    private void setOutputMask()
    {
        channel.setOutputMask();
        setMaskCheckBoxes();
    }
    
    private void resetOutputMask()
    {
        channel.resetOutputMask();
        setMaskCheckBoxes();
    }
    
    public void setMaskCheckBoxes()
    {
        Channel ch[] = channel.core.channel;
        
        for(int chNum=0; chNum<ch.length; chNum++)
        {
            for(int chBoxNum=0; chBoxNum<ch.length; chBoxNum++)
            {
                ch[chNum].channelProperties.channelMaskCheckBox[chBoxNum].setEnabled(true);
            }
        }
        
        for(int chNum=1; chNum<ch.length; chNum++)
        {
            for(int chBoxNum=0; chBoxNum<=chNum-1; chBoxNum++)
            {
                if(!ch[chBoxNum].isMaskLayer && 
                   ch[chNum].maskChannel == -1 && 
                   (chBoxNum == chNum-1 || ch[chBoxNum+1].maskChannel == chNum))
                {
                    ch[chNum].channelProperties.channelMaskCheckBox[chBoxNum].setEnabled(true);
                    
                    if(ch[chBoxNum].maskChannel == -1)
                    {
                        ch[chNum].channelProperties.channelMaskCheckBox[chBoxNum].setSelected(false);
                    }
                }
                else
                {
                    ch[chNum].channelProperties.channelMaskCheckBox[chBoxNum].setSelected(false);
                    ch[chNum].channelProperties.channelMaskCheckBox[chBoxNum].setEnabled(false);
                }
            } 
        }
        
        for(int chNum=channel.num; chNum<ch.length; chNum++)
        {
            channelMaskCheckBox[chNum].setVisible(false);
        }
        
        if(channel.num == ch.length - 1)
        {
            outputMaskCheckBox.setVisible(true);
            outputMaskCheckBox.setSelected(channel.isMaskOutput);
            
            if(channel.isMaskLayer)
            {
                outputMaskCheckBox.setEnabled(false);
            }
            else
            {
                outputMaskCheckBox.setEnabled(true);
            }
            
            if(channel.isMaskOutput || ch[channel.num - 1].isMaskLayer)
            {
                channelMaskCheckBox[channel.num - 1].setEnabled(false);
            }
            else
            {
                channelMaskCheckBox[channel.num - 1].setEnabled(true);
                
            }
        }
        else
        {
           outputMaskCheckBox.setVisible(false);
           
           if(ch[ch.length - 1].isMaskOutput)
            {
                ch[ch.length - 1].channelProperties.channelMaskCheckBox[ch.length - 2].setEnabled(false);
            }
        }
        
        
        
        if(!channel.isMaskLayer && !channel.isMaskOutput)
        {
            blendRadioButton[channel.blendNum].setSelected(true);
        }
        else
        {
            buttonGroup1.clearSelection();
        }
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
        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        effectsPanel1 = new videoMixerLite.resources.EffectsPanel();

        jLabel1.setText("Channel Name:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(267, 405));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Normal");
        jRadioButton1.setAlignmentY(0.0F);
        jRadioButton1.setFocusable(false);
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton1.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton1.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton2.setText("Dissolve");
        jRadioButton2.setAlignmentY(0.0F);
        jRadioButton2.setEnabled(false);
        jRadioButton2.setFocusable(false);
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton2.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton2.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton3.setText("Darken");
        jRadioButton3.setAlignmentY(0.0F);
        jRadioButton3.setFocusable(false);
        jRadioButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton3.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton3.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton4.setText("Multiply");
        jRadioButton4.setAlignmentY(0.0F);
        jRadioButton4.setFocusable(false);
        jRadioButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton4.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton4.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton5.setText("Color Burn");
        jRadioButton5.setAlignmentY(0.0F);
        jRadioButton5.setFocusable(false);
        jRadioButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton5.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton5.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton6.setText("Linear Burn");
        jRadioButton6.setAlignmentY(0.0F);
        jRadioButton6.setEnabled(false);
        jRadioButton6.setFocusable(false);
        jRadioButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton6.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton6.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton7.setText("Darker Color");
        jRadioButton7.setAlignmentY(0.0F);
        jRadioButton7.setEnabled(false);
        jRadioButton7.setFocusable(false);
        jRadioButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton7.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton7.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton8.setText("Lighten");
        jRadioButton8.setAlignmentY(0.0F);
        jRadioButton8.setFocusable(false);
        jRadioButton8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton8.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton8.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton9.setText("Screen");
        jRadioButton9.setAlignmentY(0.0F);
        jRadioButton9.setFocusable(false);
        jRadioButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton9.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton9.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton10.setText("Color Dodge");
        jRadioButton10.setAlignmentY(0.0F);
        jRadioButton10.setFocusable(false);
        jRadioButton10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton10.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton10.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton11.setText("Linear Dodge");
        jRadioButton11.setAlignmentY(0.0F);
        jRadioButton11.setEnabled(false);
        jRadioButton11.setFocusable(false);
        jRadioButton11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton11.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton11.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton12.setText("Lighter color");
        jRadioButton12.setAlignmentY(0.0F);
        jRadioButton12.setEnabled(false);
        jRadioButton12.setFocusable(false);
        jRadioButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton12.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton12.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton13.setText("Overlay");
        jRadioButton13.setAlignmentY(0.0F);
        jRadioButton13.setFocusable(false);
        jRadioButton13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton13.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton13.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton14.setText("Soft Light");
        jRadioButton14.setAlignmentY(0.0F);
        jRadioButton14.setFocusable(false);
        jRadioButton14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton14.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton14.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton15);
        jRadioButton15.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton15.setText("Hard Light");
        jRadioButton15.setAlignmentY(0.0F);
        jRadioButton15.setFocusable(false);
        jRadioButton15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton15.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton15.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton16);
        jRadioButton16.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton16.setText("Vivid Light");
        jRadioButton16.setAlignmentY(0.0F);
        jRadioButton16.setEnabled(false);
        jRadioButton16.setFocusable(false);
        jRadioButton16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton16.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton16.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton17);
        jRadioButton17.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton17.setText("Linear Light");
        jRadioButton17.setAlignmentY(0.0F);
        jRadioButton17.setEnabled(false);
        jRadioButton17.setFocusable(false);
        jRadioButton17.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton17.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton17.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton18);
        jRadioButton18.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton18.setText("Pin Light");
        jRadioButton18.setAlignmentY(0.0F);
        jRadioButton18.setEnabled(false);
        jRadioButton18.setFocusable(false);
        jRadioButton18.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton18.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton18.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton19);
        jRadioButton19.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton19.setText("Hard Mix");
        jRadioButton19.setAlignmentY(0.0F);
        jRadioButton19.setEnabled(false);
        jRadioButton19.setFocusable(false);
        jRadioButton19.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton19.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton19.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton20);
        jRadioButton20.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton20.setText("Difference");
        jRadioButton20.setAlignmentY(0.0F);
        jRadioButton20.setFocusable(false);
        jRadioButton20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton20.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton20.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton21);
        jRadioButton21.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton21.setText("Exclusion");
        jRadioButton21.setAlignmentY(0.0F);
        jRadioButton21.setFocusable(false);
        jRadioButton21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton21.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton21.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton21ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton22);
        jRadioButton22.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton22.setText("Subtract");
        jRadioButton22.setAlignmentY(0.0F);
        jRadioButton22.setFocusable(false);
        jRadioButton22.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton22.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton22.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton22ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton23);
        jRadioButton23.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton23.setText("Divide");
        jRadioButton23.setAlignmentY(0.0F);
        jRadioButton23.setEnabled(false);
        jRadioButton23.setFocusable(false);
        jRadioButton23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton23.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton23.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton23ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton24);
        jRadioButton24.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton24.setText("Hue");
        jRadioButton24.setAlignmentY(0.0F);
        jRadioButton24.setEnabled(false);
        jRadioButton24.setFocusable(false);
        jRadioButton24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton24.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton24.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton24ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton25);
        jRadioButton25.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton25.setText("Saturation");
        jRadioButton25.setAlignmentY(0.0F);
        jRadioButton25.setEnabled(false);
        jRadioButton25.setFocusable(false);
        jRadioButton25.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton25.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton25.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton26);
        jRadioButton26.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton26.setText("Color");
        jRadioButton26.setAlignmentY(0.0F);
        jRadioButton26.setFocusable(false);
        jRadioButton26.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton26.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton26.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton27);
        jRadioButton27.setFont(new java.awt.Font("Tahoma", 0, 10));
        jRadioButton27.setText("Luminosity");
        jRadioButton27.setAlignmentY(0.0F);
        jRadioButton27.setFocusable(false);
        jRadioButton27.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton27.setMaximumSize(new java.awt.Dimension(55, 70));
        jRadioButton27.setPreferredSize(new java.awt.Dimension(55, 25));
        jRadioButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jRadioButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jRadioButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jRadioButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jRadioButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton23, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton24, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton25, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton26, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton27, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Blend", jPanel2);

        jCheckBox1.setText(" ");
        jCheckBox1.setFocusable(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText(" ");
        jCheckBox2.setFocusable(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText(" ");
        jCheckBox3.setFocusable(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText(" ");
        jCheckBox4.setFocusable(false);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText(" ");
        jCheckBox5.setFocusable(false);
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText(" ");
        jCheckBox6.setFocusable(false);
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setText(" ");
        jCheckBox7.setFocusable(false);
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setText(" ");
        jCheckBox8.setFocusable(false);
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setText("Output");
        jCheckBox9.setFocusable(false);
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox8)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mask", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
            .addComponent(effectsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(effectsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

        setChannelBlend(1);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed

        setChannelBlend(2);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed

        setChannelBlend(3);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed

        setChannelBlend(4);
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed

        setChannelBlend(5);
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed

        setChannelBlend(6);
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed

        setChannelBlend(7);
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed

        setChannelBlend(8);
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed

        setChannelBlend(9);
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed

        setChannelBlend(10);
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed

        setChannelBlend(11);
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed

        setChannelBlend(13);
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed

        setChannelBlend(12);
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed

        setChannelBlend(14);
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed

        setChannelBlend(16);
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed

        setChannelBlend(15);
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed

        setChannelBlend(17);
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed

        setChannelBlend(18);
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed

        setChannelBlend(19);
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed

        setChannelBlend(20);
    }//GEN-LAST:event_jRadioButton21ActionPerformed

    private void jRadioButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton23ActionPerformed

        setChannelBlend(22);
    }//GEN-LAST:event_jRadioButton23ActionPerformed

    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton22ActionPerformed

        setChannelBlend(21);
    }//GEN-LAST:event_jRadioButton22ActionPerformed

    private void jRadioButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton24ActionPerformed

        setChannelBlend(23);
    }//GEN-LAST:event_jRadioButton24ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed

        setChannelBlend(24);
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed

        setChannelBlend(25);
    }//GEN-LAST:event_jRadioButton26ActionPerformed

    private void jRadioButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton27ActionPerformed

        setChannelBlend(26);
    }//GEN-LAST:event_jRadioButton27ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        setChannelBlend(0);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if(jCheckBox1.isSelected())
        {
            setMaskToChannel(0);
        }
        else
        {
            resetMaskToChannel(0);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

        if(jCheckBox2.isSelected())
        {
            setMaskToChannel(1);
        }
        else
        {
            resetMaskToChannel(1);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed

        if(jCheckBox3.isSelected())
        {
            setMaskToChannel(2);
        }
        else
        {
            resetMaskToChannel(2);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed

        if(jCheckBox4.isSelected())
        {
            setMaskToChannel(3);
        }
        else
        {
            resetMaskToChannel(3);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed

        if(jCheckBox5.isSelected())
        {
            setMaskToChannel(4);
        }
        else
        {
            resetMaskToChannel(4);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed

        if(jCheckBox6.isSelected())
        {
            setMaskToChannel(5);
        }
        else
        {
            resetMaskToChannel(5);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed

        if(jCheckBox7.isSelected())
        {
            setMaskToChannel(6);
        }
        else
        {
            resetMaskToChannel(6);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed

        if(jCheckBox8.isSelected())
        {
            setMaskToChannel(7);
        }
        else
        {
            resetMaskToChannel(7);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed

        if(jCheckBox9.isSelected())
        {
            setOutputMask();
        }
        else
        {
            resetOutputMask();
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

        renameChannel(jTextField1.getText());
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost

        renameChannel(jTextField1.getText());
    }//GEN-LAST:event_jTextField1FocusLost
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private videoMixerLite.resources.EffectsPanel effectsPanel1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
