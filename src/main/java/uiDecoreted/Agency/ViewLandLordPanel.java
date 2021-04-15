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
import com.neu.infofinal.bean.UserAccount;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dengbowen
 */
public class ViewLandLordPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewTenantPanel
     */
    List<House> houses;
    UserAccount agencyAccount;
    JPanel rightcontainer;
    public ViewLandLordPanel(JPanel rightcontainer,UserAccount agencyAccount) {
        initComponents();
        this.rightcontainer=rightcontainer;
        this.agencyAccount = agencyAccount;
        Tool.tableStyle1(jTable1,jScrollPane1);
        displayHouseList();
    }
    
    public void displayHouseList() {
        houses = SysData.getAllHouses();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jTable1.setRowHeight(105);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(new ImageRender());
        for (House house : houses) {
            Object[] row = new Object[7];
            if(house.getAgencyId()==agencyAccount.getId() || house.getAgencyId()==null){
                row[0] = house.getId();
                row[1] = SysData.getUserAccountbyID(house.getOwnerId()).getUsername();
                row[2] = house.getImage();
                row[3] = Tool.strToMultilineHTML(house.getDescrib(), ",");  // "<html><body><p align=\"center\">数据版本12312321321<br/>v1.0.0<br/>12321321</p></body></html>";
                row[4] = Tool.strToMultilineHTML(house.getAddress(), ",");
                row[5] = house.getPrice();
                row[6] = house.getAgencyId()==null?"pending":"completed";
                model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        assigntomeBtn = new javax.swing.JLabel();
        accept = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "HouseID", "Landlord", "Image", "Description", "Address", "Price", "Status"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(128, 128, 128));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(63, 164, 177));
        jTable1.setSelectionForeground(new java.awt.Color(153, 0, 204));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1010, 490));

        assigntomeBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        assigntomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        assigntomeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assigntomeBtn.setText("Assign to me");
        assigntomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                assigntomeBtnMousePressed(evt);
            }
        });
        add(assigntomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 680, 200, 50));

        accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 670, 200, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void assigntomeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assigntomeBtnMousePressed
        // TODO add your handling code here:
        houses = SysData.getAllHouses(); 
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            Tool.InfoString("please select!");
            return;
        }
        int houseId = (int) jTable1.getValueAt(selectedRowIndex, 0);
        //System.out.println(houseId);
        for(House house : houses){
            if(house.getId()==houseId){
                house.setAgencyId(agencyAccount.getId());  
                SysData.updateHouse(house);
            }
        }
        
        displayHouseList();
    }//GEN-LAST:event_assigntomeBtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accept;
    private javax.swing.JLabel assigntomeBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}