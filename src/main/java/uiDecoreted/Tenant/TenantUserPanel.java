/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Tenant;

import Util.GlobalData;
import Util.SysData;
import Util.Tool;
import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.Enterprise;
import com.neu.infofinal.bean.House;
import com.neu.infofinal.bean.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
//import jdk.nashorn.internal.objects.Global;
import uiDecoreted.Tenant.CommentPanel;
import uiDecoreted.Tenant.TenantOrderPanel;
import uiDecoreted.Tenant.RentalListPanel;
import uiDecoreted.Tenant.ViewDetailPanel;
import uiDecoreted.Tenant.UserHomePanel;

/**
 *
 * @author wufan
 */
public class TenantUserPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form TenantUserPanel
     */
    JPanel container;
    CardLayout cardLayout;
    UserAccount userAccount;
    UserHomePanel userHomePanel;
    List<String> uiList;
//    House myhouse;
    
    public TenantUserPanel(JPanel container,UserAccount userAccount) {
        this.userAccount = userAccount;
        this.container = container;
        initComponents();
        
         //test data
         getInfo();
       
        //
        
        cardLayout = new CardLayout();
        rightjPanel.setLayout(cardLayout);
        
        uiList = new ArrayList<>();
        uiList.add("RentalListPanel");
        uiList.add("UserHomePanel");
        uiList.add("TenantOrderPanel");
        uiList.add("CommentPanel");
        uiList.add("ViewDetailPanel");
        for (int i = 0; i < uiList.size(); i++) {
            String ui = uiList.get(i);
            switch(ui){
                case "RentalListPanel":rightjPanel.add("RentalListPanel",new RentalListPanel(rightjPanel));
                    break;
                case "UserHomePanel":
                    userHomePanel = new UserHomePanel(rightjPanel,this.userAccount);
                    rightjPanel.add("UserHomePanel",userHomePanel);
                    break;
                case "TenantOrderPanel":rightjPanel.add("TenantOrderPanel",new TenantOrderPanel(rightjPanel,this.userAccount));
                    break;
                case "CommentPanel":rightjPanel.add("CommentPanel",new CommentPanel(rightjPanel));
                    break;
                case "ViewDetailPanel":rightjPanel.add("ViewDetailPanel",new ViewDetailPanel(rightjPanel,null));
                    break;
            }   
        }
        
        cardLayout.show(rightjPanel,"RentalListPanel");
        setInfo();
        
    }
    
    public void getInfo(){
        //houses
    }
    public void setInfo(){
        Employee employee = SysData.getEmployeeByUserAccountId(userAccount.getId());
        nameLabel.setText(employee.getName());
        emailLabel.setText(userAccount.getEmail());
        userPic.setIcon(new javax.swing.ImageIcon(getClass().getResource(userAccount.getHeadpic())));
        Enterprise enterprise = SysData.getEnterpriseById(employee.getEnterpriseId());
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
        rentBtn = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        userPic = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        menuBg = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightjPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightjPanel.setOpaque(false);
        rightjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(rightjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1140, 810));

        rentBtn.setBackground(new java.awt.Color(204, 204, 204));
        rentBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        rentBtn.setForeground(new java.awt.Color(204, 204, 204));
        rentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rentBtnMousePressed(evt);
            }
        });
        add(rentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, 70));

        homeBtn.setBackground(new java.awt.Color(204, 204, 204));
        homeBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(204, 204, 204));
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeBtnMousePressed(evt);
            }
        });
        add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 60));

        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backBtnMousePressed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 90, 40));

        userPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLayer/Userpic.png"))); // NOI18N
        add(userPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, 120));

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("UserName");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 160, 30));

        enterpriseLabel.setBackground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(153, 153, 153));
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel.setText("enterprise");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 160, 30));

        emailLabel.setBackground(new java.awt.Color(255, 255, 255));
        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(153, 153, 153));
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("notheastern@edu");
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 30));

        menuBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLayer/Menu1.png"))); // NOI18N
        add(menuBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 810));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Artboard5@0.75x.png"))); // NOI18N
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 810));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMousePressed
        // TODO add your handling code here:
        container.remove(this);
//        Component[] components = container.getComponents();
//        Component component = components[components.length-1];
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnMousePressed

    private void rentBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentBtnMousePressed
        // TODO add your handling code here:
        getInfo();
        cardLayout.show(rightjPanel,"RentalListPanel");
        Component currnetComponent = rightjPanel.getComponent(uiList.indexOf("RentalListPanel"));
        RentalListPanel rentalListPanel = (RentalListPanel)currnetComponent;
        rentalListPanel.displayHouseList();

    }//GEN-LAST:event_rentBtnMousePressed

    private void homeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMousePressed
        // TODO add your handling code here:
        House house = SysData.getHouseByTenantId(userAccount.getId());
        if(house==null){
            Tool.InfoString("You don't have a rental!!");
            return;
        }
        cardLayout.show(rightjPanel,"UserHomePanel");
        userHomePanel.setInfo();
    }//GEN-LAST:event_homeBtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel menuBg;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel rentBtn;
    private javax.swing.JPanel rightjPanel;
    private javax.swing.JLabel userPic;
    // End of variables declaration//GEN-END:variables
}
