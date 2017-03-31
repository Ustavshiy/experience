package com.courses.apollo.model.figure;

import com.courses.apollo.model.SimpleSingleton;
import org.junit.Test;

public class SimpleSingletonTest {

    @Test
    public void testInstance() {
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        simpleSingleton.doSomething();
    }

}
