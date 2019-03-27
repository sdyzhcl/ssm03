package com.hwua.serviceImpl;

import com.hwua.dao.UserDao;
import com.hwua.entity.User;
import com.hwua.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;

//服务层
@Service
public class UserServiceImpl implements UserService{

    @Autowired//是报错的
    UserDao userDao;

    @Override
    public String selectUserByUsername(String user_username,String user_password){

//        String path = "mybatis-config.xml";
//        InputStream is = Resources.getResourceAsStream(path);
//        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
//        SqlSession sqlSession = ssf.openSession();
//        UserDao userDao = sqlSession.getMapper(UserDao.class);
//        User user = userDao.selectUserByUsername("admin1");
//        System.out.println(user);

        User user = userDao.selectUserByUsername(user_username);
        if (user == null){
            return "用户名不存在";
        }else if(user.getUser_password().equals(user_password)){
            return "登陆成功";
        }else{
            return "密码错误";
        }
    }

    @Override
    @Transactional
    public int inserUser(User user) {
        int number= userDao.inserUser(user);
        return number;
    }

}
