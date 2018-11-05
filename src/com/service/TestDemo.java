package com.service;

class Person {
    String name;
    int age;

    public void tell() {
        System.out.println("姓名：" + name + "，年龄：" + age);
    }
}

public class TestDemo {
    public static void main(String args[]) {
        Person per1 = new Person();
        Person per2 = new Person();
        per1.name = "张三";
        per1.age = 20;
        //	1. 李四 30 2. 李四 30  3. 李四 30
        per2.name = "李四";
        per2.age = 30;

        Person per3 = per1;
        per3.name = "王五";
        per3 = per2;

        per1 = per2;

        per2.name = per3.name;
        per3.age = per1.age;
        per1.tell();
        per2.tell();
        per3.tell();
    }
}
