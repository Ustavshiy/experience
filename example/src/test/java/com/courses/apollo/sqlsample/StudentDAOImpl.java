package com.courses.apollo.sqlsample;

import com.courses.apollo.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static com.courses.apollo.sqlsample.DataBaseConnection.getConnection;


public class StudentDAOImpl implements StudentDao {




//    @Override
//    public Stream<Student> getAll() throws Exception {
//        Connection connection;
//        try {
//            connection = getConnection();
//            PreparedStatement statement = connection.prepareStatement("SELECT * FROM EMP");
//            ResultSet resultSet = statement.executeQuery();
//            return StreamSupport.stream(new Spliterators.AbstractSpliterator<Student>(
//                    Long.MAX_VALUE,
//                    Spliterator.ORDERED) {
//
//                @Override
//                public boolean tryAdvance(Consumer<? super Student> action) {
//                    try {
//                        if (!resultSet.next()) {
//                            return false;
//                        }
//                        action.accept(createCustomer(resultSet));
//                        return true;
//                    } catch (SQLException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }, false).onClose(() -> mutedClose(connection));
//        } catch (SQLException e) {
//            throw new Exception(e.getMessage(), e);
//        }
//    }

    private Student createCustomer(ResultSet resultSet) throws SQLException {
        return new Student(resultSet.getInt("EMPNO"));
    }

    @Override
    public Stream<Student> getAll() throws Exception {
        List<Student> studentList = new ArrayList<>();
        try( Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM EMP");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                studentList.add(new Student(resultSet.getInt("EMPNO")));
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage(), e);
        }
        return studentList.stream();
    }

    @Override
    public Optional<Student> getById(int id) throws Exception {
        return null;
    }

    @Override
    public boolean add(Student student) throws Exception {
        return false;
    }

    @Override
    public boolean update(Student student) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Student student) throws Exception {
        return false;
    }

    private void mutedClose(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
