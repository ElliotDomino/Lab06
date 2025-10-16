package com.example.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     * @throws IllegalArgumentException
     * when a city is already in the list.
     */
    public void add(City city) {
        if (this.hasCity(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This deletes a city from the list if the city exists. If it does not exist
     * an exception will be thrown.
     * @param city
     * This is a candidate city to delete
     * @throws IllegalArgumentException
     * when a city to delete is not in the list.
     */
    public void delete(City city) {
        if (this.hasCity(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    public boolean hasCity(City testCity) {
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).equals(testCity)) {
                return true;
            }
        }
        return false;
    }

    public int countCities() {
        return cities.size();
    }
}