package com.learning.spring.debug.custom.supplier;

import java.io.Serializable;

public class Spacecraft implements Serializable {

    private Integer id;

    private String name;

    public Spacecraft() {
    }

    public Spacecraft(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Spacecraft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
