package com.example.demo.wrapper;

import com.example.demo.model.Room;
import com.example.demo.utils.DatabaseConfig;
import io.github.yfblock.yfSql.Annotation.DataRunner;
import io.github.yfblock.yfSql.Annotation.Select;

import java.sql.SQLException;
import java.util.ArrayList;

@DataRunner(DatabaseConfig.class)
public interface RoomWrapper {
    @Select("select * from room")
    public ArrayList<Room> getRooms() throws SQLException;

    @Select("select * from room where courseId = {0}")
    public ArrayList<Room>  getRoom(String  courseId) throws SQLException;

}
