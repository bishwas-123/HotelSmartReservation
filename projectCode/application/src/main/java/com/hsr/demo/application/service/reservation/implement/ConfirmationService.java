package com.hsr.demo.application.service.reservation.implement;

import com.hsr.demo.application.model.reservation.Confirmation;
import com.hsr.demo.application.repository.reservation.ICardTypeRepository;
import com.hsr.demo.application.repository.reservation.IConfirmationRepository;
import com.hsr.demo.application.service.reservation.IConfirmationService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfirmationService implements IConfirmationService {

    IConfirmationRepository confirmationRepository;
    public ConfirmationService(IConfirmationRepository confirmationRepository){
        this.confirmationRepository=confirmationRepository;
    }

    @Override
    public List<Confirmation> findAll() {
        return confirmationRepository.findAll(Sort.by("code"));
    }

    @Override
    public Confirmation save(Confirmation confirmation) {
        return confirmationRepository.save(confirmation);
    }

    @Override
    public Confirmation findById(Integer cardTypeId) {
        return confirmationRepository.findById(cardTypeId).orElse(null);
    }

    @Override
    public String generateCode() {
        return "hsr"+Math.random()*(999999999-111111111)+111111111;
    }
}
