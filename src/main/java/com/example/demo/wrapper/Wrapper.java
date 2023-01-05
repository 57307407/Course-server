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



    @Select("select * from teacher where clientId = {0}")
    public ArrayList<Teacher> getTeachersByClientId(Integer clientId) throws SQLException;
    @Select("select * from about where clientId = {0}")
    public ArrayList<About> getAboutsByClientId(Integer clientId) throws SQLException;
    @Select("select * from class where courseId = {0}")
    public ArrayList<Course> getCourseByid(String  courseId) throws SQLException;
    @Select("select * from class where courseId = {0} and clientId = {1}")
    public ArrayList<Course> getCourseByidAndClientId(String  courseId,Integer clientId) throws SQLException;
    @Select("select * from user where phone = {0}")
    public ArrayList<User> getUserByPhone(String  phone) throws SQLException;
    @Select("select * from user where clientId = {0} and phone = {1}")
    public ArrayList<User> getUserByclientIdAndPhone(String  clientId , String phone) throws SQLException;
    @Select("select * from user where clientId = {0} and courseId = {1}")
    public ArrayList<User> getUserByclientIdAndCourse(String  clientId , String courseId) throws SQLException;
    @Select("insert into user (clientId,phone) values ('{0}','{1}')")
    public ArrayList<User> addUser(String  clientId , String phone) throws SQLException;
    @Insert("insert into user (name,gender,age,tag,status,phone,clientId,courseId,uniCourseId,verify,classId) values ('{0}','{1}','{2}','{3}','{4}','{5}','{6}','{7}',{8},'{9}','{10}')")
    public Integer  add(String  name,String  gender,String  age,String  tag,String  status,String  phone,String  clientId,String  courseId,String  uniCourseId,String  verify,String  classId) throws SQLException;
}
