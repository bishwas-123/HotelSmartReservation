package com.hsr.demo.application.service.reservation.implement;

import com.hsr.demo.application.model.reservation.Invoice;
import com.hsr.demo.application.repository.reservation.IInvoiceRepository;
import com.hsr.demo.application.service.reservation.IInvoiceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService implements IInvoiceService {

    IInvoiceRepository invoiceRepository;
    public InvoiceService(IInvoiceRepository invoiceRepository){
        this.invoiceRepository=invoiceRepository;
    }

    @Override
    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice save(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public Invoice findById(Integer invoiceId) {
        return invoiceRepository.findById(invoiceId).orElse(null);
    }
}
