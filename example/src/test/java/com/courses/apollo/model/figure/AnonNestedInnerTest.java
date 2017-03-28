package com.courses.apollo.model.figure;

import com.courses.apollo.model.AbstractTeacher;
import com.courses.apollo.model.Ship;
import com.courses.apollo.service.IFly;
import org.junit.Test;

/**
 * Created by User on 27.03.2017.
 */
public class AnonNestedInnerTest {

    public AbstractTeacher teacher = new AbstractTeacher(1) {

        private AbstractTeacher newTeacher = new AbstractTeacher(2) {
            @Override
            public boolean excludeStudent(String name) {
                return false;
            }
        };

        @Override
        public boolean excludeStudent(String name) {
            return false;
        }

        class SuperAbstractTeacher implements IFly {
            @Override
            public void fly() {

            }
        }
    };

    @Test
    public void testInner() {
        Ship.Engine engine = new Ship(). new Engine();
        engine.launch();
        Ship.StaticEngine.doSomething();
    }

    @Test
    public void testAnonClasses() {
        teacher.getId();

        IFly iFly = new IFly() {
            @Override
            public void fly() {
                System.out.println("Test");
            }
        };
    }
}
