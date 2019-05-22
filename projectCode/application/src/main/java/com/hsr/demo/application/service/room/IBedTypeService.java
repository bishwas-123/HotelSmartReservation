package com.hsr.demo.application.service.room;


import com.hsr.demo.application.model.room.BedType;

import java.util.List;

public interface IBedTypeService {
    List<BedType> findAll();
    BedType save(BedType bedType);
    BedType findById(Integer bedTypeId);
}
