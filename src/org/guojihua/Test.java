package org.guojihua;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 国际化
 * Locale类搭配ResourceBundle类
 */
public class Test {

    @org.junit.Test
    public void test(){

        ResourceBundle resourceBundle = ResourceBundle.getBundle("my",new Locale("zh","CN"));
        String user = resourceBundle.getString("user");
        System.out.println(user);

        Locale us = new Locale("en","US");
        ResourceBundle bundle = ResourceBundle.getBundle("my", us);
        String cancel_english = bundle.getString("user");
        System.out.println(cancel_english);
    }
}
