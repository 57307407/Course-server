package com.example.demo.model;

import lombok.Data;

@Data
public class Teacher {
    private int id;
    private String clientId;
    private String teacherId;
    private String type;
    private String name;
    private String avatarUrl;
    private String phone;
    private String email;
    private String gender;
    private String age;
    private String location;
    private String company;
    private String role;
    private String coursesCount;
    private String studentsCount;
    private String info;
    private String tag;
    private String createdAt;
    private String updatedAt;
}
