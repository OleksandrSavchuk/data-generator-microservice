package com.example.datageneratormicroservice.web.dto;

import com.example.datageneratormicroservice.model.MeasurementType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptionsDto {

    private int delayInSeconds;
    private MeasurementType[] measurementTypes;

}
