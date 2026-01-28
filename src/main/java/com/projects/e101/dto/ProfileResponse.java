package com.projects.e101.dto;

import com.projects.e101.model.User;

public class ProfileResponse {
    private String id;
    private String name;
    private int age;
    private String city;


    public ProfileResponse() {}
    public ProfileResponse(String id, String name, int age, String city) {
        this.id=id;
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public ProfileResponse(User user) {
        this.id=user.getId();
        this.name=user.getName();
        this.age=user.getAge();
        this.city=user.getCity();
    }




    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}


