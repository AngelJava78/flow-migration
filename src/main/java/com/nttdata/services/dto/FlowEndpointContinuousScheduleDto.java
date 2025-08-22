package com.nttdata.services.dto;

import lombok.Data;

@Data
public class FlowEndpointContinuousScheduleDto {
    private int id;
    private int flowEndpointId;
    private String period;
    private int units;
    private String createdBy;
    private String createdDate;
}
