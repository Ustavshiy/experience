package com.courses.apollo.model;

/**
 * Created by User on 27.03.2017.
 */
public final class TeacherCreator {
    private TeacherCreator() {
    }

    /**
     * Method.
     *
     * @param id int id.
     * @return int.
     */
    public static AbstractTeacher createTeacher(int id) {
        /**
         * Inner class.
         */
        class Rector extends AbstractTeacher {
            Rector(int id) {
                super(id);
            }

            @Override
            public boolean excludeStudent(String name) {
                return true;
            }
        } // конец внутреннего класса

        if (isRectorId(id)) {
            return new Rector(id);
        } else {
            return new Teacher(id);
        }
    }

    private static boolean isRectorId(int id) {
        // проверка id
        return id == 2; // stub
    }
}
