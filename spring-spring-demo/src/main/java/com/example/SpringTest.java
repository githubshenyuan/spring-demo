package com.example;

import com.example.controller.DemoController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author sh_home on 2018/11/24 13:48
 * @version ideaIU-2018.2.3.win
 */
public class SpringTest {
    public static  void testClass() {

        try {
            Class clazz = Class.forName("com.example.controller.DemoController");
            DemoController demoController = (DemoController)clazz.newInstance();
            Method method = clazz.getMethod("demo",String.class,int.class,boolean.class);
            method.invoke(demoController, "123", 12, true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        DemoController demoController = (DemoController) applicationContext.getBean("demoController");
        //demoController.demo();

    }
}
