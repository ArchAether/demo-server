package com.archaether.demoserver;

public class User {
    private String name;
    private String password;
    private long id;
    
    public User(String name, String password, long id){
        this.name = name;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public long getId() {
        return this.id;

    }
}
