package com.hsr.demo.application.service.room;


import com.hsr.demo.application.model.room.RoomType;

import java.util.List;

public interface IRoomTypeService {
    List<RoomType> findAll();
    RoomType save(RoomType roomType);
    RoomType findById(Integer roomTypeId);
}
