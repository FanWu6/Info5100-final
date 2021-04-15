/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Manager;

import Util.SysData;
import Util.Tool;
import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.Enterprise;
import com.neu.infofinal.bean.OrderHousework;
import com.neu.infofinal.bean.UserAccount;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dengbowen
 */
public class ViewMoveOrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHouseworkOrderPanel
     */
    UserAccount managerAccount;
    JPanel rightcontainer;
    List<OrderHousework> orderHouseworks;
    List<Employee> employeeDirectory;
    List<Enterprise> enterpriseDirectory;
    public ViewMoveOrderPanel(JPanel rightcontainer,UserAccount managerAccount,List<OrderHousework> orderHouseworks,List<Employee> employeeDirectory,List<Enterprise> enterpriseDirectory) {
        initComponents();
        this.rightcontainer = rightcontainer;
        this.managerAccount = managerAccount;
        this.employeeDirectory = employeeDirectory;
        this.enterpriseDirectory = enterpriseDirectory;
        this.orderHouseworks = orderHouseworks;
        Tool.tableStyle1(jTable1, jScrollPane1);
        Tool.tableStyle1(jTable2, jScrollPane1);
        getInfo();
        displayOrderTable();
        displayCompanyTable();
    }
    private void displayOrderTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (OrderHousework ordH : orderHouseworks) {
            if (ordH.getHouseworkOrderType() == 2) {
                if (ordH.getManagerId() == null || ordH.getManagerId() == managerAccount.getId()) {
                    Object[] row = new Object[6];
//               row[0]= SysData.getUserAccountbyID(ordH.getTenantId()).getUsername();
                    //            row[1]=SysData.ORDER_HOUSEWORK_TYPE.values()[ordH.getHouseworkOrderType()];
                    row[0] = ordH;
                    row[1] = SysData.getUserAccountbyID(ordH.getTenantId()).getUsername();
                    row[2] = "House Move";
                    row[3] = ordH.getDate();
                    row[4] = ordH.getStatus();
                    row[5] = ordH.getComment();
                    model.addRow(row);
                }
            }

        }
    }

    public void displayCompanyTable() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        for (Enterprise enterprise : enterpriseDirectory) {
            int n = 0;
            if (enterprise.getId() == 2) {
                for (Employee em : employeeDirectory) {

                    if (em.getEnterpriseId() == enterprise.getId()) {
                        n += 1;
                    }
                }

                Object[] row = new Object[2];
                row[0] = enterprise.getName();
                row[1] = n;

                model.addRow(row);

            }
        }
    }

    public void getInfo() {
      
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        assignBtn = new javax.swing.JLabel();
        assign = new javax.swing.JLabel();
        bkn = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer", "Type", "Date", "Status", "Comment"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(128, 128, 128));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(63, 164, 177));
        jTable1.setSelectionForeground(new java.awt.Color(153, 0, 204));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 860, 160));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Company", "Staffs Number"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(128, 128, 128));
        jTable2.setRowHeight(25);
        jTable2.setSelectionBackground(new java.awt.Color(63, 164, 177));
        jTable2.setSelectionForeground(new java.awt.Color(153, 0, 204));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 430, 160));

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

        bkn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/move/mainmove@0,3x.png"))); // NOI18N
        add(bkn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 40, 520, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_assignBtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assign;
    private javax.swing.JLabel assignBtn;
    private javax.swing.JLabel bkn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}