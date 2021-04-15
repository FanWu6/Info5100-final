/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Manager;

import Util.GlobalData;
import Util.SysData;
import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.Enterprise;
import com.neu.infofinal.bean.OrderHousework;
import com.neu.infofinal.bean.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JPanel;


/**
 *
 * @author wufan
 */
public class ManagerPanel extends javax.swing.JPanel {

    /**
     * Creates new form TenantUserPanel
     */
    UserAccount userAccount;
    JPanel container;
    CardLayout cardLayout;
    List<OrderHousework> orderHouseworks;
    List<Employee> employeeDirectory;
    List<Enterprise> enterpriseDirectory;
    public ManagerPanel(JPanel container,UserAccount userAccount) {
        this.container = container;
        this.userAccount = userAccount;
        initComponents();
        getInfo();
        
        cardLayout = new CardLayout();
        rightjPanel.setLayout(cardLayout);
        rightjPanel.add("viewHouseworkOrderP",new ViewHouseworkOrderPanel(rightjPanel,this.userAccount,this.orderHouseworks,this.employeeDirectory,this.enterpriseDirectory));
        rightjPanel.add("viewMaintenanceOrderP",new ViewMaintenanceOrderPanel(rightjPanel,this.userAccount,this.orderHouseworks,this.employeeDirectory,this.enterpriseDirectory));
        rightjPanel.add("viewMoveOrderP",new ViewMoveOrderPanel(rightjPanel,this.userAccount,this.orderHouseworks,this.employeeDirectory,this.enterpriseDirectory));
        cardLayout.show(rightjPanel,"viewHouseworkOrderP");
        
        setInfo();
    }
    public void getInfo(){
        orderHouseworks = SysData.getAllOrderHouseworks();
        enterpriseDirectory = SysData.getEnterpriseDirectory();
        employeeDirectory = SysData.getEmployeeDirectory();
        
    }
    public void setInfo(){
        nameLabel.setText(userAccount.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightjPanel = new javax.swing.JPanel();
        houseworkBtn = new javax.swing.JLabel();
        maintenanceBtn = new javax.swing.JLabel();
        moveBtn = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        userPic = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        menuBg = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightjPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightjPanel.setOpaque(false);
        rightjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(rightjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1140, 810));

        houseworkBtn.setBackground(new java.awt.Color(204, 204, 204));
        houseworkBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        houseworkBtn.setForeground(new java.awt.Color(204, 204, 204));
        houseworkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                houseworkBtnMousePressed(evt);
            }
        });
        add(houseworkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 100, 70));

        maintenanceBtn.setBackground(new java.awt.Color(204, 204, 204));
        maintenanceBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        maintenanceBtn.setForeground(new java.awt.Color(204, 204, 204));
        maintenanceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                maintenanceBtnMousePressed(evt);
            }
        });
        add(maintenanceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 90, 60));

        moveBtn.setBackground(new java.awt.Color(204, 204, 204));
        moveBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        moveBtn.setForeground(new java.awt.Color(204, 204, 204));
        moveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveBtnMousePressed(evt);
            }
        });
        add(moveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 100, 70));

        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backBtnMousePressed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 90, 40));

        userPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLayer/Userpic.png"))); // NOI18N
        add(userPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, 120));

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("UserName");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 160, 30));

        nameLabel1.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel1.setForeground(new java.awt.Color(153, 153, 153));
        nameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel1.setText("notheastern@edu");
        add(nameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 30));

        menuBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLayer/Menu3.png"))); // NOI18N
        add(menuBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 810));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Artboard3@0.75x.png"))); // NOI18N
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 810));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMousePressed
        // TODO add your handling code here:
        container.remove(this);
        Component[] components = container.getComponents();
        Component component = components[components.length-1];
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnMousePressed

    private void houseworkBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_houseworkBtnMousePressed
        // TODO add your handling code here:
        cardLayout.show(rightjPanel,"viewHouseworkOrderP");
    }//GEN-LAST:event_houseworkBtnMousePressed

    private void maintenanceBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maintenanceBtnMousePressed
        // TODO add your handling code here:
        cardLayout.show(rightjPanel,"viewMaintenanceOrderP");
    }//GEN-LAST:event_maintenanceBtnMousePressed

    private void moveBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveBtnMousePressed
        // TODO add your handling code here:
        cardLayout.show(rightjPanel,"viewMoveOrderP");
    }//GEN-LAST:event_moveBtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel houseworkBtn;
    private javax.swing.JLabel maintenanceBtn;
    private javax.swing.JLabel menuBg;
    private javax.swing.JLabel moveBtn;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JPanel rightjPanel;
    private javax.swing.JLabel userPic;
    // End of variables declaration//GEN-END:variables
}
