package com.example.datageneratormicroservice.model.test;

import com.example.datageneratormicroservice.model.MeasurementType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {

    private int delayInSeconds;
    private MeasurementType[] measurementTypes;

}
