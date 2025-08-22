package com.nttdata.services.dto;

import lombok.Data;

@Data
public class FlowEndpointScheduleDto {
    private FlowEndpointContinuousScheduleDto flowEndpointContinuousSchedule;
    private int id;
    private int flowEndpointId;
    private int flowScheduleTypeId;
    private String createdBy;
    private String createdDate;
}

