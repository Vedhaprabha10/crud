package com.example.Mobile.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Setter
@Getter
@Table(name = "Vivo")
public class MobileEntity {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "ram")
    private String ram;
    @Column(name = "storage")
    private String storage;
    @Column(name = "back-camera")
    private String back;
    @Column(name = "front-camera")
    private String front;
    @Column(name = "battery")
    private String battery;
    @Column(name = "os")
    private String os;

}
