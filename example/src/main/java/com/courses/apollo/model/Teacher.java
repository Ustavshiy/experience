package com.courses.apollo.model;

/**
 * Created by User on 27.03.2017.
 */
public class Teacher extends AbstractTeacher {
    public Teacher(int id) {
        super(id);
    }

    /* методы */
    @Override
    public boolean excludeStudent(String name) {
        return false;
    }

}
