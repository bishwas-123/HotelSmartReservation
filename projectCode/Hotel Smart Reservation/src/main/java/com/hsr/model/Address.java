package com.hsr.model;

public class Address {
    String addressline="";
    String city="";
    String state="";
    String zip="";
    String country="";

    public Address(){

    }

    public Address(String addressline, String city, String state, String zip, String country) {
        this.addressline = addressline;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    public String getAddressline() {
        return addressline;
    }

    public void setAddressline(String addressline) {
        this.addressline = addressline;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String printFormat(){
        return addressline+"\n"+city+", "+state+", "+zip+"\n"+country;
    }
}
