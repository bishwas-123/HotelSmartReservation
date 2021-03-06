package com.hsr.demo.application.service.room.implement;

import com.hsr.demo.application.model.room.Room;
import com.hsr.demo.application.repository.room.IRoomRepository;
import com.hsr.demo.application.service.room.IRoomService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService implements IRoomService {
    IRoomRepository roomRepository;
    public RoomService(IRoomRepository roomRepository){
        this.roomRepository=roomRepository;
    }
    @Override
    public List<Room> findAll() {
        return roomRepository.findAll(Sort.by("roomNumber"));
    }

    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room findById(Integer roomId) {
        return roomRepository.findById(roomId).orElse(null);
    }
}
