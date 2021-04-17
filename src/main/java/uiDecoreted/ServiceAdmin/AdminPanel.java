/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.ServiceAdmin;

import com.neu.infofinal.bean.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
/**
 *
 * @author Dengbowen
 */
public class AdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysadminPanel
     */
    JPanel container;
    CardLayout cardLayout;
    UserAccount userAccount;
    public AdminPanel(JPanel container,UserAccount userAccount) {
        this.container = container;
        this.userAccount = userAccount;
        
        initComponents();
        cardLayout = new CardLayout();
        rightjPanel.setLayout(cardLayout);
        rightjPanel.add("EmployeeP",new EmployeePanel(rightjPanel,this.userAccount));
        rightjPanel.add("OrganizationP",new OrganizationPanel(rightjPanel,this.userAccount));
        cardLayout.show(rightjPanel,"EmployeeP");
        setInfo();
    }
    public void setInfo(){
        nameLabel.setText(userAccount.getUsername());
        emailLabel.setText(userAccount.getEmail());
        userPic.setText(userAccount.getHeadpic());
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
        employee = new javax.swing.JLabel();
        organization = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        userPic = new javax.swing.JLabel();
        menubg = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1440, 810));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightjPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightjPanel.setOpaque(false);
        rightjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(rightjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1130, 810));

        employee.setFont(new java.awt.Font("Gujarati Sangam MN", 0, 15)); // NOI18N
        employee.setForeground(new java.awt.Color(153, 153, 153));
        employee.setText("Manage Employee");
        employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                employeeMousePressed(evt);
            }
        });
        add(employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        organization.setFont(new java.awt.Font("Gujarati Sangam MN", 0, 15)); // NOI18N
        organization.setForeground(new java.awt.Color(153, 153, 153));
        organization.setText("Manage Organization");
        organization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                organizationMousePressed(evt);
            }
        });
        add(organization, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("UserName");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 160, 30));

        emailLabel.setBackground(new java.awt.Color(255, 255, 255));
        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(153, 153, 153));
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("notheastern@edu");
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 160, 30));

        userPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLayer/Userpic.png"))); // NOI18N
        add(userPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 120, 120));

        menubg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLayer/Menu sys.png"))); // NOI18N
        add(menubg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 810));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Artboard5@0.75x.png"))); // NOI18N
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutbtnMousePressed(evt);
            }
        });
        add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 752, 80, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void organizationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizationMousePressed
        // TODO add your handling code here:
        cardLayout.show(rightjPanel,"OrganizationP");
    }//GEN-LAST:event_organizationMousePressed

    private void employeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeMousePressed
        // TODO add your handling code here:
        cardLayout.show(rightjPanel,"EmployeeP");
    }//GEN-LAST:event_employeeMousePressed

    private void logoutbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMousePressed
        // TODO add your handling code here:
        container.remove(this);
        Component[] components = container.getComponents();
        Component component = components[components.length-1];
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_logoutbtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel employee;
    private javax.swing.JLabel logoutbtn;
    private javax.swing.JLabel menubg;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel organization;
    private javax.swing.JPanel rightjPanel;
    private javax.swing.JLabel userPic;
    // End of variables declaration//GEN-END:variables
}
