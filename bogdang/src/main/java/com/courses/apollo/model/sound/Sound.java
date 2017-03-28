package com.courses.apollo.model.sound;

import java.util.Objects;

/**
 * Class to create music.
 */
public class Sound {
    /**
     * Duration of the song.
     */
    private Double duration;

    /**
     * Style of the song.
     */
    private Style style;

    /**
     * Name of the song.
     */
    private String name;

    public Sound() {

    }

    public Sound(String name, Style style, Double duration) {
        this.name = name;
        this.style = style;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Sound sound = (Sound) o;
        return Objects.equals(duration, sound.duration)
                && Objects.equals(style, sound.style)
                && Objects.equals(name, sound.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, style, name);
    }

    @Override
    public String toString() {
        return "Sound{" + "duration=" + duration + ", style=" + style + ", name='" + name + '\'' + '}';
    }
}
