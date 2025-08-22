package com.nttdata.services.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FlowEndpointServerPathMappingDto {
    @JsonProperty("Id")
    private int id;

    @JsonProperty("flowEndpointId")
    private int flowEndpointId;

    @JsonProperty("SourceFlowEndpointId")
    private int sourceFlowEndpointId;

    @JsonProperty("SourceServerPathId")
    private int sourceServerPathId;

    @JsonProperty("TargetServerPathId")
    private int targetServerPathId;

    @JsonProperty("IsIncludeSubfolders")
    private boolean isIncludeSubfolders;

    @JsonProperty("CreatedBy")
    private String createdBy;

    @JsonProperty("CreatedDate")
    private String createdDate;

}
