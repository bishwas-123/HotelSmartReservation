package com.hsr.demo.application.model.reservation;

import javax.persistence.*;

@Entity
public class CardType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;

    public CardType(String type) {
        this.type = type;
    }

    public CardType() {
    }
}
