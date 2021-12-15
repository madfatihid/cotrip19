package com.cotrip.cotripjfx;

public class Country {
    private String name;
    private boolean closed;

    public Country(String name, boolean closed) {
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
}
