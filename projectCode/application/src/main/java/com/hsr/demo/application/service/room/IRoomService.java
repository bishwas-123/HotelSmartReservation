package com.hsr.demo.application.service.room;


import com.hsr.demo.application.model.room.Room;

import java.util.List;

public interface IRoomService {
    List<Room> findAll();
    Room save(Room room);
    Room findById(Integer roomId);
}
