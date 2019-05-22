package com.hsr.demo.application.service.room.implement;

import com.hsr.demo.application.model.room.BedType;
import com.hsr.demo.application.repository.room.IBedTypeRepository;
import com.hsr.demo.application.service.room.IBedTypeService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedTypeService implements IBedTypeService {
    IBedTypeRepository bedTypeRepository;
    public BedTypeService(IBedTypeRepository bedTypeRepository){
        this.bedTypeRepository=bedTypeRepository;
    }
    @Override
    public List<BedType> findAll() {
        return bedTypeRepository.findAll(Sort.by("bedType"));
    }

    @Override
    public BedType save(BedType BedType) {
        return bedTypeRepository.save(BedType);
    }

    @Override
    public BedType findById(Integer BedTypeId) {
        return bedTypeRepository.findById(BedTypeId).orElse(null);
    }
}
