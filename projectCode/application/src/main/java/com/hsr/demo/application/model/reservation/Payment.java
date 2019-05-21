package com.hsr.demo.application.model.reservation;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double amount;

    @CreatedDate
    private LocalDate createDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Reservation reservation;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private CardType cardType;

    public Payment(Double payment, Reservation reservation) {
        this.amount =payment;
        this.reservation = reservation;
        this.createDate= LocalDate.now();
    }

    public Payment() {
    }
}
