package com.watch.smartwatch.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class TaggDTO {
    private int id;
    private String model;
    private Long price;
    private String battery;
    private String mic;
    private String speaker;

}
