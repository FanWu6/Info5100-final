/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Admin;

import javax.swing.JPanel;

/**
 *
 * @author Dengbowen
 */
public class ViewMaintenanceOrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHouseworkOrderPanel
     */
    JPanel rightcontainer;
    public ViewMaintenanceOrderPanel(JPanel rightcontainer) {
        initComponents();
        this.rightcontainer = rightcontainer;
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
        enterpriseComboBox = new javax.swing.JComboBox<>();
        assignBtn = new javax.swing.JLabel();
        assign = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
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

        enterpriseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 600, -1, -1));

        assignBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        assignBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignBtn.setText("Assign");
        assignBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                assignBtnMousePressed(evt);
            }
        });
        add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 690, 200, 50));

        assign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(assign, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 680, 200, 70));

        jLabel1.setText("Maintenance");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_assignBtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assign;
    private javax.swing.JLabel assignBtn;
    private javax.swing.JComboBox<String> enterpriseComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
