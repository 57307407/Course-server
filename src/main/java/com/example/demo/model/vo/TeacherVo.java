package com.example.demo.model.vo;

import com.example.demo.model.Teacher;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TeacherVo {
    private Integer totalNum;
    private ArrayList<Teacher> teacherList;

    public TeacherVo(int size,ArrayList<Teacher> teachers) {
        this.teacherList = teachers;
        this.totalNum = size;
    }
}
