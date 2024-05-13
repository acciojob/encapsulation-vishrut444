package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "vishrut";//Error: name' has private access in 'com.driver.RWOnly'
//        System.out.println(obj.name);//Error: name' has private access in 'com.driver.RWOnly'

        obj.setName("vishrut");
        System.out.println(obj.getName());
    }
}