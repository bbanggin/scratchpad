package com.example.demo.model;

public class Pet {
    private Integer id;
    private String name;
    private PetType type;
    private Integer age;

    public Pet(Integer id, String name, PetType type, Integer age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
