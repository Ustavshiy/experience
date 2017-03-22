package com.courses.apollo.model.planet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Bogdan on 19.03.2017.
 */
public class Planet extends Territory {

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Planet(String name, Integer number) {
        super(name);
        this.number = number;
    }

    public String toString() {
        return getName();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Planet planet = (Planet) o;
        return Objects.equals(getName(), planet.getName())
            && Objects.equals(getNumber(), planet.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getNumber());
    }
}

/*
 1.Создать объект класса Планета, используя классы Материк, Океан, Остров.
 Методы: вывести на консоль название материка, планеты, количество материков.
 2. Звукозапись. Определить иерархию музыкальных композиций. Записать на диск сборку.
 Подсчитать продолжительность. Провести перестановку композиций диска на основе принадлежности к стилю.
 Найти композицию, соответствующую заданному диапазону длины треков.
 */

