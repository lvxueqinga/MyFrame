package com.test.cases;

import com.test.config.TestConfig;
import com.test.model.InterfaceName;
import com.test.model.User;
import com.test.utils.configFile;
import com.test.utils.databaseUtil;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class carProduct {


    /**
     *
     *  git config --global --unset http.proxy
     *  启动 jenkins：     nohup java -jar jenkins.war --httpPort=8899 &
     */

    @BeforeTest(description = "测试准备工作")
    public void beforeTest(){
        TestConfig.getUserUrl = configFile.getUrl(InterfaceName.GETUSER);
        TestConfig.loginUrl = configFile.getUrl(InterfaceName.LOGIN);

        TestConfig.defaultHttpClient = new DefaultHttpClient();
    }

    @Test(description = "用户登录")
    public void logingetUser() throws IOException {
        SqlSession sqlSession = databaseUtil.getSqlsession();
        User user = sqlSession.selectOne("getUser",1);
        System.out.println(user);
    }
}
