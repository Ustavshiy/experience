package com.courses.apollo.service.collections;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashSet;

/**
 * Class for testing uniting and intersecting sets.
 */
public class UniteIntersectSetsTest {
    private final static UniteIntersectSets uniteIntersectSets = new UniteIntersectSets();
    private static HashSet<Integer> setOne;
    private static HashSet<Integer> setTwo;
    private static HashSet<Integer> expectedUnitedSet;
    private static HashSet<Integer> expectedIntersectedSet;

    @BeforeClass
    public static void addSets() {
        setOne = new HashSet<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        setTwo = new HashSet<Integer>() {{
            add(3);
            add(4);
            add(5);
            add(6);
        }};
        expectedUnitedSet = new HashSet<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
        }};
        expectedIntersectedSet = new HashSet<Integer>() {{
            add(3);
            add(4);
        }};
    }

    @Test
    public void uniteSetsTest() {
        Assert.assertEquals(uniteIntersectSets.uniteSets(setOne, setTwo), expectedUnitedSet);
    }

    @Test
    public void intersectSetsTest() {
        Assert.assertEquals(uniteIntersectSets.intersectSets(setOne, setTwo), expectedIntersectedSet);
    }
}