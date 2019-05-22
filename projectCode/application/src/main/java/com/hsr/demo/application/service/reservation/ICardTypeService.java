package com.hsr.demo.application.service.reservation;

import com.hsr.demo.application.model.reservation.CardType;

import java.util.List;

public interface ICardTypeService {
    List<CardType> findAll();
    CardType save(CardType cardType);
    CardType findById(Integer cardTypeId);
}
