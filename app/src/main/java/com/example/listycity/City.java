package com.example.listycity;

/**
 * This is a class that defines a city
 * @author Elliot Chrystal
 * @version 1.0
 * @see
 */
public class City implements Comparable{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }


    public boolean equals(City other) {
        boolean citySame = other.getCityName().equals(this.getCityName());
        boolean provinceSame = other.getProvinceName().equals(this.getProvinceName());

        return citySame && provinceSame;
    }

}
