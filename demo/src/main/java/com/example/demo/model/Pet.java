package com.example.demo.model;


import java.time.LocalDate;

public class Pet {
    private Integer id;
    private String name;
    private PetType type;
    private Integer age;
    private LocalDate birthday;

    public Pet(Integer id, String name, PetType type, Integer age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
