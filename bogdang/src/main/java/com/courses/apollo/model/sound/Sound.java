package com.courses.apollo.model.sound;

import java.util.Objects;

/**
 * Created by Богдан on 23.03.2017.
 */
public class Sound {
    private Double duration;

    private Style style;

    private String name;

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

    public Sound(String name, Style style, Double duration) {
        this.name = name;
        this.style = style;
        this.duration = duration;
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
        return Objects.equals(getName(), sound.getName())
                && Objects.equals(getDuration(), sound.getDuration())
                && Objects.equals(getStyle(), sound.getStyle());
      }

    @Override
    public int hashCode() {
         return Objects.hash(getName(),getDuration(),getDuration());
    }
}
