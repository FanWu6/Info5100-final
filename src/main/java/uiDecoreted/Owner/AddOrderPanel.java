/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Owner;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Dengbowen
 */
public class AddOrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddOrderPanel
     */
    JPanel rightcontainer;
    public AddOrderPanel(JPanel rightcontainer) {
        initComponents();
        this.rightcontainer = rightcontainer;
         addresstxt.setBackground(new Color(0,0,0,0));
         layouttxt.setBackground(new Color(0,0,0,0));
         orientationtxt.setBackground(new Color(0,0,0,0));
         pricetxt.setBackground(new Color(0,0,0,0));
         spacetxt.setBackground(new Color(0,0,0,0));
         storeytxt.setBackground(new Color(0,0,0,0));
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        housepic = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        orientationtxt = new javax.swing.JTextField();
        storeytxt = new javax.swing.JTextField();
        spacetxt = new javax.swing.JTextField();
        layouttxt = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        address1 = new javax.swing.JLabel();
        address2 = new javax.swing.JLabel();
        address5 = new javax.swing.JLabel();
        address3 = new javax.swing.JLabel();
        address4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        Backbak = new javax.swing.JLabel();
        submitBtn = new javax.swing.JLabel();
        submit = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();
        line2 = new javax.swing.JLabel();
        line3 = new javax.swing.JLabel();
        line4 = new javax.swing.JLabel();
        line5 = new javax.swing.JLabel();
        line6 = new javax.swing.JLabel();
        line7 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        housepic.setText("housepic");
        add(housepic, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 170, 110));

        addresstxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        addresstxt.setForeground(new java.awt.Color(153, 153, 153));
        addresstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addresstxt.setText("Address");
        addresstxt.setToolTipText("");
        addresstxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });
        add(addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 460, 40));

        pricetxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        pricetxt.setForeground(new java.awt.Color(153, 153, 153));
        pricetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pricetxt.setText("Price");
        pricetxt.setToolTipText("");
        pricetxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pricetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricetxtActionPerformed(evt);
            }
        });
        add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 460, 40));

        orientationtxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        orientationtxt.setForeground(new java.awt.Color(153, 153, 153));
        orientationtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        orientationtxt.setText("Orientation");
        orientationtxt.setToolTipText("");
        orientationtxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        orientationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orientationtxtActionPerformed(evt);
            }
        });
        add(orientationtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 460, 40));

        storeytxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        storeytxt.setForeground(new java.awt.Color(153, 153, 153));
        storeytxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        storeytxt.setText("Storey");
        storeytxt.setToolTipText("");
        storeytxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        storeytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeytxtActionPerformed(evt);
            }
        });
        add(storeytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 460, 40));

        spacetxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        spacetxt.setForeground(new java.awt.Color(153, 153, 153));
        spacetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        spacetxt.setText("Space");
        spacetxt.setToolTipText("");
        spacetxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        spacetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spacetxtActionPerformed(evt);
            }
        });
        add(spacetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 460, 40));

        layouttxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        layouttxt.setForeground(new java.awt.Color(153, 153, 153));
        layouttxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        layouttxt.setText("Layout");
        layouttxt.setToolTipText("");
        layouttxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        layouttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layouttxtActionPerformed(evt);
            }
        });
        add(layouttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 460, 40));

        address.setText("Address");
        add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        address1.setText("Space");
        add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        address2.setText("Price");
        add(address2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        address5.setText("Storey");
        add(address5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        address3.setText("Layout");
        add(address3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        address4.setText("Orientation");
        add(address4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        backBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backBtnMousePressed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, 50));

        Backbak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(Backbak, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, 70));

        submitBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submitBtn.setText("Submit");
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submitBtnMousePressed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 700, 200, 50));

        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, 200, 70));

        line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register/Line.png"))); // NOI18N
        add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, -1, 50));

        line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register/Line.png"))); // NOI18N
        add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, 50));

        line3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register/Line.png"))); // NOI18N
        add(line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, 50));

        line4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register/Line.png"))); // NOI18N
        add(line4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, 50));

        line5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register/Line.png"))); // NOI18N
        add(line5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, 50));

        line6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register/Line.png"))); // NOI18N
        add(line6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, 50));

        line7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register/Line.png"))); // NOI18N
        add(line7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMousePressed
        // TODO add your handling code here:
        //        Component[] components = container.getComponents();
        //        Component component = components[components.length-1];
        CardLayout layout = (CardLayout)rightcontainer.getLayout();
        layout.show(rightcontainer, "ownerRentP");
    }//GEN-LAST:event_backBtnMousePressed

    private void submitBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnMousePressed

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtActionPerformed

    private void pricetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricetxtActionPerformed

    private void orientationtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orientationtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orientationtxtActionPerformed

    private void storeytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storeytxtActionPerformed

    private void spacetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spacetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spacetxtActionPerformed

    private void layouttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layouttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_layouttxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backbak;
    private javax.swing.JLabel address;
    private javax.swing.JLabel address1;
    private javax.swing.JLabel address2;
    private javax.swing.JLabel address3;
    private javax.swing.JLabel address4;
    private javax.swing.JLabel address5;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel housepic;
    private javax.swing.JTextField layouttxt;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel line2;
    private javax.swing.JLabel line3;
    private javax.swing.JLabel line4;
    private javax.swing.JLabel line5;
    private javax.swing.JLabel line6;
    private javax.swing.JLabel line7;
    private javax.swing.JTextField orientationtxt;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField spacetxt;
    private javax.swing.JTextField storeytxt;
    private javax.swing.JLabel submit;
    private javax.swing.JLabel submitBtn;
    // End of variables declaration//GEN-END:variables
}
