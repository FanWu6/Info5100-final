/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Tenant;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author wufan
 */
public class TenantPanel2 extends javax.swing.JPanel {

    /**
     * Creates new form TenantPanel1
     */
    JPanel rightcontainer;
    public TenantPanel2(JPanel rightcontainer) {
        this.rightcontainer = rightcontainer;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JLabel();
        Backbak = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backBtnMousePressed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 710, 200, 50));

        Backbak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(Backbak, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 200, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMousePressed
        // TODO add your handling code here:
//        Component[] components = container.getComponents();
//        Component component = components[components.length-1];
        CardLayout layout = (CardLayout)rightcontainer.getLayout();
        layout.show(rightcontainer, "tP1");
    }//GEN-LAST:event_backBtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backbak;
    private javax.swing.JLabel backBtn;
    // End of variables declaration//GEN-END:variables
}
