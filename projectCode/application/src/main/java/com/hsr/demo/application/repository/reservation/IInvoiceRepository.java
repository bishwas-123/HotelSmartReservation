package com.hsr.demo.application.repository.reservation;

import com.hsr.demo.application.model.reservation.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInvoiceRepository extends JpaRepository<Invoice, Integer> {
}
