package com.courses.apollo.model.sound;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Богдан on 23.03.2017.
 */
public class Disk {
    /**
     * List of songs on disk.
     */
    private ArrayList<Sound> sounds;

    public Disk() {
    }

    public Disk(ArrayList<Sound> sounds) {
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
        return Objects.equals(sounds, disk.sounds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sounds);
    }

    @Override
    public String toString() {
        return "Disk{" + "sounds=" + sounds + '}';
    }
}
