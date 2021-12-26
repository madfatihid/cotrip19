package com.cotrip.cotripjfx;

public class Country extends Credential {
    private String name;
    private boolean closed;

    public Country(String username, String password, String name, boolean closed) {
        super(username, password);
        this.name = name;
        this.closed = closed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    @Override
    public String toString() {
        return name;
    }
}
