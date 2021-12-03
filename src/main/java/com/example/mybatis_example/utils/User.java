package com.example.mybatis_example.utils;

public class User {
    private int id;
    private String name;
    private int status;

    public User() {

    }

    public User(Integer id, String name, Integer status) {
        super();
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
