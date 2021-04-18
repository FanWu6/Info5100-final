/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Admin;

import com.neu.infofinal.bean.UserAccount;
import javax.swing.JPanel;
import uiDecoreted.ServiceAdmin.*;

/**
 *
 * @author Dengbowen
 */
public class OrganizationPanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkPanel
     */
    UserAccount userAccount;
    JPanel rightcontainer;
    public OrganizationPanel(JPanel rightcontainer,UserAccount userAccount) {
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
        organizationtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "Organization"
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

        organizationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationtxtActionPerformed(evt);
            }
        });
        add(organizationtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 240, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Organization Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void completedBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedBtnMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_completedBtnMousePressed

    private void organizationtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationtxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel completed;
    private javax.swing.JLabel completedBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField organizationtxt;
    // End of variables declaration//GEN-END:variables
}
