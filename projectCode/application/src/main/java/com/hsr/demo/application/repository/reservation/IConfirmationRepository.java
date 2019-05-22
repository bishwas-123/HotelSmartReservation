package com.hsr.demo.application.repository.reservation;

import com.hsr.demo.application.model.reservation.Confirmation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConfirmationRepository extends JpaRepository<Confirmation, Integer> {
}
