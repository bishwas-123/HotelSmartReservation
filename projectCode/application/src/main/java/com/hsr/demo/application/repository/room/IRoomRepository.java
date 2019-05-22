package com.hsr.demo.application.repository.room;

import com.hsr.demo.application.model.room.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepository extends JpaRepository<Room, Integer> {
}
