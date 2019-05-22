package com.hsr.demo.application.service.room;


import com.hsr.demo.application.model.room.RoomStatus;

import java.util.List;

public interface IRoomStatusService {
    List<RoomStatus> findAll();
    RoomStatus save(RoomStatus roomStatus);
    RoomStatus findById(Integer roomStatusId);
}
