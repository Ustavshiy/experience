package com.courses.apollo.model.planet;

import java.util.Objects;

/**
 * Created by Bogdan on 19.03.2017.
 */
public class Planet {

    /**
     * The name of the planet.
     */
    private String name;

    /**
     * The number by size planet.
     */
    private Integer number;

    public Planet(){
    }

    public Planet(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Planet planet = (Planet) o;
        return Objects.equals(name, planet.name)
                && Objects.equals(number, planet.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}

/*
 1.Создать объект класса Планета, используя классы Материк, Океан, Остров.
 Методы: вывести на консоль название материка, планеты, количество материков.
 2. Звукозапись. Определить иерархию музыкальных композиций. Записать на диск сборку.
 Подсчитать продолжительность. Провести перестановку композиций диска на основе принадлежности к стилю.
 Найти композицию, соответствующую заданному диапазону длины треков.
 */

