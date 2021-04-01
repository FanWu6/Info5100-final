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
import com.neu.infofinal.bean.Organization;
import com.neu.infofinal.bean.User;
import com.neu.infofinal.bean.UserAccount;
import com.neu.infofinal.bean.UserAccountExample;
import com.neu.infofinal.bean.UserExample;
import com.neu.infofinal.mapper.EmployeeMapper;
import com.neu.infofinal.mapper.EnterpriseMapper;
import com.neu.infofinal.mapper.OrganizationMapper;
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
    static SqlSessionFactory sqlSessionFactory;
    static SqlSession sqlSession;
    
    static UserMapper userMapper;
    static EnterpriseMapper enterpriseMapper;
    static OrganizationMapper organizationMapper;
    static EmployeeMapper employeeMapper;
    static UserAccountMapper userAccountMapper; 
    

    
    public static void  start(){
         try {
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
         } catch (IOException ex) {
             java.util.logging.Logger.getLogger(SysData.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         //2.
         sqlSession = sqlSessionFactory.openSession();
         
         //3.
         userMapper = sqlSession.getMapper(UserMapper.class);
         enterpriseMapper = sqlSession.getMapper(EnterpriseMapper.class);
         organizationMapper = sqlSession.getMapper(OrganizationMapper.class);
         employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
         userAccountMapper = sqlSession.getMapper(UserAccountMapper.class);
    }
    
    //User-------------------------------
    public static List<User> getAllUsers(){
        start();
        
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdIsNotNull();
        List<User> selectByExample = userMapper.selectByExample(userExample);
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
    
    
    public static void commitAndClose(){
        if (sqlSession != null){
            sqlSession.commit();
            sqlSession.close();
        }
    }
}
