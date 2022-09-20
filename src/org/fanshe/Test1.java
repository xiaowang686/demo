package org.fanshe;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {

    @Test
    public void test() throws Exception {
        //通过反射越过泛型检查
        ArrayList<Integer> list = new ArrayList<>();
        Class<? extends ArrayList> c = list.getClass();
        Method method = c.getMethod("add",Object.class);
        method.invoke(list,"哈哈哈");
        System.out.println(list);
        }
}

