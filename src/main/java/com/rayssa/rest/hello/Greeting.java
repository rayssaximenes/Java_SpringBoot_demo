package com.rayssa.rest.hello;

public class Greeting {
    private final String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}