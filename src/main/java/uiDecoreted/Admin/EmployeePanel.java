/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Admin;

import com.neu.infofinal.bean.UserAccount;
import javax.swing.JPanel;


/**
 *
 * @author Dengbowen
 */
public class EmployeePanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkPanel
     */
    UserAccount userAccount;
    JPanel rightcontainer;
    public EmployeePanel(JPanel rightcontainer,UserAccount userAccount) {
        initComponents();
        this.rightcontainer=rightcontainer;
        this.userAccount = userAccount;
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
        completedBtn = new javax.swing.JLabel();
        completed = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JTextField();
        usernametxt = new javax.swing.JTextField();
        employeetxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        organizationcombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 850, 160));

        completedBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        completedBtn.setForeground(new java.awt.Color(255, 255, 255));
        completedBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        completedBtn.setText("Add");
        completedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                completedBtnMousePressed(evt);
            }
        });
        add(completedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, 200, 50));

        completed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(completed, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 660, 200, 70));

        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });
        add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 240, 30));

        usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxtActionPerformed(evt);
            }
        });
        add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 240, 30));

        employeetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeetxtActionPerformed(evt);
            }
        });
        add(employeetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 240, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Employee Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Organization:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, 30));

        organizationcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(organizationcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 240, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Employee UserName:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Employee Password:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void completedBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedBtnMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_completedBtnMousePressed

    private void employeetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeetxtActionPerformed

    private void usernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxtActionPerformed

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel completed;
    private javax.swing.JLabel completedBtn;
    private javax.swing.JTextField employeetxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> organizationcombo;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}