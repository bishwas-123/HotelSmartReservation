package com.hsr.demo.application.repository.reservation;

import com.hsr.demo.application.model.reservation.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Integer> {
}
