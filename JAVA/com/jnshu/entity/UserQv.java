package com.jnshu.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

//一定要实现序列话 serializable
public class UserQv implements Serializable {

    private static final long serialVersionUID = -6011241820070393952L;
    private String  id;
    private String name;
    private String  age;

    public UserQv(){
    }

    public UserQv(String  id,String name,String  age){
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "UserQv [id=" + id + ",name=" + name + ",age=" + age + "]";
    }

    public String  getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getAge() {
        return age;
    }

    public void setAge(String  age) {
        this.age = age;
    }
}

