package com.example.demo.model.vo;

import com.example.demo.model.Room;

import lombok.Data;

import java.util.ArrayList;

@Data
public class RoomVo {
    private Integer totalNum;
    private ArrayList<Room> courseList;

    public RoomVo(int size,ArrayList<Room> courseList) {
        this.courseList = courseList;
        this.totalNum = size;
    }
}
