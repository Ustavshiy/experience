package com.courses.apollo.model.planet;

import java.util.Objects;

/**
 * Created by Богдан on 19.03.2017.
 */
public class Ocean extends Territory    {

    private Integer depth;

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Ocean(String name, Integer depth) {
        super(name);
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ocean ocean = (Ocean) o;
        return Objects.equals(getName(), ocean.getName())
                && Objects.equals(getDepth(), ocean.getDepth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDepth());
    }
}

