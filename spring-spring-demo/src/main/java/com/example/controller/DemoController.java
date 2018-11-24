package com.example.controller;

/**
 * @author sh_home on 2018/11/24 13:47
 * @version ideaIU-2018.2.3.win
 */
public class DemoController {
    private String username;
    private String password;
    public void demo( ) {
        System.out.println("demoController 输出");


    }
    public void demo(String a ,int b, boolean c) {
        System.out.println("demoController输入：" + a + "  " + "  " + b + "  " + c);

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
