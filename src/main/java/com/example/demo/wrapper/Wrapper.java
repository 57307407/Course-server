package com.example.demo.wrapper;

import com.example.demo.model.*;
import com.example.demo.model.Class;
import com.example.demo.utils.DatabaseConfig;
import io.github.yfblock.yfSql.Annotation.DataRunner;
import io.github.yfblock.yfSql.Annotation.Insert;
import io.github.yfblock.yfSql.Annotation.Select;

import java.sql.SQLException;
import java.util.ArrayList;

@DataRunner(DatabaseConfig.class)
public interface Wrapper {


    @Select("select * from teacher")
    public ArrayList<Teacher> getTeachers() throws SQLException;
    @Select("select * from about")
    public ArrayList<About> getAbouts() throws SQLException;

    @Select("select * from class where courseId = {0}")
    public ArrayList<Course> getCourseByid(String  courseId) throws SQLException;
    @Select("select * from class ")
    public ArrayList<Course> getCourses() throws SQLException;
    @Select("select * from user where phone = {0}")
    public ArrayList<User> getUserByPhone(String  phone) throws SQLException;
    @Select("select * from user where clientId = {0}")
    public ArrayList<User> getUserByclientId(String  clientId) throws SQLException;
    @Select("select courseId from user where phone = {0}")
    public ArrayList<String> getcourseIdByPhone(String  phone) throws SQLException;
    @Insert("insert into user (name,gender,age,tag,status,phone,clientId,courseId,uniCourseId,verify,classId) values ('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}',{8},'{9}','{10}')")
    public Integer  add(String  name,String  gender,String  age,String  tag,String  status,String  phone,String  clientId,String  courseId,String  uniCourseId,String  verify,String  classId) throws SQLException;
}
