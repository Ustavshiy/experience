package com.courses.apollo.sounds;

import com.courses.apollo.model.sound.Disk;
import com.courses.apollo.model.sound.Sound;
import com.courses.apollo.model.sound.Style;

import java.util.ArrayList;

/**
 * Created by Богдан on 23.03.2017.
 */
public class SoundServise {

    public Disk record(ArrayList<Sound> list) {
        Disk disk = new Disk();
       disk.setSounds(list);
       return disk;
    }

    public Double calculateDuration(Disk disk) {
        Double durationDisk = 0.0;
        for (int i = 0; i< disk.getSounds().size(); i++){
            durationDisk += disk.getSounds().get(i).getDuration();
        }
        return durationDisk;
    }

    public Disk permutation(Disk disk, Style style1, Style style2) {
        Disk sortDisk = new Disk();
        ArrayList<Sound> sortSounds = new ArrayList<>();
        for (int i = 0; i< disk.getSounds().size(); i++) {
            if (disk.getSounds().get(i).getStyle() == style1) {
                sortSounds.add(disk.getSounds().get(i));
            }
        }
        for (int i = 0; i< disk.getSounds().size(); i++) {
            if (disk.getSounds().get(i).getStyle() == style2) {
                sortSounds.add(disk.getSounds().get(i));
            }
        }
        sortDisk.setSounds(sortSounds);
        return sortDisk;
    }

    public ArrayList<Sound> findSound(Disk disk, Double minDuration, Double maxDuration) {
        ArrayList<Sound> result = new ArrayList<>();
        for (int i = 0; i < disk.getSounds().size(); i++) {
            if (disk.getSounds().get(i).getDuration() >= minDuration && disk.getSounds().get(i).getDuration()>=
                    maxDuration){
                result.add(disk.getSounds().get(i));
            }
        }
        return result;
    }
}
