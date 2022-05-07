package com.atguigu.crud.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 欧阳中华
 * @version 1.0
 */
public class GetSqlSession {
    public static SqlSession getSqlSession(){
        try {
            InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
            return sqlSession;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
