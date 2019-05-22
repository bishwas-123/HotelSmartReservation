package com.hsr.demo.application.repository.reservation;

import com.hsr.demo.application.model.reservation.CardType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICardTypeRepository extends JpaRepository<CardType, Integer> {
}
