package com.hsr.demo.application.service.reservation.implement;

import com.hsr.demo.application.model.reservation.Payment;
import com.hsr.demo.application.repository.reservation.IPaymentRepository;
import com.hsr.demo.application.service.reservation.IPaymentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService implements IPaymentService {

    IPaymentRepository paymentRepository;
    public PaymentService(IPaymentRepository paymentRepository){
        this.paymentRepository=paymentRepository;
    }

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment findById(Integer paymentId) {
        return paymentRepository.findById(paymentId).orElse(null);
    }
}
