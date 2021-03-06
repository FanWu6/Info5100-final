/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiExample;

import Util.SysData;
import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.Enterprise;
import com.neu.infofinal.bean.Organization;
import com.neu.infofinal.bean.User;
import com.neu.infofinal.bean.UserAccount;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wufan
 */
public class exampleFrame extends javax.swing.JFrame {
       Enterprise enterprise;
       UserAccount userAccount;
       Organization orgnization;
       Employee employee;
    /**
     * Creates new form exampleFrame
     */
    public exampleFrame() {
        initComponents();
        //test
        

    }
    
    public void refreshData(){
      employee = SysData.getEmployeeByUserAccountId(userAccount.getId());
      enterprise = SysData.getEnterpriseById(employee.getEnterpriseId());
      orgnization = SysData.getOrganizationById(employee.getOrganizationId());
    }
    
    public void populateEnterprise( ){
        DefaultTableModel model = (DefaultTableModel) EnterprisejTable.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        row[0] = enterprise.getId();
        row[1] = enterprise.getName();
        model.addRow(row);
    }
    public void populateEmployee( ){
        DefaultTableModel model = (DefaultTableModel) EmployeejTable1.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        row[0] = employee.getId();
        row[1] = employee.getName();
        model.addRow(row);
    }
    public void populateOrgan( ){
        DefaultTableModel model = (DefaultTableModel) OrganjTable.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        row[0] = orgnization.getId();
        row[1] = orgnization.getName();
        model.addRow(row);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userTextField = new javax.swing.JTextField();
        passjTextField = new javax.swing.JTextField();
        loginjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        EnterprisejTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        EmployeejTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        OrganjTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userTextField.setText("username");
        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });

        passjTextField.setText("password");

        loginjButton.setText("Login");
        loginjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjButtonActionPerformed(evt);
            }
        });

        EnterprisejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "enterprisename"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EnterprisejTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnterprisejTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(EnterprisejTable);

        EmployeejTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "employeename"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmployeejTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EmployeejTable1MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(EmployeejTable1);

        OrganjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "organizationname"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrganjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OrganjTableMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(OrganjTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginjButton)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(passjTextField)))
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(463, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(loginjButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterprisejTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterprisejTableMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EnterprisejTableMousePressed

    private void loginjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjButtonActionPerformed
        // TODO add your handling code here:
        userAccount = SysData.getUserAccount(userTextField.getText(), passjTextField.getText());
        if(userAccount!=null){
            refreshData();
            populateEnterprise();
            populateEmployee();
            populateOrgan();
        }else{
            JOptionPane.showMessageDialog(null, "Invalid", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_loginjButtonActionPerformed

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void EmployeejTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeejTable1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeejTable1MousePressed

    private void OrganjTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrganjTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrganjTableMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(exampleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exampleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exampleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exampleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exampleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmployeejTable1;
    private javax.swing.JTable EnterprisejTable;
    private javax.swing.JTable OrganjTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton loginjButton;
    private javax.swing.JTextField passjTextField;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
