package org.entity;

import java.util.Date;
import java.util.Objects;

public class Student {

    private String name;
    private Integer age;
    private String avg;

    public Student(String name, Integer age, String avg) {
        this.name = name;
        this.age = age;
        this.avg = avg;
    }

    private Student(String name){
        this.name = name;
    }

    public Student(){}

    public String getName() {
        System.out.println(name);
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAvg() {
        return avg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avg='" + avg + '\'' +
                '}';
    }

    public void show(){
        System.out.println("-----------------------------");
    }
}
