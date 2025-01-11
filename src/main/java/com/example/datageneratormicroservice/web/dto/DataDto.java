package com.example.datageneratormicroservice.web.dto;

import com.example.datageneratormicroservice.model.MeasurementType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class DataDto {

    private Long sensorId;
    private int measurement;

    @JsonFormat(pattern = "yyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime timestamp;

    private MeasurementType measurementType;

}
