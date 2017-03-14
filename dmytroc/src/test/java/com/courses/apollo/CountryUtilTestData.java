package com.courses.apollo;

import com.courses.apollo.model.state.City;
import com.courses.apollo.model.state.Country;
import com.courses.apollo.model.state.Province;

import java.util.ArrayList;
/**
 * Created by Dell on 14.03.2017.
 * Создать приложение, удовлетворяющее требованиям, приведенным в задании.
 * Наследование применять только в тех заданиях, в которых это логически обосновано.
 * Аргументировать принадлежность классу каждого создаваемого метода
 * и корректно переопределить для каждого класса методы equals(), hashCode(), toString().
 * <p>
 * Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
 * Каждый класс должен иметь отражающее смысл название и информативный состав.
 * Наследование должно применяться только тогда, когда это имеет смысл.
 * Классы должны быть грамотно разложены по пакетам.
 * <p>
 * 1. Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 * <p>
 * 2.Шеф-повар. Определить иерархию овощей. Сделать салат. Подсчитать калорийность.
 * Провести сортировку овощей для салата на основе одного из параметров.
 * Найти овощи в салате, соответствующие заданному диапазону калорийности.
 */

public class CountryUtilTestData {

    public static Country getState() {
        Country state = new Country("Liechtenstein", CountryUtilTestData.getProvinces());
        return state;
    }

    public static ArrayList<Province> getProvinces() {
        ArrayList<Province> provinces = new ArrayList<>();
        provinces.add(new Province("Oberland", CountryUtilTestData.getOberlandCities(), 125478));
        provinces.add(new Province("Unterland", CountryUtilTestData.getUnterlandCities(), 34996));
        return provinces;
    }

    public static ArrayList<City> getOberlandCities() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Balzers", true, false));
        cities.add(new City("Vaduz", true, true));
        cities.add(new City("Planken", false, false));
        cities.add(new City("Triesen", false, false));
        cities.add(new City("Triesenberg", false, false));
        cities.add(new City("Schaan", false, false));
        return cities;
    }

    public static ArrayList<City> getUnterlandCities() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Gamprin", false, false));
        cities.add(new City("Mauren", false, false));
        cities.add(new City("Ruggell", false, false));
        cities.add(new City("Schellenberg", false, true));
        cities.add(new City("Eschen", false, false));
        return cities;
    }
}