package com.example.demo.model;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Room {
    private ArrayList<Course> courseClasss;
    private String clientName;
    private String domain;
    private int id;
    private String clientId;
    private String courseId;
    private String title;
    private int type;
    private String typeId;
    private int isSpecail;
    private String coverUrl;
    private String teacher;
    private String startAt;
    private String location;
    private String info;
    private String buyersCount;
    private String price;
    private String tag;
    private String totalNum;
    private String createdAt;
    private String updatedAt;
    private String roomId;
    private String status;
    private int isDelete;
    private int courseIndex;
    private int oldPrice;
    private int ishd;
    private String summary;
    private String showqr;
    private String introduction;
    private String linkUrl;
    private String gradeLevel;
    private int applyCount;
}
