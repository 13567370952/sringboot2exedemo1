package com.example.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yang shen 906318518@qq.com
 * @date 2021/12/18 12:55
 * @desc
 */
public class Test {
    public static void main(String[] args) {
//        User user = new User();
//        System.out.println(user);
        List<AA> list = new ArrayList<>();
        AA a = new AA("a",10);
        list.add(a);
        AA b = new AA("b",20);
        list.add(b);
        AA c = new AA("c",30);
        list.add(c);
        AA d = new AA("d",40);
        list.add(d);
        System.out.println("过滤前：" + list);

        List<String> list_key = new ArrayList<>();
        list_key.add("a");
        list_key.add("c");
        System.out.println("过滤条件list_key：" + list_key);

        List<AA> filterList = list.stream()
                .filter(
//                        aa -> aa.getName().equals("a")  ||
//                                aa.getName().equals("b")
                        aa -> list_key.contains(aa.getName())
                )
                .collect(Collectors.toList());

        System.out.println("过滤后：" + filterList);
    }

}
 class AA{
    String name;
    int age;
     public AA(String name, int age) {
         this.name = name;
         this.age = age;
     }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class User{
    private String name;
    private int age;

    public User(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
