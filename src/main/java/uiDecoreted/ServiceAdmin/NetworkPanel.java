package uiDecoreted.ServiceAdmin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Util.SysData;
import Util.Tool;
import com.neu.infofinal.bean.Network;
import com.neu.infofinal.bean.UserAccount;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dengbowen
 */
public class NetworkPanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkPanel
     */
    UserAccount userAccount;
    JPanel rightcontainer;
    SysadminPanel sysadminPanel;
    public NetworkPanel(JPanel rightcontainer,SysadminPanel sysadminPanel) {
        initComponents();
        this.sysadminPanel = sysadminPanel;
        this.rightcontainer=rightcontainer;
    }
    
    public void setInfo(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        List<Network> allNetworks = SysData.getAllNetworks();
         for (Network network : allNetworks) {
            Object[] row = new Object[2];
            //如果house的租客id为空，代表没有租出去，显示
                row[0] = network.getId();
                row[1] = network.getName();
                model.addRow(row);       
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
        networktxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        completedBtn = new javax.swing.JLabel();
        completed = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "Network"
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

        networktxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networktxtActionPerformed(evt);
            }
        });
        add(networktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 240, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Network:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 80, 30));

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
    }// </editor-fold>//GEN-END:initComponents

    private void networktxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networktxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networktxtActionPerformed

    private void completedBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedBtnMousePressed
        // TODO add your handling code here:
        Network network = new Network();
        network.setName(networktxt.getText());
        int insertNetwork = SysData.insertNetwork(network);
        if(insertNetwork>0){
            setInfo();
            sysadminPanel.setInfo();
        }
        Tool.InfoString("Add Successfully");
    }//GEN-LAST:event_completedBtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel completed;
    private javax.swing.JLabel completedBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField networktxt;
    // End of variables declaration//GEN-END:variables
}
