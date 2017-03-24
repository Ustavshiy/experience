package com.courses.apollo.sounds;

import com.courses.apollo.model.SoundTestData;
import org.junit.Assert;
import org.junit.Test;



/**
 * Created by Богдан on 23.03.2017.
 */
public class SoundServiseTest {
    private SoundServise soundServise = new SoundServise();
    private final static Double result = 16.87;
    private final static Double durationMin = 2.0;
    private final static Double durationMax = 4.0;

    @Test
    public void testRecord() {
        Assert.assertEquals(SoundTestData.getDisk(), soundServise.record(SoundTestData.getSound(),
                SoundTestData.getRecordDisk()));
    }

    @Test
    public void testCalculateDuration() {
        Assert.assertEquals(result, soundServise.calculateDuration(SoundTestData.getDisk()));
    }

    @Test
    public void testPermutation() {
       Assert.assertEquals(SoundTestData.getSortDisk(), soundServise.permutation(SoundTestData.getDisk()));
    }

    @Test
    public void testFindSound() {
        Assert.assertEquals(SoundTestData.getFindSound(), soundServise.findSound(SoundTestData.getDisk(), durationMin,
                durationMax));
    }

    @Test
    public void testFindSoundFirstCondition() {
        Assert.assertEquals(SoundTestData.getFindSoundOneCondition(),
                soundServise.findSound(SoundTestData.getDiskFirstCond(), durationMin, durationMax));
    }

    @Test
    public void testFindSoundSecondCondition() {
        Assert.assertEquals(SoundTestData.getFindSoundOneCondition(),
                soundServise.findSound(SoundTestData.getDiskSecondCond(), durationMin, durationMax));
    }
}
