package com.example.demo.model;

import java.util.List;

public class Owner {
    private Integer id;
    private String name;
    private String password;
    private List<Pet> pets;

    public Owner(Integer id, String name, String password, List<Pet> pets) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.pets = pets;
    }


}
