package com.hsr.demo.application.model.room;

import javax.persistence.*;

@Entity
@Table(name = "roomstatus")
public class RoomStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "roomstatus")
    private String status;

    public RoomStatus(String status) {
        this.status = status;
    }

    public RoomStatus() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
