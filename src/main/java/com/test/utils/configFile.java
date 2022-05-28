package com.test.utils;

import com.test.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class configFile {

    private static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);

    //拼接url

    public static String getUrl(InterfaceName name){
        String adderss = bundle.getString("test.url");
        String uri = "";
        if (name== InterfaceName.LOGIN){
            uri=bundle.getString("login.url");
        }
        if (name== InterfaceName.GETUSER){
            uri=bundle.getString("getUser.url");
        }

        return adderss+uri;

    }
}
