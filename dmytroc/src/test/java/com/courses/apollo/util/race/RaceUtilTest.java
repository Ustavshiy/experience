package com.courses.apollo.util.race;

import com.courses.apollo.model.race.Bolid;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by DIMA on 22.05.2017.
 */
public class RaceUtilTest {
    RaceUtil raceUtil = new RaceUtil();
    Set<Bolid> bolids = new HashSet<>();
    String expectedReaultStat = "Number 5, overtakes number 2 at 0.9729729729729731 seconds\n" +
            "Number 4, overtakes number 3 at 2.25 seconds\n" +
            "Number 4, overtakes number 1 at 5.142857142857143 seconds\n" +
            "Number 4, overtakes number 2 at 6.857142857142857 seconds\n" +
            "Number 1, overtakes number 2 at 10.285714285714286 seconds";
    Integer expectedResultCount = 6;

    @Before
    public void before() {

        bolids.add(new Bolid(1, 3, 80.0));
        bolids.add(new Bolid(2, 1, 73.0));
        bolids.add(new Bolid(3, 4, 78.0));
        bolids.add(new Bolid(4, 5, 94.0));
        bolids.add(new Bolid(5, 2, 110.0));
        raceUtil.startRace(bolids);
    }

    @Test
    public void overtakeCountTest() {
        Assert.assertEquals(expectedResultCount,raceUtil.overtakeCount());
    }

    @Test
    public void startTest() {
        Assert.assertEquals(expectedReaultStat,raceUtil.getOvertakesDetails(5));
    }
}
