package com.hsr.model;

import java.time.LocalDate;

public class Staff extends Person {
    Roll roll;

    public Staff(String firstName, String lastName, String phone) {
        super(firstName, lastName, phone);
        roll=Roll.Staff;
    }
    public Staff(String fname, String mname, String lname, String phone){
        this(fname,lname,phone);
        this.midName=mname;
    }
    @Override
    String getFirstName() {
        return null;
    }

    @Override
    void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    @Override
    String getMidName() {
        return null;
    }

    @Override
    void setMidName(String midName) {
        this.midName=midName;
    }

    @Override
    String getLastName() {
        return null;
    }

    @Override
    void setLastName(String lastName) {
        this.lastName=lastName;
    }

    @Override
    String getPhone() {
        return null;
    }

    @Override
    void setPhone(String phone) {
        this.phone=phone;
    }

    @Override
    Address getAddress() {
        return null;
    }

    @Override
    void setAddress(Address address) {
        this.address=address;
    }
    @Override
    public Roll getRoll() {
        return this.roll;
    }
    @Override
    public LocalDate getCreateDate(){
        return this.createDate;
    }
}
