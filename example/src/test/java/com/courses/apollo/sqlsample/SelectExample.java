package com.courses.apollo.sqlsample;

import org.junit.Test;

import java.sql.*;

/**
 * Created by User on 12.06.2017.
 */
public class SelectExample {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

    // Database credentials
    static final String USER = "postgres";
    static final String PASS = "root";
    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelect() throws Exception {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM EMP";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("empno");
//                int age = rs.getInt("age");
//                String first = rs.getString("first");
//                String last = rs.getString("last");

                System.out.println("EMP: " + id + "|");
//                System.out.print(", Age: " + age);
//                System.out.print(", First: " + first);
//                System.out.println(", Last: " + last);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
