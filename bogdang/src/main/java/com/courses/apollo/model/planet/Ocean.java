package com.courses.apollo.model.planet;

import java.util.Objects;

/**
 * Created by Богдан on 19.03.2017.
 */
public class Ocean extends Planet {

    public Ocean() {
    }

    public Ocean(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ocean ocean = (Ocean) o;
        return Objects.equals(getName(), ocean.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

