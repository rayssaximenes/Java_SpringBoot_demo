package com.rayssa.rest.cars;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
    private @Id @GeneratedValue Long id;
    private String name;
    private String color;

    public Car() {
    }

    public Car(String name, String color) {

        this.name = name;
        this.color = color;
    }

    public Long getId() { return this.id; }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public void setId(Long id) {
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


