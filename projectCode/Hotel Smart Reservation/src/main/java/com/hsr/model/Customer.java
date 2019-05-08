package com.hsr.model;

public class Customer extends Person {

    Roll roll;
    public Customer(String fname, String lname, String phone){
        super(fname,lname,phone);
        roll=Roll.Customer;
    }
    public Customer(String fname, String mname, String lname, String phone){
        this(fname,lname,phone);
        this.midName=mname;
    }
    @Override
    public String getFirstName() {
        return this.firstName;
    }
    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Override
    public String getMidName() {
        return midName;
    }
    @Override
    public void setMidName(String midName) {
        this.midName = midName;
    }
    @Override
    public String getLastName() {
        return lastName;
    }
    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String getPhone() {
        return phone;
    }
    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public Address getAddress() {
        return address;
    }
    @Override
    public void setAddress(Address address) {
        this.address = address;
    }

}
