package com.hsr.demo.application.service.reservation;

import com.hsr.demo.application.model.reservation.Invoice;

import java.util.List;

public interface IInvoiceService {
    List<Invoice> findAll();
    Invoice save(Invoice invoice);
    Invoice findById(Integer invoiceId);
}
