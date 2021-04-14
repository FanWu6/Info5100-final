/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.Housework;
import Util.SysData;
import Util.Tool;
import com.neu.infofinal.bean.Order;
import com.neu.infofinal.bean.OrderHousework;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tengfei
 */
public class ViewRequestPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRequestPanel
     */
    JPanel rightcontainer;
    List<OrderHousework> orderHouseworks;
    public ViewRequestPanel(JPanel rightcontainer) {
        initComponents();
        this.rightcontainer = rightcontainer;
        Tool.tableStyle1(tblHouseworkMy2, jScrollPane1);
        Tool.tableStyle1(tblHousework1, jScrollPane3);
        
        getInfo();
//        setInfo();
        refreshTable1();
        refreshTable2();
    }
    
    public void getInfo() {
        orderHouseworks = SysData.getAllOrderHouseworks(); 
    }
    
    public void setInfo() {
//        addressLabel.setText(house.getAddress());
//        roomnameLabel.setText(house.getName());
//        housePic.setIcon(new javax.swing.ImageIcon(getClass().getResource(house.getImage()))); // NOI18N
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always[动画表情]
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        assigntomebtn1 = new javax.swing.JLabel();
        assigntome1 = new javax.swing.JLabel();
        assigntomebtn = new javax.swing.JLabel();
        assigntome = new javax.swing.JLabel();
        completedBtn = new javax.swing.JLabel();
        completed = new javax.swing.JLabel();
        detailBtn = new javax.swing.JLabel();
        detailBack = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHousework1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHouseworkMy2 = new javax.swing.JTable();
        bkn = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assigntomebtn1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        assigntomebtn1.setForeground(new java.awt.Color(255, 255, 255));
        assigntomebtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assigntomebtn1.setText("Company");
        assigntomebtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                assigntomebtn1MousePressed(evt);
            }
        });
        add(assigntomebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 200, 50));

        assigntome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/White1.png"))); // NOI18N
        add(assigntome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 200, 70));

        assigntomebtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        assigntomebtn.setForeground(new java.awt.Color(255, 255, 255));
        assigntomebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assigntomebtn.setText("Assign to me");
        assigntomebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                assigntomebtnMousePressed(evt);
            }
        });
        add(assigntomebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 200, 50));

        assigntome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(assigntome, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 200, 70));

        completedBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        completedBtn.setForeground(new java.awt.Color(255, 255, 255));
        completedBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        completedBtn.setText("Completed");
        completedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                completedBtnMousePressed(evt);
            }
        });
        add(completedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 690, 200, 50));

        completed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(completed, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 680, 200, 70));

        detailBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        detailBtn.setForeground(new java.awt.Color(255, 255, 255));
        detailBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detailBtn.setText("Detail");
        detailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                detailBtnMousePressed(evt);
            }
        });
        add(detailBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, 200, 50));

        detailBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button/Splash.png"))); // NOI18N
        add(detailBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 680, 200, 70));

        tblHousework1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Customer", "Type", "Date", "Status", "Comment"
            }
        ));
        jScrollPane3.setViewportView(tblHousework1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 850, 190));

        tblHouseworkMy2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Customer", "Type", "Date", "Status", "Comment"
            }
        ));
        jScrollPane1.setViewportView(tblHouseworkMy2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 850, 160));

        bkn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/housework/main@0,3x.png"))); // NOI18N
        add(bkn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 40, 520, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void assigntomebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assigntomebtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_assigntomebtnMousePressed

    private void completedBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_completedBtnMousePressed

    private void detailBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailBtnMousePressed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout)rightcontainer.getLayout();
        cardLayout.show(rightcontainer, "ViewHouseWorkOrderDetailPanel");
    }//GEN-LAST:event_detailBtnMousePressed

    private void assigntomebtn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assigntomebtn1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_assigntomebtn1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assigntome;
    private javax.swing.JLabel assigntome1;
    private javax.swing.JLabel assigntomebtn;
    private javax.swing.JLabel assigntomebtn1;
    private javax.swing.JLabel bkn;
    private javax.swing.JLabel completed;
    private javax.swing.JLabel completedBtn;
    private javax.swing.JLabel detailBack;
    private javax.swing.JLabel detailBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblHousework1;
    private javax.swing.JTable tblHouseworkMy2;
    // End of variables declaration//GEN-END:variables

    private void refreshTable1() {
        DefaultTableModel model = (DefaultTableModel) tblHouseworkMy2.getModel();
        model.setRowCount(0);
        
        for(OrderHousework ordH:orderHouseworks){
            
            Object[] row = new Object[5];
//            row[0]=ordH.getTenantName()==null?null:ordH.getTenantName();
//            row[1]=ordH.getSubjectType()==null?null:ordH.getSubjectType();
        }
    }

    private void refreshTable2() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
