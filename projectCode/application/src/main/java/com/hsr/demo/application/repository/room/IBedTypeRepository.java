package com.hsr.demo.application.repository.room;

import com.hsr.demo.application.model.room.BedType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBedTypeRepository extends JpaRepository<BedType, Integer> {
}
