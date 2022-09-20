package org.fanshe;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test2 {

    @Test
    public void test() throws Exception {

        Properties properties = new Properties();

        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("pro.properties");
        properties.load(in);

        String classname = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class c = Class.forName(classname);
        Object obj = c.newInstance();
        Method method = c.getMethod(methodName);
        method.invoke(obj);

    }

}
