package com.example.demo;

import java.io.Serializable;

class Foo implements Serializable {
    private long id;
    private String name;

    public Foo(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Foo() {
        // Default constructor
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}





