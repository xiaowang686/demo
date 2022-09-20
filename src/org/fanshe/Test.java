package org.fanshe;

import org.entity.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Format;
import java.util.Date;

public class Test {
    /*
      通过反射获取静态成员变量，并赋值
    */
    @org.junit.Test
    public void test() throws Exception {
        //获取class对象
        Class<?> c = Class.forName("org.entity.Student");
        Constructor constructor = c.getConstructor(String.class,Integer.class,String.class);
        Object obj = constructor.newInstance("小小",12,"男");
        System.out.println(obj);
//        Field name = c.getDeclaredField("name");
//        Field age = c.getDeclaredField("age");
//        Field avg = c.getDeclaredField("avg");
//        //获取无参构造方法
//        Constructor constructor = c.getConstructor();
//        Object obj = constructor.newInstance();
//        //获取私有的成员变量需要暴力反射，此处关闭访问检查
//        name.setAccessible(true);
//        age.setAccessible(true);
//        avg.setAccessible(true);
//        //赋值
//        name.set(obj,"小小");
//        age.set(obj,10);
//        avg.set(obj,"男");
//        //使用class对象调用指定方法
//
//        Method method = c.getMethod("getName");
//        //obj:调用方法的对象
//        //args:方法需要的参数
//        method.invoke(obj);

    }
}
