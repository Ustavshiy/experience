package com.courses.apollo.sqlsample;

import com.courses.apollo.model.Student;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Created by User on 12.06.2017.
 */
public class SelectExample {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    StudentDao studentDao = new StudentDAOImpl();

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
    public void testSQLInjection() {
        List<Integer> integers = getByParameter(1.1);
        System.out.println(integers);
    }

    @Test
    public void testStudentDao() throws Exception {
        Stream<Student> studentStream = studentDao.getAll();
        studentStream.forEach(System.out::println);
    }

    @Test
    public void testCallableStatement() {
        System.out.println(getTotal());
    }

    public Integer getTotal() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             CallableStatement stmt = conn.prepareCall("{ ? = call totalRecords()}")) {
            stmt.registerOutParameter(1, Types.INTEGER);
            stmt.execute();
            return  (Integer) stmt.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Integer> getByParameter(double percent) {
        String sql = "SELECT * FROM emp WHERE comm >=sal*?";
        List<Integer> integers = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, percent);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("empno");
                integers.add(id);
                System.out.println("EMP: " + id + "|");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return integers;
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
