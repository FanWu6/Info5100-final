/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Agency;

import Util.GlobalData;
import Util.SysData;
import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.Enterprise;
import com.neu.infofinal.bean.UserAccount;
import uiDecoreted.Tenant.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import uiDecoreted.Tenant.CommentPanel;
import uiDecoreted.Tenant.TenantOrderPanel;
import uiDecoreted.Tenant.RentalListPanel;
import uiDecoreted.Tenant.ViewDetailPanel;
import uiDecoreted.Tenant.UserHomePanel;

/**
 *
 * @author wufan
 */
public class AgencyPanel extends javax.swing.JPanel {

    /**
     * Creates new form TenantUserPanel
     */
    JPanel container;
    CardLayout cardLayout;
    UserAccount userAccount;
    public AgencyPanel(JPanel container,UserAccount userAccount) {
        this.container = container;
        this.userAccount = userAccount;
        initComponents();
       // getInfo();
       
        cardLayout = new CardLayout();
        rightjPanel.setLayout(cardLayout);
        rightjPanel.add("viewTenantP",new ViewTenantPanel(rightjPanel,this.userAccount));
        rightjPanel.add("viewLandLordP",new ViewLandLordPanel(rightjPanel,this.userAccount));
        cardLayout.show(rightjPanel,"viewTenantP");
        setInfo();
    }
    public void getInfo(){
        //useraccounts
        
        //houses
        //houses = GlobalData.getAllHouse();
        
    }
    public void setInfo(){
        Employee employee=SysData.getEmployeeByUserAccountId(userAccount.getId());
        Enterprise enterprise=SysData.getEnterpriseById(employee.getEnterpriseId());
        nameLabel.setText(employee.getName());
        emailLabel.setText(userAccount.getEmail());
        userPic.setIcon(new javax.swing.ImageIcon(getClass().getResource(userAccount.getHeadpic())));
        enterpriseLabel.setText(enterprise.getName());
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
        enterpriseLabel = new javax.swing.JLabel();
        ownerBtn = new javax.swing.JLabel();
        tenantBtn = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        userPic = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        menuBg = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightjPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightjPanel.setOpaque(false);
        rightjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(rightjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1140, 810));

        enterpriseLabel.setBackground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(153, 153, 153));
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel.setText("enterprise");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 160, 30));

        ownerBtn.setBackground(new java.awt.Color(204, 204, 204));
        ownerBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        ownerBtn.setForeground(new java.awt.Color(204, 204, 204));
        ownerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ownerBtnMousePressed(evt);
            }
        });
        add(ownerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 60));

        tenantBtn.setBackground(new java.awt.Color(204, 204, 204));
        tenantBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        tenantBtn.setForeground(new java.awt.Color(204, 204, 204));
        tenantBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tenantBtnMousePressed(evt);
            }
        });
        add(tenantBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 80, 50));

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

        emailLabel.setBackground(new java.awt.Color(255, 255, 255));
        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(153, 153, 153));
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("notheastern@edu");
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 30));

        menuBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLayer/Menu4.png"))); // NOI18N
        add(menuBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 810));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Artboard6@0.75x.png"))); // NOI18N
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

    private void ownerBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ownerBtnMousePressed
        // TODO add your handling code here:
        cardLayout.show(rightjPanel,"viewLandLordP");
    }//GEN-LAST:event_ownerBtnMousePressed

    private void tenantBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenantBtnMousePressed
        // TODO add your handling code here:
        cardLayout.show(rightjPanel,"viewTenantP");
    }//GEN-LAST:event_tenantBtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel menuBg;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel ownerBtn;
    private javax.swing.JPanel rightjPanel;
    private javax.swing.JLabel tenantBtn;
    private javax.swing.JLabel userPic;
    // End of variables declaration//GEN-END:variables
}
