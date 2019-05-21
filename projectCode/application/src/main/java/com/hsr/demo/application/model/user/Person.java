package com.hsr.demo.application.model.user;

import com.hsr.demo.application.model.review.Review;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @NotNull(message = "First name is required")
    private String firstName="";

    private String midName="";

    @NotNull(message = "Last name is required")
    private String lastName="";

    @NotNull(message = "Phone number is required")
    private String phone="";

    private LocalDate createDate;
//    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
//    private Address address;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "person_address",
            joinColumns = { @JoinColumn(name = "personId", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "AddressId", referencedColumnName = "id") })
    private Address address;





    public Person(String firstName, String midName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.createDate=LocalDate.now();

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
