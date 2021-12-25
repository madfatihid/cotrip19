package com.cotrip.cotripjfx;

public class Tourist extends Credential {

    private String name;
    private int vacc;

    public Tourist(String username, String password, String name, int vacc) {
        super(username, password);
        this.name = name;
        this.vacc = vacc;
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
