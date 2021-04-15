/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Agency;

import Util.ImageRender;
import Util.SysData;
import Util.Tool;
import com.neu.infofinal.bean.House;
import com.neu.infofinal.bean.Order;
import com.neu.infofinal.bean.Region;
import com.neu.infofinal.bean.UserAccount;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dengbowen
 */
public class ViewTenantPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewTenantPanel
     */
    UserAccount agencyAccount;
    JPanel rightcontainer;
    List<Order> orders;

    public ViewTenantPanel(JPanel rightcontainer, UserAccount agencyAccount) {
        initComponents();

        this.rightcontainer = rightcontainer;
        this.agencyAccount = agencyAccount;
        Tool.tableStyle1(jTable1, jScrollPane1);

        typeCombo.removeAllItems();
        typeCombo.addItem(SysData.ORDER_TYPE.APPOINTMENT.toString());
        typeCombo.addItem(SysData.ORDER_TYPE.SIGN.toString());

        displayOrderList();
    }

    public void displayOrderList() {
        orders = SysData.getAllOrders();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jTable1.setRowHeight(105);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(new ImageRender());
        for (Order order : orders) {
            Object[] row = new Object[8];
            if (order.getAgencyId() == agencyAccount.getId() || order.getAgencyId() == null) {
                if (order.getOrderType() == typeCombo.getSelectedIndex()) {
                    House house = SysData.getHouseByHouseId(order.getHouseId());
                    row[0] = house.getId();
                    row[1] = SysData.getUserAccountbyID(order.getTenantId()).getUsername();
                    row[2] = house.getImage();
                    row[3] = Tool.strToMultilineHTML(house.getDescrib(), ",");  // "<html><body><p align=\"center\">数据版本12312321321<br/>v1.0.0<br/>12321321</p></body></html>";
                    row[4] = Tool.strToMultilineHTML(house.getAddress(), ",");
                    row[5] = house.getPrice();
                    row[6] = SysData.ORDER_TYPE.values()[order.getOrderType()];
                    row[7] = order.getStatus();
                    model.addRow(row); 
                }

            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        assigntomebtn = new javax.swing.JLabel();
        refuse = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboActionPerformed(evt);
            }
        });
        add(typeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "HouseID", "Tenant", "Image", "Description", "Address", "Price", "Request", "Status"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(128, 128, 128));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(63, 164, 177));
        jTable1.setSelectionForeground(new java.awt.Color(153, 0, 204));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 1020, 490));

        assigntomebtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        assigntomebtn.setForeground(new java.awt.Color(255, 255, 255));
        assigntomebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assigntomebtn.setText("Assign to me");
        assigntomebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                assigntomebtnMousePressed(evt);
            }
        });
        add(assigntomebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 650, 200, 50));

        refuse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(refuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, 200, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void assigntomebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assigntomebtnMousePressed
        // TODO add your handling code here:
        orders = SysData.getAllOrders(); 
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            Tool.InfoString("please select!");
            return;
        }
        int orderId = (int) jTable1.getValueAt(selectedRowIndex, 0);
        //System.out.println(houseId);
        for(Order order : orders){
            if(order.getId()==orderId){
                order.setAgencyId(agencyAccount.getId()); 
                order.setStatus(SysData.ORDER_STATUS_TYPE.FINISH.getStatus());
            }
        }
        displayOrderList();
    }//GEN-LAST:event_assigntomebtnMousePressed

    private void typeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboActionPerformed
        // TODO add your handling code here:
        displayOrderList();
    }//GEN-LAST:event_typeComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assigntomebtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel refuse;
    private javax.swing.JComboBox<String> typeCombo;
    // End of variables declaration//GEN-END:variables
}
