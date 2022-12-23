package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.model.request.UserRequest;
import com.example.demo.model.vo.RoomVo;
import com.example.demo.model.vo.TeacherVo;
import com.example.demo.utils.JsonData;
import com.example.demo.wrapper.RoomWrapper;
import com.example.demo.wrapper.Wrapper;
import io.github.yfblock.yfSql.Utils.DataRunnerUtil;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin
@RestController()
@RequestMapping("/seller/api")
public class Controller {

    Wrapper wrapper = DataRunnerUtil.getWrapper(Wrapper.class);
    RoomWrapper roomwrapper = DataRunnerUtil.getWrapper(RoomWrapper.class);
//        page=0&size=18&clientId=385&tag=hot&isDelete=1&sort=courseIndex,asc
    @GetMapping("/coursesget/getAllCoursesByConditionsWithTotal")
    public RoomVo getAllCoursesByConditionsWithTotal(@RequestParam Integer page,
                                                     @RequestParam Integer size,
                                                     @RequestParam Integer clientId,
                                                     @RequestParam Integer isDelete,
                                                     @RequestParam String sort){
        try {
            ArrayList<Room> rooms = roomwrapper.getRooms();
            ArrayList<Room> result =null;
            System.out.println();
            rooms.forEach(o->
            {
                try {
                    o.setCourseClasss(wrapper.getCourseByid(o.getCourseId()));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
            return new RoomVo(rooms.size(),rooms);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }



    @GetMapping("/teachers/getAllTeachersByConditionsWithTotal")
    public TeacherVo getAllTeachersByConditionsWithTotal(@RequestParam Integer page,
                                                         @RequestParam Integer size,
                                                         @RequestParam Integer clientId                                                       ){

        try {
            ArrayList<Teacher> teachers = wrapper.getTeachers();
            return new TeacherVo(teachers.size(),teachers);
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }




    @GetMapping("/homepages")
    public Object homepages(){

        try {
            List<About> abouts = wrapper.getAbouts();
            return abouts;
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }


    @GetMapping("/students")
    public Object students(@RequestParam("clientId.equals") String clientId){

        try {
            ArrayList<User> user = wrapper.getUserByclientId(clientId);
            System.out.println(user);
            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
//
    @PostMapping("/students")
    public Object add(@RequestBody UserRequest userRequest){
        User user = new User(userRequest);
        try {
            wrapper.add(userRequest.getName(),userRequest.getGender(),userRequest.getAge(),userRequest.getTag(),userRequest.getStatus(),userRequest.getPhone(),userRequest.getClientId(),userRequest.getCourseId(),userRequest.getUniCourseId(),userRequest.getVerify(),userRequest.getClassId());
            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/courses")
    public Object courses(@RequestParam("courseId.equals") String courseId){
        if (courseId.equals("index.html"))
        {
            try {
                ArrayList<Room> room = roomwrapper.getRooms();
                return room;
            } catch (SQLException e) {
                throw new RuntimeException(e);

            }
        }
        else {
            try {
                ArrayList<Room> room = roomwrapper.getRoom(courseId);
                return room;
            } catch (SQLException e) {
                throw new RuntimeException(e);

            }
        }
    }

    @GetMapping("/course-classes")
    public Object courseClasses(@RequestParam("courseId.equals") String courseId){
        if (courseId.equals("index.html"))
        {
            try {
                ArrayList<Course> courses = wrapper.getCourses();
                return courses;
            } catch (SQLException e) {
                throw new RuntimeException(e);

            }
        }
        else {
            try {
                ArrayList<Course> courses = wrapper.getCourseByid(courseId);
                return courses;
            } catch (SQLException e) {
                throw new RuntimeException(e);

            }
        }
    }

    @GetMapping("/students/getAllCourseByStudentWithTotal")
    public Object getAllCourseByStudentWithTotal(@RequestParam("phone") String phone){

        try {
            ArrayList<User> users = wrapper.getUserByPhone(phone);
//            System.out.println(users);
            ArrayList<Room> rooms = new ArrayList<>();
            users.forEach(o->
            {
                try {
                    ArrayList<Room> room = roomwrapper.getRoom(o.getCourseId());
                    room.forEach(a->
                    {
                        try {
                            a.setCourseClasss(wrapper.getCourseByid(a.getCourseId()));
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        }
                    });
                    rooms.addAll(room);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            });
            return new RoomVo(rooms.size(),rooms);
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
}
