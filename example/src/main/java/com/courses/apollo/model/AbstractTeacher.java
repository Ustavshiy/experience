package com.courses.apollo.model;

/**
 * Created by User on 27.03.2017.
 */
public abstract class AbstractTeacher {
    /**
     * int id.
     */
    private int id;

    public AbstractTeacher(int id) {
        this.id = id;
    }

    /**
     * Some method.
     *
     * @param name String.
     * @return int.
     */
    public abstract boolean excludeStudent(String name);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
