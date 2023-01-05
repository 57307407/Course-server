package com.example.demo.model;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Room {
    private ArrayList<Course> courseClasss;
    private String clientName;
    private String domain;
    private Integer id;
    private String clientId;
    private String courseId;
    private String title;
    private Integer type;
    private String typeId;
    private Integer isSpecail;
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
    private Integer isDelete;
    private Integer courseIndex;
    private Integer oldPrice;
    private Integer ishd;
    private String summary;
    private String showqr;
    private String introduction;
    private String linkUrl;
    private String gradeLevel;
    private Integer applyCount;
}
