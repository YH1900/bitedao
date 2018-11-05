package com.dao.Impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import com.dao.UserDao;
import com.pojo.User;

@Component
public class UserDaoImpl implements UserDao {

    public void findUserById() throws IOException {
        InputStream ins = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ins);
        SqlSession sqls = sqlSessionFactory.openSession();
        //User user = new User("二狗", "wy12wy12wy12", "123456", "18703506563");
        //int x = sqls.insert(" User.InsertUser", user);
        //System.out.println(user.getId());
        // 提交事务
        sqls.commit();
        sqls.close();
    }

    @Override
    public User findeUserById(int id) throws Exception {
        InputStream ins = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ins);
        SqlSession sqls = sqlSessionFactory.openSession();
        User user = sqls.selectOne("com.UserMapper.UserDao", id);
        // 提交事务
        sqls.commit();
        sqls.close();
        return user;
    }

    public static void main(String[] args) throws Exception {
        //UserDaoImpl s = new UserDaoImpl();
        //s.findeUserById(1);

        String str = "";
        String file = "E:/QQPCMgr/Desktop/we.txt";
        List<String> list = new ArrayList<>();
        BufferedReader bre = new BufferedReader(new FileReader(file));// 此时获取到的bre就是整个文件的缓存流
        while ((str = bre.readLine()) != null) // 判断最后一行不存在，为空结束循环
        {
            list.add(str);
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        int x = 0;
        for (String s : list) {
            if (map.containsKey(s)) {
                x = (int) map.get(s) + 1;
                map.replace(s, x);
            } else {
                x = 0;
                map.put(s, x += 1);
            }
        }
        System.out.println(map.toString());
    }

    @Override
    public void deleteUser(int id) throws Exception {
        InputStream ins = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ins);
        SqlSession sqs = sqlSessionFactory.openSession();
        sqs.delete("deleteUserById", id);
    }

    @Override
    public void indertUser(User user) throws Exception {
        // TODO Auto-generated method stub

    }
}
