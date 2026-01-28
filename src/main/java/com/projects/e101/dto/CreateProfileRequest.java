package com.projects.e101.dto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


public class CreateProfileRequest {
    @NotBlank
    private String name;
    @Min(18)
    @Max(99)
    private int age;
    @NotBlank
    private String city;

    public CreateProfileRequest() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
