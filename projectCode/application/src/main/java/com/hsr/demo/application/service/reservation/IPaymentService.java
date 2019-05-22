package com.hsr.demo.application.service.reservation;

import com.hsr.demo.application.model.reservation.Payment;

import java.util.List;

public interface IPaymentService {
    List<Payment> findAll();
    Payment save(Payment payment);
    Payment findById(Integer paymentId);
}
