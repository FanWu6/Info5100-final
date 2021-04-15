/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Tenant;

import Util.GlobalData;
import Util.SysData;
import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.House;
import com.neu.infofinal.bean.Order;
import com.neu.infofinal.bean.OrderHousework;
import com.neu.infofinal.bean.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
    List<String> orderType = new ArrayList<>();
    public UserHomePanel(JPanel rightcontainer,UserAccount userAccount) {
        this.tenantAccount = userAccount;
        this.rightcontainer = rightcontainer;
       
        
        
        initComponents();
        nametxt.setBackground(new Color(0,0,0,0));
        phonetxt.setBackground(new Color(0,0,0,0));
        floortxt.setBackground(new Color(0,0,0,0));
        emailtxt.setBackground(new Color(0,0,0,0));
        areatxt.setBackground(new Color(0,0,0,0));
        subjecttxt.setBackground(new Color(0,0,0,0));
        messagetxt.setBackground(new Color(0,0,0,0));
        
        
        orderType.add("Maintain");
        orderType.add("Clean");
        orderType.add("Move");
        selectservicecomb.removeAllItems();
        for (SysData.ORDER_HOUSEWORK_TYPE type : SysData.ORDER_HOUSEWORK_TYPE.values()){
            selectservicecomb.addItem(orderType.get(type.getIndex()));
        }
        
        setInfo();
    }
    
    
    public void setInfo() {
         house = SysData.getHouseByTenantId(tenantAccount.getId());
        if(house==null){
            return;
        }
        addressLabel.setText(house.getAddress());
        roomnameLabel.setText(house.getName());
        housePic.setIcon(new javax.swing.ImageIcon(getClass().getResource(house.getImage()))); // NOI18N
        //user info
        Employee employee = SysData.getEmployeeByUserAccountId(tenantAccount.getId());
        if(employee!=null)
            nametxt.setText(employee.getName());
        
        floortxt.setText(house.getFloor());
        phonetxt.setText(tenantAccount.getPhone());
        emailtxt.setText(tenantAccount.getEmail());
        areatxt.setText(house.getArea());
        subjecttxt.setText(selectservicecomb.getSelectedItem().toString());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nametxt = new javax.swing.JTextField();
        phonetxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        floortxt = new javax.swing.JTextField();
        areatxt = new javax.swing.JTextField();
        subjecttxt = new javax.swing.JTextField();
        messagetxt = new javax.swing.JTextField();
        selectservicecomb = new javax.swing.JComboBox<>();
        submitBtn = new javax.swing.JLabel();
        myOrderBtn = new javax.swing.JLabel();
        myOrderLable = new javax.swing.JLabel();
        housePic = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        roomnameLabel = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nametxt.setBackground(new java.awt.Color(0, 0, 0));
        nametxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        nametxt.setForeground(new java.awt.Color(153, 153, 153));
        nametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nametxt.setText("Name");
        nametxt.setToolTipText("");
        nametxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        nametxt.setEnabled(false);
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 250, 50));

        phonetxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        phonetxt.setForeground(new java.awt.Color(153, 153, 153));
        phonetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phonetxt.setText("Phone");
        phonetxt.setToolTipText("");
        phonetxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        phonetxt.setEnabled(false);
        phonetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetxtActionPerformed(evt);
            }
        });
        add(phonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 270, 50));

        emailtxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        emailtxt.setForeground(new java.awt.Color(153, 153, 153));
        emailtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailtxt.setText("Email");
        emailtxt.setToolTipText("");
        emailtxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        emailtxt.setEnabled(false);
        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });
        add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 290, 40));

        floortxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        floortxt.setForeground(new java.awt.Color(153, 153, 153));
        floortxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        floortxt.setText("3/6");
        floortxt.setToolTipText("");
        floortxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        floortxt.setEnabled(false);
        floortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floortxtActionPerformed(evt);
            }
        });
        add(floortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 280, 60));

        areatxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        areatxt.setForeground(new java.awt.Color(153, 153, 153));
        areatxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        areatxt.setText("80m^2");
        areatxt.setToolTipText("");
        areatxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        areatxt.setEnabled(false);
        areatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areatxtActionPerformed(evt);
            }
        });
        add(areatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 280, 50));

        subjecttxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        subjecttxt.setForeground(new java.awt.Color(153, 153, 153));
        subjecttxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subjecttxt.setText("3/6");
        subjecttxt.setToolTipText("");
        subjecttxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        subjecttxt.setEnabled(false);
        subjecttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjecttxtActionPerformed(evt);
            }
        });
        add(subjecttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 300, 40));

        messagetxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        messagetxt.setForeground(new java.awt.Color(153, 153, 153));
        messagetxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        messagetxt.setText("Input here...");
        messagetxt.setToolTipText("");
        messagetxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        messagetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagetxtActionPerformed(evt);
            }
        });
        add(messagetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 790, 130));

        selectservicecomb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectservicecomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectservicecombActionPerformed(evt);
            }
        });
        add(selectservicecomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 160, -1));

        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submitBtnMousePressed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, 130, 40));

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
        add(housePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 300, 200));

        addressLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        addressLabel.setText("Address");
        add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 360, -1));

        roomnameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        roomnameLabel.setText("Superior Double Room");
        add(roomnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLayer/1_Contact.png"))); // NOI18N
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 1030, 730));
    }// </editor-fold>//GEN-END:initComponents

    private void myOrderLableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myOrderLableMousePressed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout)rightcontainer.getLayout();
        cardLayout.show(rightcontainer, "TenantOrderPanel");
        
       TenantUserPanel parent = (TenantUserPanel)rightcontainer.getParent();
        Component currnetComponent = rightcontainer.getComponent(parent.uiList.indexOf("TenantOrderPanel"));
        TenantOrderPanel tenantOrderPanel = (TenantOrderPanel)currnetComponent;
        tenantOrderPanel.setOrderInfo();
    }//GEN-LAST:event_myOrderLableMousePressed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void phonetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonetxtActionPerformed

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void floortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_floortxtActionPerformed

    private void areatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areatxtActionPerformed

    private void subjecttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjecttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjecttxtActionPerformed

    private void messagetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messagetxtActionPerformed

    private void submitBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMousePressed
        // TODO add your handling code here:
        OrderHousework order = new OrderHousework();
        order.setTenantId(tenantAccount.getId());
        order.setHouseId(house.getId());
        order.setStatus(SysData.ORDER_STATUS_TYPE.PEND.getStatus());
        order.setHouseworkOrderType(selectservicecomb.getSelectedIndex());
        order.setMessage(messagetxt.getText());
        
        SysData.addOrderHousework(order);
    }//GEN-LAST:event_submitBtnMousePressed

    private void selectservicecombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectservicecombActionPerformed
        // TODO add your handling code here:
        int idx = selectservicecomb.getSelectedIndex();
        if(idx>=0)
        {
            subjecttxt.setText(selectservicecomb.getSelectedItem().toString());
        }
    }//GEN-LAST:event_selectservicecombActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField areatxt;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField floortxt;
    private javax.swing.JLabel housePic;
    private javax.swing.JTextField messagetxt;
    private javax.swing.JLabel myOrderBtn;
    private javax.swing.JLabel myOrderLable;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JLabel roomnameLabel;
    private javax.swing.JComboBox<String> selectservicecomb;
    private javax.swing.JTextField subjecttxt;
    private javax.swing.JLabel submitBtn;
    // End of variables declaration//GEN-END:variables


}
