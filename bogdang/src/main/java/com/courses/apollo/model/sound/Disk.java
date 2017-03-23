package com.courses.apollo.model.sound;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Богдан on 23.03.2017.
 */
public class Disk {
    private ArrayList<Sound> sounds;


    public Disk( ArrayList<Sound> sounds) {
        this.sounds = sounds;
    }

    public ArrayList<Sound> getSounds() {
        return sounds;
    }

    public void setSounds(ArrayList<Sound> sounds) {
        this.sounds = sounds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Disk disk = (Disk) o;
        return Objects.equals(getSounds(), disk.getSounds());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSounds());
    }
}
