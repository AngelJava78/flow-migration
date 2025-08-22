package com.nttdata.services.dto;

import lombok.Data;

@Data
public class FlowEndpointServerPathMappingDto {
    private int id;
    private int flowEndpointId;
    private int sourceFlowEndpointId;
    private int sourceServerPathId;
    private int targetServerPathId;
    private boolean isIncludeSubfolders;
    private String createdBy;
    private String createdDate;
}
