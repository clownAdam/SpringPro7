package com.itlike.test;

/**
 * @ProjectName: SpringPro7
 * @Package: com.itlike.test
 * @ClassName: User
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/21 1:49
 * @Version: 1.0
 */
public class User {
    String name;
    int age;
    User(String name,int age){
        this.name=name;
        this.age=age;
    }
    static void show(){

    }
    public static void main(String[] args) {
        User.show();
    }
}
