/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.EmployeeExample;
import com.neu.infofinal.bean.Enterprise;
import com.neu.infofinal.bean.EnterpriseExample;
import com.neu.infofinal.bean.House;
import com.neu.infofinal.bean.HouseExample;
import com.neu.infofinal.bean.Order;
import com.neu.infofinal.bean.OrderExample;
import com.neu.infofinal.bean.OrderHousework;
import com.neu.infofinal.bean.OrderHouseworkExample;
import com.neu.infofinal.bean.Organization;
import com.neu.infofinal.bean.Region;
import com.neu.infofinal.bean.RegionExample;
import com.neu.infofinal.bean.User;
import com.neu.infofinal.bean.UserAccount;
import com.neu.infofinal.bean.UserAccountExample;
import com.neu.infofinal.bean.UserExample;
import com.neu.infofinal.mapper.EmployeeMapper;
import com.neu.infofinal.mapper.EnterpriseMapper;
import com.neu.infofinal.mapper.HouseMapper;
import com.neu.infofinal.mapper.OrderHouseworkMapper;
import com.neu.infofinal.mapper.OrderMapper;
import com.neu.infofinal.mapper.OrganizationMapper;
import com.neu.infofinal.mapper.RegionMapper;
import com.neu.infofinal.mapper.UserAccountMapper;
import com.neu.infofinal.mapper.UserMapper;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

/**
 *
 * @author wufan
 */
public class SysData {
    public enum ACCOUNT_TYPE{
        SYSTEM_ADMIN(0),
        TENANT(1),
        LANDLORD(2),
        AGENCY(3),
        MANAGER(4),
        CLEANER(5),
        MAINTAINER(6),
        MOVER(7);
        
        private int index;

        private ACCOUNT_TYPE(int index) {
            this.index = index;
        }
        public int getIndex() {
            return index;
        }
        
    }
    
    public enum ORDER_TYPE{
        APPOINTMENT(0),
        SIGN(1);
        private int index;
        private ORDER_TYPE(int index) {
            this.index = index;
        }
         public int getIndex() {
            return index;
        }
    }
    
    public enum ORDER_HOUSEWORK_TYPE{
        MAINTAIN(0),
        CLEAN(1),
        MOVE(2);
        private int index;
        private ORDER_HOUSEWORK_TYPE(int index) {
            this.index = index;
        } 
         public int getIndex() {
            return index;
        }
    }
    
    public enum ORDER_STATUS_TYPE{
        PEND("pending"),
        PROCESS("processing"),
        FINISH("finished");
        private String status;
        private ORDER_STATUS_TYPE(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }
        
    }
    
    static SqlSessionFactory sqlSessionFactory;
    static SqlSession sqlSession;
    
    static EnterpriseMapper enterpriseMapper;
    static OrganizationMapper organizationMapper;
    static EmployeeMapper employeeMapper;
    static UserAccountMapper userAccountMapper; 
    static HouseMapper houseMapper; 
    static OrderMapper orderMapper;
    static OrderHouseworkMapper orderHouseworkMapper;
    static RegionMapper regionMapper;
    
   
    public static void Config(){
         try {
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
         } catch (IOException ex) {
             java.util.logging.Logger.getLogger(SysData.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public static void  start(){
        if(sqlSessionFactory==null){
            Config();
        }
         //2.
         sqlSession = sqlSessionFactory.openSession();
         
         //3.
         enterpriseMapper = sqlSession.getMapper(EnterpriseMapper.class);
         organizationMapper = sqlSession.getMapper(OrganizationMapper.class);
         employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
         userAccountMapper = sqlSession.getMapper(UserAccountMapper.class);
         houseMapper = sqlSession.getMapper(HouseMapper.class);
         orderMapper = sqlSession.getMapper(OrderMapper.class);
         orderHouseworkMapper=sqlSession.getMapper(OrderHouseworkMapper.class);
         regionMapper=sqlSession.getMapper(RegionMapper.class);
    }
    
    //User-------------------------------
    public static List<UserAccount> getAllUsers(){
        start();
        
        UserAccountExample useraccountExample = new UserAccountExample();
        useraccountExample.createCriteria().andIdIsNotNull();
        List<UserAccount> selectByExample = userAccountMapper.selectByExample(useraccountExample);
        //关闭连接和提交数据
        commitAndClose();
        return selectByExample;
    }
    //User end---------------------------
    
    
    
    //Enterprise------
    public static List<Enterprise> getEnterpriseDirectory(){
        start();
        EnterpriseExample enterpriseExample = new EnterpriseExample();
        enterpriseExample.createCriteria().andIdIsNotNull();
        List<Enterprise> selectByExample = enterpriseMapper.selectByExample(enterpriseExample);
        //关闭连接和提交数据
        commitAndClose();
        return selectByExample;
    } 
    
    public static Enterprise getEnterpriseById(int id){
        start();
        Enterprise selectByPrimaryKey = enterpriseMapper.selectByPrimaryKey(id);
        //关闭连接和提交数据
        commitAndClose();
        return selectByPrimaryKey;
    }
    //Enterprise end--
    
    //Organization
    public static Organization getOrganizationById(int id){
        start();
        Organization selectByPrimaryKey = organizationMapper.selectByPrimaryKey(id);
        //关闭连接和提交数据
        commitAndClose();
        return selectByPrimaryKey;
    }
    //Organization end--
    
    //Employee
    public static Employee getEmployeeById(int id){
        start();
        Employee selectByPrimaryKey = employeeMapper.selectByPrimaryKey(id);
        //关闭连接和提交数据
        commitAndClose();
        return selectByPrimaryKey;
    }
    
    public static Employee getEmployeeByUserAccountId(int userid){
        start();
        EmployeeExample employeeExample = new EmployeeExample();
        employeeExample.createCriteria().andUseraccountIdEqualTo(userid);
        List<Employee> selectByExample = employeeMapper.selectByExample(employeeExample);
        //关闭连接和提交数据
        commitAndClose();
        if(selectByExample.size()==0){
            return null;
        }
        
        return selectByExample.get(0);
    }
    //Employee end--
    
    //UserAccount
     public static UserAccount getUserAccount(String username,String password){
         start();
        UserAccountExample useraccountExample = new UserAccountExample();
        useraccountExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<UserAccount> selectByExample = userAccountMapper.selectByExample(useraccountExample);
        //关闭连接和提交数据
        commitAndClose();
        if(selectByExample.size()==0)
            return null;
        
        return selectByExample.get(0);
    }
    //UserAccount end--
     
     //House
     public static House getHouseByHouseId(int id) {
        start();
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andIdEqualTo(id);
        List<House> selectByExample = houseMapper.selectByExample(houseExample);
        //关闭连接和提交数据
        commitAndClose();
        if(selectByExample.size()==0)
            return null;
        
        return selectByExample.get(0);
    }
     
     public static House getHouseByTenantId(int id) {
        start();
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andTenantIdEqualTo(id);
        List<House> selectByExample = houseMapper.selectByExample(houseExample);
        //关闭连接和提交数据
        commitAndClose();
        if(selectByExample.size()==0)
            return null;
        
        return selectByExample.get(0);
    }
    /* public static House getHouseByOwnerId(int id) {
        start();
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andOwnerIdEqualTo(id);
        List<House> selectByExample = houseMapper.selectByExample(houseExample);
        //关闭连接和提交数据
        commitAndClose();
        if(selectByExample.size()==0)
            return null;
        
        return selectByExample.get(0);
    }*/
     
     public static List<House> getHousesAvailable(){
        start();
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andTenantIdIsNull();
        List<House> selectByExample = houseMapper.selectByExample(houseExample);
        //关闭连接和提交数据
        commitAndClose();
        if(selectByExample.size()==0)
            return null;
        
        return selectByExample;
     }
     
     public static List<House> getAllHouses(){
        start();
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andIdIsNotNull();
        List<House> selectByExample = houseMapper.selectByExample(houseExample);
        //关闭连接和提交数据
        commitAndClose();
        if(selectByExample.size()==0)
            return null;
        
        return selectByExample;
     }
     
     
     public static int addHouse(House house) {
        start();
        int id = houseMapper.insert(house);
        if(id==1){
            Tool.Success();
        }else{
            Tool.Failed();
        }
        commitAndClose();
        return id;
    }
     
     public static void updateHouse(House house) {
        start();
        int update = houseMapper.updateByPrimaryKey(house);
        if(update==1){
            Tool.Success();
        }else{
            Tool.Failed();
        }
        commitAndClose();
    }
     
     //House end
     
     //Owner
     
     //Owner end
     
     //Order
     public static List<Order> getAllOrders(){
        start();
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria().andIdIsNotNull();
        List<Order> selectByExample = orderMapper.selectByExample(orderExample);
        commitAndClose();
        
        return selectByExample;
    }
     
    public static boolean isOrderPendingByTenantId(int tenantid){
        start();
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria().andTenantIdEqualTo(tenantid).andStatusEqualTo(ORDER_STATUS_TYPE.PEND.getStatus());
        List<Order> selectByExample = orderMapper.selectByExample(orderExample);
        commitAndClose();
        return selectByExample.size()!=0;
    }
     
    public static void insertOrder(Order order){
        start();
        int insert = orderMapper.insert(order);
        if(insert==1){
            Tool.InfoString("insert order success");
        }else{
            Tool.Failed();
        }
        commitAndClose();
    }
    
    public static void updateOrder(Order order){
        start();
        int update = orderMapper.updateByPrimaryKey(order);
        if(update==1){
            Tool.InfoString("update order success");
        }else{
            Tool.Failed();
        }
        commitAndClose();
    }
     //Order end 
    
     //OrderHouseWork
     public static List<OrderHousework> getAllOrderHouseworks(){
        start();
         OrderHouseworkExample orderHouseworkExample = new OrderHouseworkExample();
        orderHouseworkExample.createCriteria().andIdIsNotNull();
        List<OrderHousework> selectByExample = orderHouseworkMapper.selectByExample(orderHouseworkExample);
        commitAndClose();
        
        return selectByExample;
     }
     
    public static int addOrderHousework(OrderHousework order) {
        start();
        int id = orderHouseworkMapper.insert(order);
        if(id==1){
            Tool.Success();
        }else{
            Tool.Failed();
        }
        commitAndClose();
        return id;
    }
    
     public static void updateOrderHousework(OrderHousework order){
        start();
        int update = orderHouseworkMapper.updateByPrimaryKey(order);
        if(update==1){
            Tool.InfoString("update orderhousework success");
        }else{
            Tool.Failed();
        }
        commitAndClose();
    }
     //OrderHouseWork end
     
     //Region
     public static List<Region> getAllRegions(){
        start();
        RegionExample regionExample  = new RegionExample();
        regionExample.createCriteria().andIdIsNotNull();
        List<Region> selectByExample = regionMapper.selectByExample(regionExample);
        commitAndClose();
        return selectByExample;
     }
     //Region end
    
    public static void commitAndClose(){
        if (sqlSession != null){
            sqlSession.commit();
            sqlSession.close();
        }
    }
}
