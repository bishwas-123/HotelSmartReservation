package com.hsr.demo.application.model.room;

import com.hsr.demo.application.model.review.Review;

import javax.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer roomNumber;
    private Double price;
    private Double area;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="bedType")
    private BedType bedType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="roomType")
    private RoomType roomType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="roomStatus")
    private RoomStatus roomStatus;

    public Room(Integer roomNumber, Double price, Double area, BedType bedType, RoomType roomType, RoomStatus roomStatus) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.area = area;
        this.bedType = bedType;
        this.roomType = roomType;
        this.roomStatus = roomStatus;
    }

    public Room() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }
}
