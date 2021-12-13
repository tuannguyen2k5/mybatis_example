package com.example.mybatis_example.utils;

public class User {
    private int id;
    private String name;
<<<<<<< HEAD
    private String email;
    private String password;
=======
>>>>>>> 274d5c950b99fce79e5478d2ad45f388d85b214c
    private int status;

    public User() {

    }

<<<<<<< HEAD
    public User(Integer id, String name, String email, String password, Integer status) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
=======
    public User(Integer id, String name, Integer status) {
        super();
        this.id = id;
        this.name = name;
>>>>>>> 274d5c950b99fce79e5478d2ad45f388d85b214c
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

<<<<<<< HEAD
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

=======
>>>>>>> 274d5c950b99fce79e5478d2ad45f388d85b214c
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
