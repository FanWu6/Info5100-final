/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Mover;

import Util.SysData;
import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.Enterprise;
import com.neu.infofinal.bean.UserAccount;
import uiDecoreted.Housework.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;


/**
 *
 * @author wufan
 */
public class MovePanel extends javax.swing.JPanel {

    /**
     * Creates new form TenantUserPanel
     */
    JPanel container;
    CardLayout cardLayout;
    UserAccount userAccount;

    public MovePanel(JPanel container,UserAccount userAccount) {
        this.container = container;
        this.userAccount=userAccount;
        initComponents();
        
        cardLayout = new CardLayout();
        rightjPanel.setLayout(cardLayout);
        rightjPanel.add("ViewRequestPanel",new ViewRequestPanel(rightjPanel,userAccount));
        cardLayout.show(rightjPanel,"ViewRequestPanel");
        Employee employee=SysData.getEmployeeByUserAccountId(userAccount.getId());
        Enterprise enterprise=SysData.getEnterpriseById(employee.getEnterpriseId());
        nameLabel.setText(userAccount.getUsername());
        nameLabel1.setText(userAccount.getEmail());
        nameLabel2.setText(enterprise.getName());
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
        nameLabel2 = new javax.swing.JLabel();
        ownerBtn = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
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

        nameLabel2.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel2.setForeground(new java.awt.Color(153, 153, 153));
        nameLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel2.setText("company");
        add(nameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 160, 30));

        ownerBtn.setBackground(new java.awt.Color(204, 204, 204));
        ownerBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        ownerBtn.setForeground(new java.awt.Color(204, 204, 204));
        ownerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ownerBtnMousePressed(evt);
            }
        });
        add(ownerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, 70));

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

        menuBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLayer/Menu2.png"))); // NOI18N
        add(menuBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 810));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Artboard 1@0.75x.png"))); // NOI18N
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
      //  cardLayout.show(rightjPanel,"viewOwnerP");
    }//GEN-LAST:event_ownerBtnMousePressed

    private void homeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMousePressed
        // TODO add your handling code here:
        cardLayout.show(rightjPanel,"ViewRequestPanel");
    }//GEN-LAST:event_homeBtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel menuBg;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel ownerBtn;
    private javax.swing.JPanel rightjPanel;
    private javax.swing.JLabel userPic;
    // End of variables declaration//GEN-END:variables
}
