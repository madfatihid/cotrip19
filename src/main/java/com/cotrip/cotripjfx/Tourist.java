package com.cotrip.cotripjfx;

public class Tourist {

    private String username;
    private String password;
    private String name;
    private int vacc;


    public Tourist(String username, String password, String name, int vacc) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.vacc = vacc;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVacc() {
        return vacc;
    }

    public void setVacc(int vacc) {
        this.vacc = vacc;
    }
}
