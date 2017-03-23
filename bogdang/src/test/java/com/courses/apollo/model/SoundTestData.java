package com.courses.apollo.model;

import com.courses.apollo.model.sound.Sound;
import com.courses.apollo.model.sound.Style;

import java.util.ArrayList;

/**
 * Created by Богдан on 23.03.2017.
 */
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


}
