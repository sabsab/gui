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

/**
 *
 * @author User
 */
public class ChannelProperties extends javax.swing.JPanel {
    
    private Channel channel;

    /** Creates new form ChannelProperties */
    public ChannelProperties() {
        initComponents();
    }
    
    public void init(Channel c)
    {
        channel = c;
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
        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setPreferredSize(new java.awt.Dimension(267, 405));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton23, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton24, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton25, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton26, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton27, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
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
                .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(jRadioButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(98, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

        channel.blendNum = 1;
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed

        channel.blendNum = 2;
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed

        channel.blendNum = 3;
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed

        channel.blendNum = 4;
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed

        channel.blendNum = 5;
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed

        channel.blendNum = 6;
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed

        channel.blendNum = 7;
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed

        channel.blendNum = 8;
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed

        channel.blendNum = 9;
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed

        channel.blendNum = 10;
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed

        channel.blendNum = 11;
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed

        channel.blendNum = 13;
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed

        channel.blendNum = 12;
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed

        channel.blendNum = 14;
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed

        channel.blendNum = 16;
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed

        channel.blendNum = 15;
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed

        channel.blendNum = 17;
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed

        channel.blendNum = 18;
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed

        channel.blendNum = 19;
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed

        channel.blendNum = 20;
    }//GEN-LAST:event_jRadioButton21ActionPerformed

    private void jRadioButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton23ActionPerformed

        channel.blendNum = 22;
    }//GEN-LAST:event_jRadioButton23ActionPerformed

    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton22ActionPerformed

        channel.blendNum = 21;
    }//GEN-LAST:event_jRadioButton22ActionPerformed

    private void jRadioButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton24ActionPerformed

        channel.blendNum = 23;
    }//GEN-LAST:event_jRadioButton24ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed

        channel.blendNum = 24;
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed

        channel.blendNum = 25;
    }//GEN-LAST:event_jRadioButton26ActionPerformed

    private void jRadioButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton27ActionPerformed

        channel.blendNum = 26;
    }//GEN-LAST:event_jRadioButton27ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        channel.blendNum = 0;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
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
    // End of variables declaration//GEN-END:variables
}