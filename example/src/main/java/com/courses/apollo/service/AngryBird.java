package com.courses.apollo.service;

import com.courses.apollo.model.Duck;

import java.util.ArrayList;

/**
 * Created by User on 23.03.2017.
 */
public class AngryBird implements IFly {

    ArrayList<Duck> ducks;

    @Override
    public void fly() {
        System.out.println(ducks);
    }
}
