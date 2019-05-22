package com.hsr.model;

import java.time.LocalDate;

public abstract class Person {
    String firstName="";
    String midName="";
    String lastName="";
    String phone="";
    LocalDate createDate;
    Address address;
    Roll roll;

    public Person(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.createDate=LocalDate.now();
        address=new Address();
    }

    abstract String getFirstName();

    abstract void setFirstName(String firstName);

    abstract String getMidName();

    abstract void setMidName(String midName);

    abstract String getLastName();

    abstract void setLastName(String lastName);

    abstract String getPhone();

    abstract void setPhone(String phone) ;

    abstract Address getAddress();

    abstract void setAddress(Address address);

    abstract Roll getRoll();

    abstract LocalDate getCreateDate();
}
