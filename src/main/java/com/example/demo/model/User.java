package com.example.demo.model;

import com.example.demo.model.request.UserRequest;
import lombok.Data;

@Data
public class User {

    private int id;
    private String clientId;
    private String courseId;
    private String classId;
    private String userId;
    private String type;
    private String name;
    private String avatalUrl;
    private String phone;
    private String email;
    private String gender;
    private String age;
    private String location;
    private String company;
    private String tag;
    private String status;
    private String createdAt;
    private String updatedAt;
    private String verify;
    private String uniCourseId;
    private String tencentUserId;
    public User()
    {

    }

    public User(UserRequest userRequest) {
        this.classId = userRequest.getClassId();
        this.courseId = userRequest.getCourseId();
        this.age = userRequest.getAge();
        this.gender = userRequest.getGender();
        this.phone = userRequest.getPhone();
        this.tag = userRequest.getTag();
        this.name = userRequest.getName();
        this.phone = userRequest.getPhone();
        this.status = userRequest.getStatus();
        this.verify = userRequest.getVerify();
        this.clientId = userRequest.getClientId();
        this.uniCourseId = userRequest.getUniCourseId();
    }
}
