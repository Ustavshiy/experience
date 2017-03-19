package com.courses.apollo.model.planet;

import java.util.Objects;

/**
 * Created by Богдан on 19.03.2017.
 */
public class Ocean extends Planet{

    /**
     * The depth of the Ocean.
     */
    private Integer depth;

    public Integer getDepth() { return depth; }

    public void setDepth(Integer depth) { this.depth = depth; }

    public Ocean(String name, Integer depth){
        super(name);
        this.depth = depth;
    }


   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ocean ocean = (Ocean) o;
        return Objects.equals(name, ocean.name)
                && Objects.equals(depth, ocean.depth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, depth);
    }
}

