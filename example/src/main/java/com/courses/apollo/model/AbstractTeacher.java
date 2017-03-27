package com.courses.apollo.model;

/**
 * Created by User on 27.03.2017.
 */
public abstract class AbstractTeacher {
    private int id;

    public AbstractTeacher(int id) {
        this.id = id;
    }

    /* методы */
    public abstract boolean excludeStudent(String name);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
