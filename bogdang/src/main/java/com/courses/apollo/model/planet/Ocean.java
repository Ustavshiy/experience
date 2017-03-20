package com.courses.apollo.model.planet;

import java.util.Objects;

/**
 * Created by Богдан on 19.03.2017.
 */
public class Ocean {

    private String name;

    public  Ocean(){

    }

    public Ocean(String name){
        this.name = name;
    }


   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ocean ocean = (Ocean) o;
        return Objects.equals(name, ocean.name);
                }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

