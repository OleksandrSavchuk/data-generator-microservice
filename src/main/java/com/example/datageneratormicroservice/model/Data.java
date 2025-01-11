package com.example.datageneratormicroservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class Data {

    private Long sensorId;
    private double measurement;
    private LocalDateTime timestamp;
    private MeasurementType measurementType;

}
