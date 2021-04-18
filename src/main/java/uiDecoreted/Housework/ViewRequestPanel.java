/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Housework;
import Util.SysData;
import Util.Tool;
import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.Enterprise;
import com.neu.infofinal.bean.Order;
import com.neu.infofinal.bean.OrderHousework;
import com.neu.infofinal.bean.UserAccount;
import com.neu.infofinal.mapper.OrderHouseworkMapper;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import uiDecoreted.Tenant.TenantUserPanel;
import uiDecoreted.Tenant.ViewDetailPanel;

/**
 *
 * @author Tengfei
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
    public ViewRequestPanel(JPanel rightcontainer,UserAccount userAccount) {
        initComponents();
        this.rightcontainer = rightcontainer;
        this.userAccount=userAccount;
        Tool.tableStyle1(tblHouseworkAll, jScrollPane1);
        Tool.tableStyle1(tblHouseworkMy2, jScrollPane3);     
        getInfo();
        setInfo();
        refreshAllTable();

    }
    
    public void getInfo() {
        orderHouseworks = SysData.getAllOrderHouseworks(); 
        this.employee=SysData.getEmployeeByUserAccountId(userAccount.getId());
        this.enterprise=SysData.getEnterpriseById(employee.getEnterpriseId());
    }
    
    public void setInfo() {
        lblCompany.setText(this.enterprise.getName());
//        roomnameLabel.setText(house.getName());
//        housePic.setIcon(new javax.swing.ImageIcon(getClass().getResource(house.getImage()))); // NOI18N
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always[动画表情]
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCompany = new javax.swing.JLabel();
        assigntome1 = new javax.swing.JLabel();
        assigntomebtn = new javax.swing.JLabel();
        assigntome = new javax.swing.JLabel();
        completedBtn = new javax.swing.JLabel();
        completed = new javax.swing.JLabel();
        detailBtn = new javax.swing.JLabel();
        detailBack = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHouseworkMy2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHouseworkAll = new javax.swing.JTable();
        bkn = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        tblHouseworkMy2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Customer", "Type", "Date", "Status", "Comment"
            }
        ));
        jScrollPane3.setViewportView(tblHouseworkMy2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 850, 190));

        tblHouseworkAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Customer", "Type", "Date", "Status", "Comment"
            }
        ));
        jScrollPane1.setViewportView(tblHouseworkAll);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 850, 160));

        bkn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/housework/main@0,3x.png"))); // NOI18N
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
        OrderHousework orderHousework = (OrderHousework)tblHouseworkAll.getValueAt(row,0);
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
        OrderHousework orderHousework = (OrderHousework)tblHouseworkMy2.getValueAt(row,0);
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
        OrderHousework orderHousework = (OrderHousework)tblHouseworkMy2.getValueAt(row,0);
        int tenantAccount=orderHousework.getTenantId();
        rightcontainer.add("ViewHouseWorkOrderDetailPanel",new ViewHouseWorkOrderDetailPanel(rightcontainer,orderHousework,tenantAccount));  
        CardLayout cardLayout = (CardLayout)rightcontainer.getLayout();
        cardLayout.show(rightcontainer, "ViewHouseWorkOrderDetailPanel");
    }//GEN-LAST:event_detailBtnMousePressed

    private void lblCompanyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompanyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCompanyMousePressed


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

    private void refreshTable1() {
        DefaultTableModel model = (DefaultTableModel) tblHouseworkAll.getModel();
        model.setRowCount(0);
        for(OrderHousework ordH:orderHouseworks){
            if(ordH.getHouseworkOrderType()==SysData.ORDER_HOUSEWORK_TYPE.CLEAN.getIndex()
                    &&ordH.getEnterpriseId()==this.enterprise.getId()
                    &&ordH.getStatus()==SysData.ORDER_STATUS_TYPE.PROCESS.getStatus()){
                Object[] row = new Object[6];
                String s="";
                if(SysData.ORDER_HOUSEWORK_TYPE.CLEAN.getIndex()==ordH.getHouseworkOrderType()){
                    s=SysData.ORDER_HOUSEWORK_TYPE.CLEAN.name();
                }else if(SysData.ORDER_HOUSEWORK_TYPE.MAINTAIN.getIndex() == ordH.getHouseworkOrderType()){
                    s = SysData.ORDER_HOUSEWORK_TYPE.MAINTAIN.name();
                }else if(SysData.ORDER_HOUSEWORK_TYPE.MOVE.getIndex() == ordH.getHouseworkOrderType()){
                    s = SysData.ORDER_HOUSEWORK_TYPE.MOVE.name();
                }
                row[0]=ordH;
                row[1]=ordH.getTenantId();
                row[2]=s;
                row[3]=ordH.getDate();
                row[4]=ordH.getStatus();
                row[5]=ordH.getComment();
                model.addRow(row);
            }

        }
    }

    private void refreshTable2() {
        DefaultTableModel model = (DefaultTableModel) tblHouseworkMy2.getModel();
        model.setRowCount(0);
        for(OrderHousework ordH:orderHouseworks){
            
            if(ordH.getHouseworkOrderType()==SysData.ORDER_HOUSEWORK_TYPE.CLEAN.getIndex()&&ordH.getWorkderId()==employee.getId()){
                Object[] row = new Object[6];
                row[0]=ordH;
                row[1]=ordH.getTenantId();
                row[2]="House Cleanning";
                row[3]=ordH.getDate();
                row[4]=ordH.getStatus();
                row[5]=ordH.getComment();
                model.addRow(row);
            }

        }
    }

    private void refreshAllTable() {
        refreshTable1();
        refreshTable2();
    }
}
