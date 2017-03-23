package com.courses.apollo.sounds;

import com.courses.apollo.model.sound.Disk;
import com.courses.apollo.model.sound.Sound;

import java.util.ArrayList;

/**
 * Created by Богдан on 23.03.2017.
 */
public class SoundServise {

    public Disk record(ArrayList<Sound> list, Disk disk) {
       disk.setSounds(list);
       return disk;
    }

    public Double CalculateDuration(Disk disk) {
        Double durationDisk = 0.0;
        for (int i = 0; i< disk.getSounds().size(); i++){
            durationDisk += disk.getSounds().get(i).getDuration();
        }
        return durationDisk;
    }

}
