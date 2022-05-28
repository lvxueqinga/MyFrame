package com.test.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class databaseUtil {

    public static SqlSession getSqlsession() throws IOException {
        //获取配置资源文件
        Reader reader = Resources.getResourceAsReader("databaseConfig.xml");

        //加载配置文件
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

        //这个就是执行文件的sql语句
        SqlSession sqlSession = factory.openSession();

        return sqlSession;
    }
}
