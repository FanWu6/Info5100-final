/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Housework;

import Util.JTextFieldHintListener;
import Util.SysData;
import Util.Tool;
import com.neu.infofinal.bean.House;
import com.neu.infofinal.bean.OrderHousework;
import com.neu.infofinal.bean.UserAccount;
import uiDecoreted.Tenant.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javafx.scene.text.Font;
import javax.swing.JPanel;

/**
 *
 * @author tengfei
 */
public class ViewHouseWorkOrderDetailPanel extends javax.swing.JPanel {

    /**
     * Creates new form TenantPanel1
     */
    JPanel rightcontainer;
    OrderHousework orderHousework;
    UserAccount tenantAccount;
    House tenantHouse; 
    
    boolean[] process;
    public ViewHouseWorkOrderDetailPanel(JPanel rightcontainer,OrderHousework orderHousework,int tenantID,boolean[] process) {
        this.rightcontainer = rightcontainer;
        this.orderHousework=orderHousework;
        this.process=process;
        tenantAccount=SysData.getUserAccountbyID(tenantID);

        initComponents();
        txtaddress.addFocusListener(new JTextFieldHintListener(txtaddress, "Username", new Color(153, 153, 153)));
        txtname.addFocusListener(new JTextFieldHintListener(txtname, "Name", new Color(153, 153, 153)));
        txtphone.addFocusListener(new JTextFieldHintListener(txtphone, "Phone", new Color(153, 153, 153)));
        txtemail.addFocusListener(new JTextFieldHintListener(txtemail, "Email", new Color(153, 153, 153)));
        txtearea.addFocusListener(new JTextFieldHintListener(txtearea, "Area", new Color(153, 153, 153)));
        getinfo();
        setinfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        commentText = new javax.swing.JTextField();
        backBtn = new javax.swing.JLabel();
        Backbak = new javax.swing.JLabel();
        txtearea = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        info = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        icon4 = new javax.swing.JLabel();
        lblenter3 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        lblenter2 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        lblenter1 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        lblenter = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        commentText.setEditable(false);
        commentText.setText("No Comment Now");
        commentText.setOpaque(false);
        add(commentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 540, 120));

        backBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backBtnMousePressed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, 50));

        Backbak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(Backbak, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 70));

        txtearea.setEditable(false);
        txtearea.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        txtearea.setForeground(new java.awt.Color(153, 153, 153));
        txtearea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtearea.setText("area");
        txtearea.setToolTipText("");
        txtearea.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtearea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteareaActionPerformed(evt);
            }
        });
        add(txtearea, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 270, 40));

        txtemail.setEditable(false);
        txtemail.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        txtemail.setForeground(new java.awt.Color(153, 153, 153));
        txtemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtemail.setText("email");
        txtemail.setToolTipText("");
        txtemail.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 270, 40));

        txtphone.setEditable(false);
        txtphone.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        txtphone.setForeground(new java.awt.Color(153, 153, 153));
        txtphone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtphone.setText("phone");
        txtphone.setToolTipText("");
        txtphone.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 270, 40));

        txtname.setEditable(false);
        txtname.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        txtname.setForeground(new java.awt.Color(153, 153, 153));
        txtname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtname.setText("name");
        txtname.setToolTipText("");
        txtname.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 270, 40));

        txtaddress.setEditable(false);
        txtaddress.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        txtaddress.setForeground(new java.awt.Color(153, 153, 153));
        txtaddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtaddress.setText("address");
        txtaddress.setToolTipText("");
        txtaddress.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 270, 40));

        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/housework/area@0,4x.png"))); // NOI18N
        add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 368, 608));
        info.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/housework/visuel@0,5x.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 560, 301));

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/housework/043-house.png"))); // NOI18N
        icon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon4MousePressed(evt);
            }
        });
        add(icon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        lblenter3.setText("Close Door");
        add(lblenter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/housework/017-portfolio.png"))); // NOI18N
        icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon3MousePressed(evt);
            }
        });
        add(icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        lblenter2.setText("Privacy");
        add(lblenter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/housework/012-dinner.png"))); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });
        add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        lblenter1.setText("Clean");
        add(lblenter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/housework/007-house-1 (1).png"))); // NOI18N
        icon1.setPreferredSize(new java.awt.Dimension(64, 64));
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });
        add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        lblenter.setText("Enter");
        add(lblenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMousePressed
//
//        CardLayout layout = (CardLayout)rightcontainer.getLayout();
//        layout.show(rightcontainer, "viewRequestP");
//        
        rightcontainer.remove(this);
        Component[] componentArray = rightcontainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewRequestPanel dwjp = (ViewRequestPanel) component;
        dwjp.setCompleteButton(process);
        CardLayout layout = (CardLayout)rightcontainer.getLayout();
        layout.previous(rightcontainer);
    }//GEN-LAST:event_backBtnMousePressed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txteareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteareaActionPerformed

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        // TODO add your handling code here:
        process[0]=true;
        lblenter.setText("Entered");
    }//GEN-LAST:event_icon1MousePressed

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        // TODO add your handling code here:
        process[1]=true;
        lblenter1.setText("Cleaned");
    }//GEN-LAST:event_icon2MousePressed

    private void icon3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MousePressed
        // TODO add your handling code here:
        process[2]=true;
        lblenter2.setText("Untouched");
    }//GEN-LAST:event_icon3MousePressed

    private void icon4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MousePressed
        // TODO add your handling code here:
        process[3]=true;
        lblenter3.setText("Door Closed");        
    }//GEN-LAST:event_icon4MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backbak;
    private javax.swing.JLabel backBtn;
    private javax.swing.JTextField commentText;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblenter;
    private javax.swing.JLabel lblenter1;
    private javax.swing.JLabel lblenter2;
    private javax.swing.JLabel lblenter3;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtearea;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
    
    
    private void getinfo() {
        tenantHouse=SysData.getHouseByTenantId(tenantAccount.getId());
    }
    private void setinfo() {
        this.txtaddress.setText(tenantHouse.getAddress());
        this.txtearea.setText(tenantHouse.getArea());
        this.txtemail.setText(tenantAccount.getEmail());
        this.txtphone.setText(tenantAccount.getPhone());
        this.txtname.setText(tenantAccount.getUsername());
        commentText.setText(orderHousework.getComment());
        if(process[0]==true){
            lblenter.setText("Entered");
        }
        if(process[1]==true){
            lblenter1.setText("Cleaned");
        }
        if(process[2]==true){
            lblenter2.setText("Untouched");
        }
        if(process[3]==true){
            lblenter3.setText("Door Closed");  
        }
                
    }


}
