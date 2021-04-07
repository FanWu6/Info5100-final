package com.neu;

import com.neu.infofinal.bean.Employee;
import com.neu.infofinal.bean.User;
import com.neu.infofinal.bean.UserAccount;
import com.neu.infofinal.bean.UserExample;
import com.neu.infofinal.mapper.EmployeeMapper;
import com.neu.infofinal.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    private final Logger logger = Logger.getLogger(this.getClass());

    static SqlSessionFactory sqlSessionFactory;
    SqlSession sqlSession;
    UserMapper userMapper;
    EmployeeMapper employeeMapper;
    
    @BeforeClass
    public static void initFactory() throws IOException {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
    }
    @Before
    public void before(){
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
    }
    @After
    public void commitAndClose(){
        if (sqlSession != null){
            sqlSession.commit();
            sqlSession.close();
        }
    }
    
//    @Test
//    public void mytest5(){
//        List<Employee> queryuseraccount = employeeMapper.queryuseraccount();
//        for(Employee user : queryuseraccount){
//            System.out.println(user);
//            
//        }
//    }


//    @Test
//    public void mytest1(){ //查询所有数据
//        UserExample userExample = new UserExample();
////        addressExample.createCriteria().
//        userExample.createCriteria().andIdIsNotNull();
//        List<User> selectByExample = userMapper.selectByExample(userExample);
//        for (User user:selectByExample) {
//            System.out.println(user);
//        }
//
//    }
//    
//    @Test
//    public void mytest2(){ //根据id查某一个数据
//        User selectByPrimaryKey = userMapper.selectByPrimaryKey(1);
//        System.out.println(selectByPrimaryKey);
//       
//    }
//    
//    @Test
//    public void mytest3(){ //更新某一行数据,比如说我想把id为1的user的password改了
//        //先获取id为1的数据
//        User user = userMapper.selectByPrimaryKey(1);
//        user.setPassword("asdqwe");
//        userMapper.updateByPrimaryKey(user);
//       
//    }
//    
//    @Test
//    public void mytest4(){ //插入一条新数据
//        User user = new User();
//        user.setUsername("bowen");
//        user.setPassword("123456");
//        user.setAge(18);
//        user.setGender("male");
//        user.setUpdateDate(new Date());
//        userMapper.insert(user);
//    }
//    
//    @Test
//    public void mytest5(){ //删除一条数据
//        userMapper.deleteByPrimaryKey(5); //删除id为5的那一条
//    }
}
