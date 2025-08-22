package com.nttdata.services.dto;

import lombok.Data;

import java.util.List;

@Data
public class FlowEndpointDto {
    private FlowEndpointConfigurationDto configuration;
    private FlowEndpointScheduleDto schedule;
    private List<FlowEndpointServerPathDto> serverPaths;
    private List<FlowEndpointServerPathMappingDto> serverPathMappings;
    private List<Object> serverUsers;
    private List<Object> renameOptions;
    private List<Object> renameMappings;
    private FlowEndpointTriggersDto triggers;
    private List<Object> emailNotifications;
    private int id;
    private int flowId;
    private int flowEndpointTypeId;
    private int endpointId;
    private String createdBy;
    private String createdDate;
}
