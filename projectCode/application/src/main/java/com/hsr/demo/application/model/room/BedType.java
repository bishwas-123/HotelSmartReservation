package com.hsr.demo.application.model.room;

import javax.persistence.*;

@Entity
@Table(name = "bedtype")
public class BedType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "bedType")
    private String bedType;

    public BedType(String bedType) {
        this.bedType = bedType;
    }

    public BedType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }
}
