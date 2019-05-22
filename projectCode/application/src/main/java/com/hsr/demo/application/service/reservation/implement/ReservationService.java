package com.hsr.demo.application.service.reservation.implement;

import com.hsr.demo.application.model.reservation.Reservation;
import com.hsr.demo.application.repository.reservation.IReservationRepository;
import com.hsr.demo.application.service.reservation.IReservationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService implements IReservationService {

    IReservationRepository reservationRepository;
    public ReservationService(IReservationRepository reservationRepository){
        this.reservationRepository=reservationRepository;
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation findById(Integer reservationId) {
        return reservationRepository.findById(reservationId).orElse(null);
    }
}
