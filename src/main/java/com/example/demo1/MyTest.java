package com.example.demo1;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author yang shen 906318518@qq.com
 * @date 2022/1/17 15:23
 * @desc
 */
public class MyTest {
    private String name;
    private LocalDate birthday;
    private int salary;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "MyTest{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }

    public static void main(String[] args) {
//        List<MyTest> roster = new ArrayList<>();
//        Predicate<MyTest> p = e->e.getSalary()>25;
//        LocalDate d = IsoChronology.INSTANCE.date(1989,1,1);
//        long youngAndRich = roster.stream().filter(p).collect(Collectors.partitioningBy(e->e.getBirthday().isAfter(d))).get(true)
//                .count(true);
//        long youngAndRich = roster.stream().filter(p).filter(e->e.getBirthday().isAfter(d))
//                .count(true);
//        long youngAndRich = roster.stream().collect(Collectors.partitioningBy(p)).get(true)
//                .stream().collect(Collectors.partitioningBy(e->e.getBirthday().isAfter(d))).get(true).count();
//        long youngAndRich = roster.stream().filter(p&&e.getBirthday().isAfter(d)).count();

        MyTest myTest = new MyTest();
//        myTest= null;
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        myTest.setDate(date);

        System.out.println(myTest);
    }
}

