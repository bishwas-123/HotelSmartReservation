package com.hsr.demo.application.service.reservation;

import com.hsr.demo.application.model.reservation.Confirmation;

import java.util.List;

public interface IConfirmationService {
    List<Confirmation> findAll();

    Confirmation save(Confirmation confirmation);

    Confirmation findById(Integer confirmationId);

    String generateCode();
}
