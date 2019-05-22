package com.hsr.demo.application.service.room.implement;

import com.hsr.demo.application.model.room.RoomType;
import com.hsr.demo.application.repository.room.IRoomTypeRepository;
import com.hsr.demo.application.service.room.IRoomTypeService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomTypeService implements IRoomTypeService {
    IRoomTypeRepository roomTypeRepository;
    public RoomTypeService(IRoomTypeRepository roomTypeRepository){
        this.roomTypeRepository=roomTypeRepository;
    }
    @Override
    public List<RoomType> findAll() {
        return roomTypeRepository.findAll(Sort.by("roomType"));
    }

    @Override
    public RoomType save(RoomType roomType) {
        return roomTypeRepository.save(roomType);
    }

    @Override
    public RoomType findById(Integer roomTypeId) {
        return roomTypeRepository.findById(roomTypeId).orElse(null);
    }
}
