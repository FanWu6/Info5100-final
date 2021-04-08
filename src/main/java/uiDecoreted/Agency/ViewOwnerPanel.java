/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Agency;

import javax.swing.JPanel;

/**
 *
 * @author Dengbowen
 */
public class ViewOwnerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewTenantPanel
     */
    JPanel rightcontainer;
    public ViewOwnerPanel(JPanel rightcontainer) {
        initComponents();
        this.rightcontainer=rightcontainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        acceptBtn = new javax.swing.JLabel();
        accept = new javax.swing.JLabel();
        refusebtn = new javax.swing.JLabel();
        refuse = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(128, 128, 128));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(63, 164, 177));
        jTable1.setSelectionForeground(new java.awt.Color(153, 0, 204));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 850, -1));

        acceptBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        acceptBtn.setForeground(new java.awt.Color(255, 255, 255));
        acceptBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acceptBtn.setText("Accept");
        acceptBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                acceptBtnMousePressed(evt);
            }
        });
        add(acceptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 690, 200, 50));

        accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 680, 200, 70));

        refusebtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        refusebtn.setForeground(new java.awt.Color(255, 255, 255));
        refusebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refusebtn.setText("Refuse");
        refusebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                refusebtnMousePressed(evt);
            }
        });
        add(refusebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 200, 50));

        refuse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(refuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 680, 200, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void acceptBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_acceptBtnMousePressed

    private void refusebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refusebtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_refusebtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accept;
    private javax.swing.JLabel acceptBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel refuse;
    private javax.swing.JLabel refusebtn;
    // End of variables declaration//GEN-END:variables
}
