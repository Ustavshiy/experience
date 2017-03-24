package com.courses.apollo.model;

import com.courses.apollo.model.sound.Disk;
import com.courses.apollo.model.sound.Sound;
import com.courses.apollo.model.sound.Style;

import java.util.ArrayList;


public class SoundTestData {

    public static ArrayList<Sound> getSound() {
        ArrayList<Sound> sounds = new ArrayList<>();
        sounds.add(new Sound("DDT",new Style("Rock"), 1.32));
        sounds.add(new Sound("VDT",new Style("Pop"), 2.54));
        sounds.add(new Sound("TVD",new Style("Rock"), 3.58));
        sounds.add(new Sound("TTT",new Style("Pop"), 5.11));
        sounds.add(new Sound("RRR",new Style("Pop"), 4.32));
        return sounds;
    }

    public static Disk getDisk() {
        Disk disk = new Disk(getSound());
        return disk;
    }

    public static ArrayList<Sound> getSortSound() {
        ArrayList<Sound> sounds = new ArrayList<>();
        sounds.add(new Sound("VDT",new Style("Pop"), 2.54));
        sounds.add(new Sound("TTT",new Style("Pop"), 5.11));
        sounds.add(new Sound("RRR",new Style("Pop"), 4.32));
        sounds.add(new Sound("DDT",new Style("Rock"), 1.32));
        sounds.add(new Sound("TVD",new Style("Rock"), 3.58));
        return sounds;
    }

    public static Disk getSortDisk() {
        Disk disk = new Disk(getSortSound());
        return disk;
    }

    public static ArrayList<Sound> getFindSound() {
        ArrayList<Sound> sounds = new ArrayList<>();
        sounds.add(new Sound("VDT",new Style("Pop"), 2.54));
        sounds.add(new Sound("TVD",new Style("Rock"), 3.58));
        return sounds;
    }

    public static ArrayList<Sound> getSoundFirstCond() {
        ArrayList<Sound> sounds = new ArrayList<>();
        sounds.add(new Sound("TTT",new Style("Pop"), 5.11));
        sounds.add(new Sound("RRR",new Style("Pop"), 4.32));
        return sounds;
    }

    public static Disk getDiskFirstCond() {
        Disk disk = new Disk(getSoundFirstCond());
        return disk;
    }

    public static ArrayList<Sound> getSoundSecondCond() {
        ArrayList<Sound> sounds = new ArrayList<>();
        sounds.add(new Sound("DDT",new Style("Rock"), 1.32));
        return sounds;
    }

    public static Disk getDiskSecondCond() {
        Disk disk = new Disk(getSoundSecondCond());
        return disk;
    }

    public static ArrayList<Sound> getFindSoundOneCondition() {
        ArrayList<Sound> sounds = new ArrayList<>();
        return sounds;
    }

    public static ArrayList<Sound> getRecordSound() {
        ArrayList<Sound> sounds = new ArrayList<>();
        return sounds;
    }

    public static Disk getRecordDisk() {
        Disk disk = new Disk(getRecordSound());
        return disk;
    }

}
