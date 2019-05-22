package com.hsr.demo.application.service.room.implement;

import com.hsr.demo.application.model.room.RoomStatus;
import com.hsr.demo.application.repository.room.IRoomStatusRepository;
import com.hsr.demo.application.service.room.IRoomStatusService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomStatusService implements IRoomStatusService {
    IRoomStatusRepository roomStatusRepository;
    public RoomStatusService(IRoomStatusRepository roomStatusRepository){
        this.roomStatusRepository=roomStatusRepository;
    }
    @Override
    public List<RoomStatus> findAll() {
        return roomStatusRepository.findAll();
    }

    @Override
    public RoomStatus save(RoomStatus roomStatus) {
        return roomStatusRepository.save(roomStatus);
    }

    @Override
    public RoomStatus findById(Integer roomStatusId) {
        return roomStatusRepository.findById(roomStatusId).orElse(null);
    }
}
