package org.fanshe;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.ResourceBundle;

public class Test2 {

    @Test
    public void test() throws Exception {
        Properties properties = new Properties();
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("pro.properties");
        properties.load(is);


        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class c = Class.forName(className);
        Object obj = c.newInstance();
        Method method = c.getMethod(methodName);
        method.invoke(obj);

    }

}
