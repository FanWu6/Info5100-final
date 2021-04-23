/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiDecoreted.SystemAdmin;

import Util.SysData;
import Util.Tool;
import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.Enterprise;
import com.neu.infofinal.bean.House;
import com.neu.infofinal.bean.Order;
import com.neu.infofinal.bean.UserAccount;
import javax.swing.JPanel;
import com.neu.infofinal.bean.Organization;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import jchart.BarChart_AWT;
import jchart.BarChart_Tenantpopulation_AWT;
import jchart.LineChart_AWT;
import jchart.PieChart_AWT;
import org.jfree.ui.RefineryUtilities;


/**
 *
 * @author Dengbowen
 */
public class EmployeePanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkPanel
     */
    JPanel rightcontainer;
    Organization organizaion;
    List<Employee> allEmployee;
    SysadminPanel sysadminPanel;
    List<Order> orders;
    List<House> houses;
    public EmployeePanel(JPanel rightcontainer,SysadminPanel sysadminPanel) {
        initComponents();
        this.sysadminPanel = sysadminPanel;
        this.rightcontainer=rightcontainer;
        this.organizaion=organizaion;
        analysisbtn.setVisible(false);
        
        
    }

    public void setOrganizaion(Organization organizaion) {
        this.organizaion = organizaion;        
        if(organizaion.getId()==SysData.ACCOUNT_TYPE.AGENCY.getIndex()){
        analysisbtn.setVisible(true);
        } else{
            analysisbtn.setVisible(false);
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
        analysisbtn = new javax.swing.JButton();
        completedBtn = new javax.swing.JLabel();
        completed = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JTextField();
        usernametxt = new javax.swing.JTextField();
        employeetxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblOrg = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "EmployeeID", "EmployeeName", "OrganizationId", "enterpriseId", "username", "password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 850, 160));

        analysisbtn.setText("Analysis");
        analysisbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analysisbtnActionPerformed(evt);
            }
        });
        add(analysisbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, -1, -1));

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

        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });
        add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 240, 30));

        usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxtActionPerformed(evt);
            }
        });
        add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 240, 30));

        employeetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeetxtActionPerformed(evt);
            }
        });
        add(employeetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 240, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Employee Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Organization:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Employee UserName:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Employee Password:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, -1, 30));

        lblOrg.setText("jLabel1");
        add(lblOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void completedBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedBtnMousePressed
        // TODO add your handling code here:
        //insert useraccount first
        if(employeetxt.getText()==""||passwordtxt.getText()==""||usernametxt.getText()==""
                ||employeetxt.getText() == null || passwordtxt.getText() == null || usernametxt.getText() == null){
            Tool.InfoString("Please complete the form");
        }
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(usernametxt.getText());
        userAccount.setPassword(passwordtxt.getText());
        
        Enterprise enterprise=SysData.getEnterpriseById(organizaion.getEnterpriseId());
        userAccount.setType(organizaion.getId());
        int insertNetwork = SysData.insertUserAccount(userAccount);
        //inert employee
        Employee employee = new Employee();
        employee.setName(employeetxt.getText());
        employee.setEnterpriseId(organizaion.getEnterpriseId());
        employee.setOrganizationId(organizaion.getId());

        //get useraccount from table 
        userAccount=SysData.getUserAccount(userAccount.getUsername(), userAccount.getPassword());
        employee.setUseraccountId(Integer.valueOf(userAccount.getId()));

        insertNetwork = SysData.insertEmployee(employee);

        if (insertNetwork > 0) {
            setInfo();
            sysadminPanel.setInfo();
            Tool.InfoString("Add Successfully");
        }
       
     
    }//GEN-LAST:event_completedBtnMousePressed

    private void employeetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeetxtActionPerformed

    private void usernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxtActionPerformed

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed

    private void analysisbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analysisbtnActionPerformed
        // TODO add your handling code here:
        Analysis();
        
    }//GEN-LAST:event_analysisbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analysisbtn;
    private javax.swing.JLabel completed;
    private javax.swing.JLabel completedBtn;
    private javax.swing.JTextField employeetxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables

    private void getInfo() {
        allEmployee=SysData.getEmployeeByEpidAndOrid(organizaion.getEnterpriseId(),organizaion.getId());
    }

    public void setInfo() {
        getInfo();
       
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Employee employee : allEmployee) {
            UserAccount ua=SysData.getUserAccountbyID(employee.getUseraccountId());
            Object[] row = new Object[6];
            row[0] = employee.getId();
            row[1] = employee.getName();
            row[2]=organizaion.getId();
            row[3]=organizaion.getEnterpriseId();
            row[4]=ua.getUsername();
            row[5]=ua.getPassword();
            model.addRow(row);
        }

        lblOrg.setText(organizaion.getName());
        int type = 0;
        String enterpriseType = "";    
    }
    private void Analysis(){
        getInfo();
        houses = SysData.getAllHouses();
        HashMap<String, Integer> map = new HashMap<>();
        for(Employee employee : allEmployee){
            int i = 0;
            for(House hs:houses){
                if(hs.getAgencyId() == employee.getUseraccountId()){
                    i = i+1;
                }
            }
            map.put(employee.getName(), i);
        }
      PieChart_AWT demo = new PieChart_AWT( "Agency Performance",map);  
      demo.pack();
      demo.setSize( 1160 , 400 );    
      RefineryUtilities.centerFrameOnScreen( demo );    
      demo.setVisible( true );
      
      BarChart_AWT chart = new BarChart_AWT("House Price Statistics", "Average House pirce in each Region");
      chart.pack( );        
      RefineryUtilities.centerFrameOnScreen( chart );        
      chart.setVisible( true ); 
      
    BarChart_Tenantpopulation_AWT charttenant = new BarChart_Tenantpopulation_AWT("Tenant Number Statistics", "Tenant number in each Region");
    charttenant.pack( );        
    RefineryUtilities.centerFrameOnScreen( charttenant );        
    charttenant.setVisible( true ); 
    
    //LineChart
    List<List<Integer>> regionPrice =chart.getRegionPriceAndTenantNumber();
    List<Integer> gpas=new ArrayList<>();
     int count=0;
     
     //按房价上升排序
     regionPrice.sort((list1,list2)->{
         return list1.get(0)-list2.get(0);
     });
     for(List<Integer> list:regionPrice){
         gpas.add(list.get(1)); 
     }
     
     LineChart_AWT chart_lineAWT = new LineChart_AWT(
             "Population Vs Price",
             "Population Vs Price",
             gpas,
             "Tenant population");
     chart_lineAWT.setSize(560,367);
//        chart.pack();
     RefineryUtilities.centerFrameOnScreen(chart_lineAWT);
     chart_lineAWT.setVisible(true);
    }
}
