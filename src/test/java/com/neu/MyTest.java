package com.neu;

import com.neu.infofinal.bean.User;
import com.neu.infofinal.bean.UserExample;
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
    @BeforeClass
    public static void initFactory() throws IOException {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
    }
    @Before
    public void before(){
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }
    @After
    public void commitAndClose(){
        if (sqlSession != null){
            sqlSession.commit();
            sqlSession.close();
        }
    }


    @Test
    public void mytest1(){
        UserExample userExample = new UserExample();
//        addressExample.createCriteria().
        userExample.createCriteria().andIdIsNotNull();
        List<User> selectByExample = userMapper.selectByExample(userExample);
        for (User user:selectByExample) {
            logger.info(user);

//            address.setName("沃特3");
//            address.setId(null);
//            addressMapper.insert(address);
//            break;
        }

    }
    
    @Test
    public void mytest2(){
        System.out.println("test2");
    }
}
