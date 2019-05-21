package com.hsr.demo.application.model.reservation;

import javax.persistence.*;

@Entity
@Table(name = "confirmation")
public class Confirmation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private Integer id;

    @Column(name = "code")
    private String code;

    @OneToOne
    @MapsId
    private Reservation reservation;

    public Confirmation(String code) {
        this.code = code;
    }

    public Confirmation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
