package com.jetdevs.practical.models;

import lombok.Data;

@Data
public class TrainRequestDTO {

    private ArrivalModel arrival;
    private DepartureModel departure;

}
