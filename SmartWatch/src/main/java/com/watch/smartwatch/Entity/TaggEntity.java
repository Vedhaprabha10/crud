package com.watch.smartwatch.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity
@Table(name = "tagg")
public class TaggEntity {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "model")
    private String model;
    @Column(name = "price")
    private Long price;
    @Column(name = "battery")
    private String battery;
    @Column(name = "mic")
    private String mic;
    @Column(name = "speaker")
    private String speaker;
}
