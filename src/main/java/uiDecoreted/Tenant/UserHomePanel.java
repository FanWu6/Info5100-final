/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Tenant;

import Util.SysData;
import com.neu.infofinal.bean.House;
import com.neu.infofinal.bean.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author wufan
 */
public class UserHomePanel extends javax.swing.JPanel {

    /**
     * Creates new form TenantPanel1
     */
    JPanel rightcontainer;
    UserAccount tenantAccount;
    House house;
    public UserHomePanel(JPanel rightcontainer,UserAccount userAccount) {
        this.tenantAccount = userAccount;
        this.rightcontainer = rightcontainer;
        initComponents();
        
        getInfo();
        setInfo();
    }
    
    public void getInfo() {
        house = SysData.getHouseByTenantId(tenantAccount.getId());
    }
    
    public void setInfo() {
        addressLabel.setText(house.getAddress());
        roomnameLabel.setText(house.getName());
        housePic.setIcon(new javax.swing.ImageIcon(getClass().getResource(house.getImage()))); // NOI18N
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        myOrderBtn = new javax.swing.JLabel();
        myOrderLable = new javax.swing.JLabel();
        housePic = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        roomnameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 380, 40));

        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setText("jTextField1");
        jTextField2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 380, 40));

        myOrderBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        myOrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        myOrderBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myOrderBtn.setText("My Order");
        add(myOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 200, 60));

        myOrderLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/White1.png"))); // NOI18N
        myOrderLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                myOrderLableMousePressed(evt);
            }
        });
        add(myOrderLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, -1, -1));

        housePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/housepicture/housepic1.png"))); // NOI18N
        add(housePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 300, 200));

        addressLabel.setText("Address");
        add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 360, -1));

        roomnameLabel.setText("Superior Double Room");
        add(roomnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLayer/1_Contact.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1100, 730));
    }// </editor-fold>//GEN-END:initComponents

    private void myOrderLableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myOrderLableMousePressed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout)rightcontainer.getLayout();
        cardLayout.show(rightcontainer, "tenantOrderP");
    }//GEN-LAST:event_myOrderLableMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel housePic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel myOrderBtn;
    private javax.swing.JLabel myOrderLable;
    private javax.swing.JLabel roomnameLabel;
    // End of variables declaration//GEN-END:variables


}
