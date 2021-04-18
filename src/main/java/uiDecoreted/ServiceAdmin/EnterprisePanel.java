package uiDecoreted.ServiceAdmin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Util.SysData;
import Util.Tool;
import com.neu.infofinal.bean.Enterprise;
import com.neu.infofinal.bean.Network;
import com.neu.infofinal.bean.UserAccount;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author Dengbowen
 */
public class EnterprisePanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkPanel
     */
    JPanel rightcontainer;
    List<Enterprise> allEnterprises;
    SysadminPanel sysadminPanel;
    Network network;
    int type = 0;
    String enterpriseType = "";
    public EnterprisePanel(JPanel rightcontainer,SysadminPanel sysadminPanel) {
        initComponents();
        this.rightcontainer=rightcontainer;
        this.sysadminPanel = sysadminPanel;
    }

    public void setNetwork(Network network) {
        this.network = network;
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
        completedBtn = new javax.swing.JLabel();
        completed = new javax.swing.JLabel();
        enterprisetxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblEnterType = new javax.swing.JLabel();
        lblNetwork = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "Enterprise"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 850, 160));

        completedBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        completedBtn.setForeground(new java.awt.Color(255, 255, 255));
        completedBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        completedBtn.setText("Add");
        completedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                completedBtnMousePressed(evt);
            }
        });
        add(completedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, 200, 50));

        completed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(completed, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 660, 200, 70));

        enterprisetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterprisetxtActionPerformed(evt);
            }
        });
        add(enterprisetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 240, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Enterprise Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Enterprise Type:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Network:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 80, 30));

        lblEnterType.setText("move");
        add(lblEnterType, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 120, 30));

        lblNetwork.setText("jLabel4");
        add(lblNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void completedBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedBtnMousePressed
        // TODO add your handling code here:
        Enterprise enterprise = new Enterprise();
        enterprise.setName(enterprisetxt.getText());
        enterprise.setNetworkId(network.getId());
        enterprise.setType(type);
        int insertEnter = SysData.insertEnterprise(enterprise);
        if (insertEnter > 0) {
            setInfo();
            sysadminPanel.setInfo();
            Tool.InfoString("Add Successfully");
        }
        
    }//GEN-LAST:event_completedBtnMousePressed

    private void enterprisetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterprisetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterprisetxtActionPerformed
    private void getInfo() {
        allEnterprises = SysData.getEnterpriseByNetworkId(network.getId());
        if (network.getId() == 4) {
            type = 7;
            enterpriseType = "Mover Enterprise";
        } else if (network.getId() == 3) {
            type = 5;
            enterpriseType = "Clean Enterprise";
        } else if (network.getId() == 2) {
            type = 6;
            enterpriseType = "Repair Enterprise";
        }else if(network.getId()==1){
            type=1;
            enterpriseType="Rental Enterprise";
        }
    }
    public void setInfo() {
        getInfo();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);


        for (Enterprise enterprise : allEnterprises) {
            Object[] row = new Object[2];
            row[0] = enterprise.getId();
            row[1] = enterprise.getName();
            model.addRow(row);
        }
        
        lblNetwork.setText(network.getName());
        lblEnterType.setText(enterpriseType);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel completed;
    private javax.swing.JLabel completedBtn;
    private javax.swing.JTextField enterprisetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEnterType;
    private javax.swing.JLabel lblNetwork;
    // End of variables declaration//GEN-END:variables


}
