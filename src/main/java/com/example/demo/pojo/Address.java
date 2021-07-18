package com.example.demo.pojo;

public class Address {

    private String Location;
    private String street;
    private Integer Pin;
    private String state;
    private String country;

    public Address(String location, String street, Integer pin, String state, String country) {
        Location = location;
        this.street = street;
        Pin = pin;
        this.state = state;
        this.country = country;
    }

    public Address() {
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getPin() {
        return Pin;
    }

    public void setPin(Integer pin) {
        Pin = pin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Location='" + Location + '\'' +
                ", street='" + street + '\'' +
                ", Pin=" + Pin +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
