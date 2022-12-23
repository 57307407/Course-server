package com.example.demo.utils;

import io.github.yfblock.yfSql.Runner.SqlRunner;

public class DatabaseConfig extends SqlRunner {
    /**
     * SqliteRunner Constructor, build a sqlite runner
     */
    public DatabaseConfig() {

         super("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/course", "root", "123456");
    }
}