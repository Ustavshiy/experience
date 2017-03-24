package com.courses.apollo.sounds;

import com.courses.apollo.model.sound.Disk;
import com.courses.apollo.model.sound.Sound;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Created sound servise.
 */
public class SoundServise {

    /**
     * Record songs to disk.
     * @param list collection of songs.
     * @param disk disc on which will be record.
     * @return durationDisk - recorded disk.
     */
    public Disk record(ArrayList<Sound> list, Disk disk) {
       disk.setSounds(list);
       return disk;
    }

    /**
     * Calculates duration tracks on the disk.
     * @param disk disc from which songs will be read.
     * @return durationDisk - Duration of songs on the disk
     */
    public Double calculateDuration(Disk disk) {
        Double durationDisk = 0.0;
        for (int i = 0; i < disk.getSounds().size(); i++) {
            durationDisk += disk.getSounds().get(i).getDuration();
        }
        return durationDisk;
    }

    /**
     * Permutated songs on the basis of their belonging to the style.
     * @param disk disc from which songs will be read.
     * @return disk - Disc with permutation songs.
     */
    public Disk permutation(Disk disk) {
        for (int i = 0; i < disk.getSounds().size(); i++) {
            for (int j = i; j < disk.getSounds().size(); j++) {
                String styleOne = disk.getSounds().get(i).getStyle().getStyle();
                String styleTwo = disk.getSounds().get(j).getStyle().getStyle();
                if (styleOne.compareTo(styleTwo) > 0) {
                    Collections.swap(disk.getSounds(), i, j);
                }
            }
        }
        return disk;
    }

    /**
     * Finds songs for a given duration.
     * @param disk disc from which songs will be read.
     * @param minDuration  Minimum duration.
     * @param maxDuration Maximum duration.
     * @return result - Wanted song.
     */
    public ArrayList<Sound> findSound(Disk disk, Double minDuration, Double maxDuration) {
        ArrayList<Sound> result = new ArrayList<>();
        for (int i = 0; i < disk.getSounds().size(); i++) {
            if (disk.getSounds().get(i).getDuration() >= minDuration && disk.getSounds().get(i).getDuration()
                    <= maxDuration) {
                result.add(disk.getSounds().get(i));
            }
        }
        return result;
    }
}
