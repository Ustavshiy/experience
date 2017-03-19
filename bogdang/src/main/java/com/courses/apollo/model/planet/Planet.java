package com.courses.apollo.model.planet;

import java.util.Objects;

/**
 * Created by Bogdan on 19.03.2017.
 */
public class Planet {

    /**
     * The name of the planet.
     */
    String name;

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Planet planet = (Planet) o;
        return Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

/*
 1.Создать объект класса Планета, используя классы Материк, Океан, Остров.
 Методы: вывести на консоль название материка, планеты, количество материков.
 2. Звукозапись. Определить иерархию музыкальных композиций. Записать на диск сборку.
 Подсчитать продолжительность. Провести перестановку композиций диска на основе принадлежности к стилю.
 Найти композицию, соответствующую заданному диапазону длины треков.
 */

