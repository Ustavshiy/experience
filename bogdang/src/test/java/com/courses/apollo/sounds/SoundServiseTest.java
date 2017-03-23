package com.courses.apollo.sounds;

import com.courses.apollo.model.SoundTestData;
import com.courses.apollo.model.sound.Disk;
import com.courses.apollo.model.sound.Style;
import org.junit.Assert;
import org.junit.Test;

import java.io.DataInput;

/**
 * Created by Богдан on 23.03.2017.
 */
public class SoundServiseTest {
    private SoundServise soundServise = new SoundServise();
    private final static Double result = 16.87;
    private final static Style style1 = new Style("Pop");
    private final static Style style2 = new Style("Rock");
    private final static Double durationMin = 2.0;
    private final static Double durationMax = 4.0;

    @Test
    public void testRecord() {
        Assert.assertEquals(SoundTestData.getDisk(), soundServise.record(SoundTestData.getSound()));
    }

    @Test
    public void testCalculateDuration() {
        Assert.assertEquals(result, soundServise.calculateDuration(SoundTestData.getDisk()));
    }

    @Test
    public void testPermutation() {
        Assert.assertEquals(SoundTestData.getSortDisk(), soundServise.permutation(SoundTestData.getDisk(),
                style1, style2));
    }

    @Test
    public void testFindSound() {
        Assert.assertEquals(SoundTestData.getFindSound(), soundServise.findSound(SoundTestData.getDisk(), durationMin,
                durationMax));
    }
}
