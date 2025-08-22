package com.nttdata.services.dto;

import lombok.Data;

@Data
public class FlowEndpointServerPathDto {
    private int id;
    private int flowEndpointId;
    private String path;
    private String createdBy;
    private String createdDate;
}
