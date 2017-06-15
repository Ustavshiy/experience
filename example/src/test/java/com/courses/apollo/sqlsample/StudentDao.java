package com.courses.apollo.sqlsample;


import com.courses.apollo.model.Student;

import java.util.Optional;
import java.util.stream.Stream;

public interface StudentDao {

    /**
     * @return all the students as a stream. The stream may be lazily or eagerly evaluated based 
     *     on the implementation. The stream must be closed after use.
     * @throws Exception if any error occurs.
     */
    Stream<Student> getAll() throws Exception;

    /**
     * @param id unique identifier of the student.
     * @return an optional with student if a student with unique identifier <code>id</code>
     *     exists, empty optional otherwise.
     * @throws Exception if any error occurs.
     */
    Optional<Student> getById(int id) throws Exception;

    /**
     * @param student the student to be added.
     * @return true if student is successfully added, false if student already exists.
     * @throws Exception if any error occurs.
     */
    boolean add(Student student) throws Exception;

    /**
     * @param student the student to be updated.
     * @return true if student exists and is successfully updated, false otherwise.
     * @throws Exception if any error occurs.
     */
    boolean update(Student student) throws Exception;

    /**
     * @param student the student to be deleted.
     * @return true if student exists and is successfully deleted, false otherwise.
     * @throws Exception if any error occurs.
     */
    boolean delete(Student student) throws Exception;
}
