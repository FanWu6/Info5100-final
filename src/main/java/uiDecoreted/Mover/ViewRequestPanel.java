/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Mover;
import Util.SysData;
import uiDecoreted.Housework.*;
import Util.Tool;
import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.Enterprise;
import com.neu.infofinal.bean.OrderHousework;
import com.neu.infofinal.bean.UserAccount;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dengbowen
 */
public class ViewRequestPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRequestPanel
     */
    JPanel rightcontainer;
    List<OrderHousework> orderHouseworks;
    UserAccount userAccount;
    Employee employee;
    Enterprise enterprise;
    boolean[] process = {false, false, false, false};
    int prevRow = -1;
    public ViewRequestPanel(JPanel rightcontainer,UserAccount userAccount) {
        initComponents();
        this.rightcontainer = rightcontainer;
        this.userAccount = userAccount;
        Tool.tableStyle1(tblHouseworkAll, jScrollPane1);
        Tool.tableStyle1(tblHouseworkMy2, jScrollPane3);
        getInfo();
        setInfo();
        refreshAllTable();
        try {
            prevRow = tblHouseworkMy2.getSelectedRow();
        } catch (Exception ex) {

        }
        setCompleteButton(process);
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
        tblHouseworkAll = new javax.swing.JTable();
        lblCompany = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHouseworkMy2 = new javax.swing.JTable();
        assigntome1 = new javax.swing.JLabel();
        assigntomebtn = new javax.swing.JLabel();
        assigntome = new javax.swing.JLabel();
        completedBtn = new javax.swing.JLabel();
        completed = new javax.swing.JLabel();
        detailBtn = new javax.swing.JLabel();
        detailBack = new javax.swing.JLabel();
        bkn = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblHouseworkAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Customer", "Type", "Date", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHouseworkAll);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 850, 160));

        lblCompany.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        lblCompany.setForeground(new java.awt.Color(255, 255, 255));
        lblCompany.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompany.setText("Company");
        lblCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCompanyMousePressed(evt);
            }
        });
        add(lblCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 200, 50));

        tblHouseworkMy2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Customer", "Type", "Date", "Status", "Comment", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHouseworkMy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblHouseworkMy2MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblHouseworkMy2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 850, 190));

        assigntome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/White1.png"))); // NOI18N
        add(assigntome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 200, 70));

        assigntomebtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        assigntomebtn.setForeground(new java.awt.Color(255, 255, 255));
        assigntomebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assigntomebtn.setText("Assign to me");
        assigntomebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                assigntomebtnMousePressed(evt);
            }
        });
        add(assigntomebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 200, 50));

        assigntome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(assigntome, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 200, 70));

        completedBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        completedBtn.setForeground(new java.awt.Color(255, 255, 255));
        completedBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        completedBtn.setText("Completed");
        completedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                completedBtnMousePressed(evt);
            }
        });
        add(completedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 690, 200, 50));

        completed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(completed, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 680, 200, 70));

        detailBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        detailBtn.setForeground(new java.awt.Color(255, 255, 255));
        detailBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detailBtn.setText("Detail");
        detailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                detailBtnMousePressed(evt);
            }
        });
        add(detailBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, 200, 50));

        detailBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(detailBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 680, 200, 70));

        bkn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/move/mainmove@0,3x.png"))); // NOI18N
        add(bkn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 40, 520, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void assigntomebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assigntomebtnMousePressed
        // TODO add your handling code here:
        int row = tblHouseworkAll.getSelectedRow();
        //        System.out.println(row);
        if (row < 0) {
            Tool.InfoString("please select a row!");
            return;
        }
        OrderHousework orderHousework = (OrderHousework) tblHouseworkAll.getValueAt(row, 0);
        orderHousework.setWorkderId(employee.getId());
        orderHousework.setStatus(String.valueOf(SysData.ORDER_STATUS_TYPE.PROCESS.getStatus()));
        orderHousework.setEnterpriseId(employee.getEnterpriseId());
        SysData.updateOrderHousework(orderHousework);
        refreshAllTable();
    }//GEN-LAST:event_assigntomebtnMousePressed

    private void completedBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedBtnMousePressed
        // TODO add your handling code here:
        int row = tblHouseworkMy2.getSelectedRow();
        //        System.out.println(row);
        if (row < 0) {
            Tool.InfoString("please select a row!");
            return;
        }
        OrderHousework orderHousework = (OrderHousework) tblHouseworkMy2.getValueAt(row, 0);
        if (orderHousework.getStatus().equals(SysData.ORDER_STATUS_TYPE.FINISH.getStatus())) {
            Tool.InfoString("No need to complete twice!");
            return;
        }
        orderHousework.setStatus(String.valueOf(SysData.ORDER_STATUS_TYPE.FINISH.getStatus()));
        SysData.updateOrderHousework(orderHousework);
        refreshAllTable();
    }//GEN-LAST:event_completedBtnMousePressed

    private void detailBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailBtnMousePressed
        // TODO add your handling code here:
        
        int row = tblHouseworkMy2.getSelectedRow();
        //        System.out.println(row);
        if (row < 0) {
            Tool.InfoString("please select a row in my housework order!");
            return;
        }
        OrderHousework orderHousework = (OrderHousework) tblHouseworkMy2.getValueAt(row, 0);
        int tenantAccount = orderHousework.getTenantId();
        rightcontainer.add("ViewMoveOrderDetailPanel", new ViewMoveOrderDetailPanel(rightcontainer, orderHousework, tenantAccount,process));
        CardLayout cardLayout = (CardLayout) rightcontainer.getLayout();
        cardLayout.show(rightcontainer, "ViewMoveOrderDetailPanel");
    }//GEN-LAST:event_detailBtnMousePressed

    private void lblCompanyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompanyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCompanyMousePressed

    private void tblHouseworkMy2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHouseworkMy2MousePressed
        // TODO add your handling code here:
        int row = tblHouseworkMy2.getSelectedRow();
        //        System.out.println(row);
        if (row < 0) {
            Tool.InfoString("please select a row in my housework order!");
            return;
        }
        OrderHousework orderHousework = (OrderHousework) tblHouseworkMy2.getValueAt(row, 0);
        int tenantAccount = orderHousework.getTenantId();
        if (prevRow == -1) {
            prevRow = row;
        }
        if (prevRow != -1 && prevRow != row) {
            prevRow = tenantAccount;
            for (int i = 0; i < process.length; i++) {
                process[i] = false;
            }
        }
        setCompleteButton(process);
    }//GEN-LAST:event_tblHouseworkMy2MousePressed
    public void getInfo() {
        orderHouseworks = SysData.getAllOrderHouseworks();
        this.employee = SysData.getEmployeeByUserAccountId(userAccount.getId());
        this.enterprise = SysData.getEnterpriseById(employee.getEnterpriseId());
    }

    public void setInfo() {
        lblCompany.setText(this.enterprise.getName());
//        roomnameLabel.setText(house.getName());
//        housePic.setIcon(new javax.swing.ImageIcon(getClass().getResource(house.getImage()))); // NOI18N
    }
    
    private void refreshTable1() {
        DefaultTableModel model = (DefaultTableModel) tblHouseworkAll.getModel();
        model.setRowCount(0);
        for (OrderHousework ordH : orderHouseworks) {
            if (ordH.getHouseworkOrderType() == SysData.ORDER_HOUSEWORK_TYPE.MOVE.getIndex()
                    && ordH.getEnterpriseId() == this.enterprise.getId()
                    &&(!ordH.getStatus().equals(SysData.ORDER_STATUS_TYPE.FINISH.getStatus())&&!ordH.getStatus().equals(SysData.ORDER_STATUS_TYPE.PROCESS.getStatus()))){
                Object[] row = new Object[6];
                String s = "";
                if (SysData.ORDER_HOUSEWORK_TYPE.CLEAN.getIndex() == ordH.getHouseworkOrderType()) {
                    s = SysData.ORDER_HOUSEWORK_TYPE.CLEAN.name();
                } else if (SysData.ORDER_HOUSEWORK_TYPE.MAINTAIN.getIndex() == ordH.getHouseworkOrderType()) {
                    s = SysData.ORDER_HOUSEWORK_TYPE.MAINTAIN.name();
                } else if (SysData.ORDER_HOUSEWORK_TYPE.MOVE.getIndex() == ordH.getHouseworkOrderType()) {
                    s = SysData.ORDER_HOUSEWORK_TYPE.MOVE.name();
                }
                row[0] = ordH;
                row[1] = ordH.getTenantId();
                row[2] = s;
                row[3] = ordH.getDate();
                row[4] = ordH.getStatus();
                row[5] = ordH.getMessage();
                model.addRow(row);
            }

        }
    }
    private void refreshTable2() {
        DefaultTableModel model = (DefaultTableModel) tblHouseworkMy2.getModel();
        model.setRowCount(0);
        for (OrderHousework ordH : orderHouseworks) {

            if (ordH.getHouseworkOrderType() == SysData.ORDER_HOUSEWORK_TYPE.MOVE.getIndex() && ordH.getWorkderId() == employee.getId()) {
                Object[] row = new Object[7];
                row[0] = ordH;
                row[1] = ordH.getTenantId();
                row[2] = "Mover";
                row[3] = ordH.getDate();
                row[4] = ordH.getStatus();
                row[5] = ordH.getComment();
                row[6] = ordH.getMessage();
                model.addRow(row);
            }

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assigntome;
    private javax.swing.JLabel assigntome1;
    private javax.swing.JLabel assigntomebtn;
    private javax.swing.JLabel bkn;
    private javax.swing.JLabel completed;
    private javax.swing.JLabel completedBtn;
    private javax.swing.JLabel detailBack;
    private javax.swing.JLabel detailBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JTable tblHouseworkAll;
    private javax.swing.JTable tblHouseworkMy2;
    // End of variables declaration//GEN-END:variables

    private void refreshAllTable() {
        refreshTable1();
        refreshTable2();
    }

    public void setCompleteButton(boolean[] process) {
        boolean flag = true;
        for (boolean b : process) {
            if (b == false) {
                flag = false;
                completedBtn.setVisible(false);
                completed.setVisible(false);
                return;
            }
        }
        if (flag == true) {
            completedBtn.setVisible(true);
            completed.setVisible(true);
        }
    }
}
