/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Tenant;

import Util.SysData;
import Util.Tool;
import com.neu.infofinal.bean.House;
import com.neu.infofinal.bean.Order;
import java.awt.CardLayout;
import java.util.HashSet;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author wufan
 */
public class ViewDetailPanel extends javax.swing.JPanel {

    /**
     * Creates new form TenantPanel1
     */
    JPanel rightcontainer;
    Integer houseId;
    public ViewDetailPanel(JPanel rightcontainer,Integer houseId) {
        this.houseId = houseId;
        this.rightcontainer = rightcontainer;
        initComponents();
        
        if(houseId!=null)
            setHouseInfo(houseId);
    }
    
    public void setHouseInfo(Integer houseId){
        this.houseId = houseId;
        House house = SysData.getHouseByHouseId(houseId);
        nameLabel.setText(house.getName());
        addressLabel.setText(Tool.strToMultilineHTML(house.getAddress(),",") );
        priceLabel.setText(house.getPrice());
        AreaLabel.setText(house.getArea());
        orientationLabel.setText(house.getOrientation());
        storeyLabel.setText(house.getFloor());
        
        housePic.setIcon(new javax.swing.ImageIcon(getClass().getResource(house.getImage())));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JLabel();
        Backbak = new javax.swing.JLabel();
        housePic = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        orintationTitle = new javax.swing.JLabel();
        storeyTitle = new javax.swing.JLabel();
        spaceTitle = new javax.swing.JLabel();
        requesttourbtn = new javax.swing.JLabel();
        requesttour = new javax.swing.JLabel();
        requestapplybtn = new javax.swing.JLabel();
        Requesttoapply = new javax.swing.JLabel();
        AreaLabel = new javax.swing.JLabel();
        orientationLabel = new javax.swing.JLabel();
        storeyLabel = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();
        line2 = new javax.swing.JLabel();
        line3 = new javax.swing.JLabel();
        line4 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        housePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/housepicture/housepic1.png"))); // NOI18N
        add(housePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 300, 210));

        addressLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        addressLabel.setText("Address");
        add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 260, -1));

        priceLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 0, 51));
        priceLabel.setText("Price");
        add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 220, 30));

        nameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        nameLabel.setText("Superior Double Room");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        orintationTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        orintationTitle.setText("orientation");
        add(orintationTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 110, 30));

        storeyTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        storeyTitle.setText("Storey");
        add(storeyTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 60, 30));

        spaceTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        spaceTitle.setText("Area");
        add(spaceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 60, 30));

        requesttourbtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        requesttourbtn.setForeground(new java.awt.Color(255, 255, 255));
        requesttourbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requesttourbtn.setText("Request a tour");
        requesttourbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                requesttourbtnMousePressed(evt);
            }
        });
        add(requesttourbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 710, 200, 60));

        requesttour.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        requesttour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requesttour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(requesttour, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 710, 200, 60));

        requestapplybtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        requestapplybtn.setForeground(new java.awt.Color(255, 255, 255));
        requestapplybtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requestapplybtn.setText("Request to apply");
        requestapplybtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                requestapplybtnMousePressed(evt);
            }
        });
        add(requestapplybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 710, 200, 60));

        Requesttoapply.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        Requesttoapply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(Requesttoapply, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 710, 200, 60));

        AreaLabel.setText("value");
        add(AreaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 220, -1));

        orientationLabel.setText("value");
        add(orientationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 220, -1));

        storeyLabel.setText("value");
        add(storeyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 230, -1));

        line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register/Line.png"))); // NOI18N
        add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 700, 50));

        line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register/Line.png"))); // NOI18N
        add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 700, 50));

        line3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register/Line.png"))); // NOI18N
        add(line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 700, 40));

        line4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register/Line.png"))); // NOI18N
        add(line4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 700, 50));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLayer/detailbackground_1.png"))); // NOI18N
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMousePressed
        // TODO add your handling code here:
//        Component[] components = container.getComponents();
//        Component component = components[components.length-1];
        CardLayout layout = (CardLayout)rightcontainer.getLayout();
        layout.show(rightcontainer, "RentalListPanel");
    }//GEN-LAST:event_backBtnMousePressed

    private void requestapplybtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestapplybtnMousePressed
        // TODO add your handling code here:
        TenantUserPanel parent = (TenantUserPanel)rightcontainer.getParent();
        House house = SysData.getHouseByTenantId(parent.userAccount.getId());
        if(house!=null){
            Tool.InfoString("You already have a rental");
            return;
        }
        Order order = new Order();
        order.setTenantId(parent.userAccount.getId());
        order.setHouseId(houseId);
        order.setOrderType(SysData.ORDER_TYPE.SIGN.getIndex());
        order.setStatus(SysData.ORDER_STATUS_TYPE.PEND.getStatus());
        SysData.insertOrder(order);
    }//GEN-LAST:event_requestapplybtnMousePressed

    private void requesttourbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requesttourbtnMousePressed
        // TODO add your handling code here:
        //约看
        TenantUserPanel parent = (TenantUserPanel)rightcontainer.getParent();
        House house = SysData.getHouseByTenantId(parent.userAccount.getId());
        if(house!=null){
            Tool.InfoString("You already have a rental");
            return;
        }
        Order order = new Order();
        order.setTenantId(parent.userAccount.getId());
        order.setHouseId(houseId);
        order.setOrderType(SysData.ORDER_TYPE.APPOINTMENT.getIndex());
        order.setStatus(SysData.ORDER_STATUS_TYPE.PEND.getStatus());
        SysData.insertOrder(order);
    }//GEN-LAST:event_requesttourbtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AreaLabel;
    private javax.swing.JLabel Backbak;
    private javax.swing.JLabel Requesttoapply;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel housePic;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel line2;
    private javax.swing.JLabel line3;
    private javax.swing.JLabel line4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel orientationLabel;
    private javax.swing.JLabel orintationTitle;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel requestapplybtn;
    private javax.swing.JLabel requesttour;
    private javax.swing.JLabel requesttourbtn;
    private javax.swing.JLabel spaceTitle;
    private javax.swing.JLabel storeyLabel;
    private javax.swing.JLabel storeyTitle;
    // End of variables declaration//GEN-END:variables
}
