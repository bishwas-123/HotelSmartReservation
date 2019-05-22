package com.hsr.demo.application.model.reservation;

import com.hsr.demo.application.model.user.Person;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate reservationDate;
    private LocalDate checkinDate;
    private LocalDate checkoutDate;
    private Integer numberOfOccupants;

//    @OneToOne (mappedBy = "reservation", cascade = CascadeType.ALL)
//    private Invoice invoice;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "reservation_invoice",
            joinColumns = { @JoinColumn(name = "reservationId", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "invoiceId", referencedColumnName = "id") })
    private Invoice invoice;

    @OneToOne (mappedBy = "reservation", cascade = CascadeType.ALL)
    private Confirmation confirmation;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Person person;



}
