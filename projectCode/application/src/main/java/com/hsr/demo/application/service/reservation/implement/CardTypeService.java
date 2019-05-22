package com.hsr.demo.application.service.reservation.implement;

import com.hsr.demo.application.model.reservation.CardType;
import com.hsr.demo.application.repository.reservation.ICardTypeRepository;
import com.hsr.demo.application.service.reservation.ICardTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardTypeService implements ICardTypeService {

    ICardTypeRepository cardTypeRepository;
    public CardTypeService(ICardTypeRepository cardTypeRepository){
        this.cardTypeRepository=cardTypeRepository;
    }

    @Override
    public List<CardType> findAll() {
        return cardTypeRepository.findAll();
    }

    @Override
    public CardType save(CardType cardType) {
        return cardTypeRepository.save(cardType);
    }

    @Override
    public CardType findById(Integer cardTypeId) {
        return cardTypeRepository.findById(cardTypeId).orElse(null);
    }
}
