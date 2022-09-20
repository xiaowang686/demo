package org;

import org.entity.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Test {

    @org.junit.Test
    public void test() throws Exception {
        Class<?> c = Class.forName("org.entity.Student");
        Constructor[] cons = c.getConstructors();
        Constructor con = c.getDeclaredConstructor(String.class);
        con.setAccessible(true);
        Object obj = con.newInstance("哦哦");
        System.out.println(obj);
    }
}
