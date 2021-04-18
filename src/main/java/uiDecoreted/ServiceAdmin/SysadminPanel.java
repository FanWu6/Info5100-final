package uiDecoreted.ServiceAdmin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Util.SysData;
import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.Enterprise;
import com.neu.infofinal.bean.Network;
import com.neu.infofinal.bean.Organization;
import com.neu.infofinal.bean.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import java.util.Set;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
/**
 *
 * @author Dengbowen
 */
public class SysadminPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysadminPanel
     */
    JPanel container;
    CardLayout cardLayout;
    
    NetworkPanel netpaPanel;
    public SysadminPanel(JPanel container) {
        initComponents();
        this.container = container;
        
        cardLayout = new CardLayout();
        rightjPanel.setLayout(cardLayout);
        netpaPanel = new NetworkPanel(rightjPanel,this);
        rightjPanel.add("NetworkP",netpaPanel);
        cardLayout.show(rightjPanel,"NetworkP");
        
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                 DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();//返回最后选定的节点
//                if(selectedNode.toString().equals("child")){
//                 jTextField.setText("I LOVE YOU");
//                }
//                 System.out.println(selectedNode.getDepth());
               if(selectedNode==null){
                   return;
               }
                
                if(selectedNode.toString().equals("Networks")){
                   cardLayout.show(rightjPanel,"NetworkP");
                   netpaPanel.setInfo();
                }else if(selectedNode.getUserObject() instanceof Network){
                    Network network = (Network)selectedNode.getUserObject();
                    rightjPanel.add("EnterpriseP", new EnterprisePanel(rightjPanel,network));
                    cardLayout.show(rightjPanel, "EnterpriseP");
                    System.out.println(network.getName() );
                }else if(selectedNode.getUserObject() instanceof Enterprise){
                    Enterprise enterprise = (Enterprise)selectedNode.getUserObject();
                    rightjPanel.add("OrganizationP", new OrganizationPanel(rightjPanel, enterprise));
                    cardLayout.show(rightjPanel, "OrganizationP");
                    System.out.println(enterprise.getName() );
                }else if(selectedNode.getUserObject() instanceof Organization){
                    Organization organization = (Organization)selectedNode.getUserObject();
                    rightjPanel.add("EmployeeP", new EmployeePanel(rightjPanel, organization));
                    cardLayout.show(rightjPanel, "EmployeeP");
                    System.out.println(organization.getName() );
                }else if(selectedNode.getUserObject() instanceof Employee){
                    Employee employee = (Employee)selectedNode.getUserObject();
                    System.out.println(employee.getName() );
                }
            }
        });
        
        setInfo();
    }
    
    public void setInfo(){
        DefaultTreeModel model=(DefaultTreeModel)jTree1.getModel();
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        List<Network> allNetworks = SysData.getAllNetworks();
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        DefaultMutableTreeNode employeeNode;
        for(int i=0;i<allNetworks.size();i++){
            Network network = allNetworks.get(i);
            networkNode=new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);
            networkNode.setUserObject(network);
            
            
            List<Enterprise> enterprises = SysData.getEnterpriseByNetworkId(network.getId());
            for(int j=0;j<enterprises.size();j++){
                Enterprise enterprise = enterprises.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise);
                networkNode.insert(enterpriseNode,j);
                
                List<Organization> organizations = SysData.getOrganizationByEnterpriseId(enterprise.getId());
                for(int k = 0;k<organizations.size();k++){
                    Organization organization = organizations.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode,k);
                    organizationNode.setUserObject(organization);
                    
                    List<Employee> employees = SysData.getEmployeeByEpidAndOrid(enterprise.getId(),organization.getId());
                    for(int h=0;h<employees.size();h++){
                        Employee employee = employees.get(h);
                        employeeNode = new DefaultMutableTreeNode(employee.getName());
                        organizationNode.insert(employeeNode,h);
                        employeeNode.setUserObject(employee);
                    }
                }
                
                
            }
        }

        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightjPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        menubg = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1440, 810));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightjPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightjPanel.setOpaque(false);
        rightjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(rightjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1130, 810));

        jScrollPane1.setOpaque(false);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("colors");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("blue");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("violet");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("red");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("yellow");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("sports");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("basketball");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("soccer");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("football");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hockey");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("food");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hot dogs");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("pizza");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ravioli");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("bananas");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setOpaque(false);
        jScrollPane1.setViewportView(jTree1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 730));

        menubg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLayer/Menu sys.png"))); // NOI18N
        add(menubg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 810));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Artboard5@0.75x.png"))); // NOI18N
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutbtnMousePressed(evt);
            }
        });
        add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 752, 80, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMousePressed
        // TODO add your handling code here:
        container.remove(this);
        Component[] components = container.getComponents();
        Component component = components[components.length-1];
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_logoutbtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel logoutbtn;
    private javax.swing.JLabel menubg;
    private javax.swing.JPanel rightjPanel;
    // End of variables declaration//GEN-END:variables
}
