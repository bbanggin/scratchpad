package com.example.demo.model;

import java.util.List;

public class Owner {
    private Integer id;
    private String name;
    private String password;
    private List<Pet> pets;
    private String address;
    private String phone;

    public Owner(Integer id, String name, String password, String address, String phone, List<Pet> pets) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.pets = pets;
        this.address = address;
        this.phone = phone;
    }


}
