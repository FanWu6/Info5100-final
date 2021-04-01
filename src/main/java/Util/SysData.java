/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import com.neu.infofinal.bean.User;
import com.neu.infofinal.bean.UserExample;
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
    
    
    static{
        //1
         try {
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
         } catch (IOException ex) {
             java.util.logging.Logger.getLogger(SysData.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         //2.
         sqlSession = sqlSessionFactory.openSession();
         
         //3.
         userMapper = sqlSession.getMapper(UserMapper.class);
    }
    
    //User-------------------------------
    public static List<User> getAllUsers(){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdIsNotNull();
        List<User> selectByExample = userMapper.selectByExample(userExample);
        //关闭连接和提交数据
        commitAndClose();
        return selectByExample;
    }
    //User end---------------------------
    
    
    public static void commitAndClose(){
        if (sqlSession != null){
            sqlSession.commit();
            sqlSession.close();
        }
    }
}
