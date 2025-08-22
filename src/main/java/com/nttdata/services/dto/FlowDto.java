package com.nttdata.services.dto;
import lombok.Data;
import java.util.List;

@Data
public class FlowDto {
    private int id;
    private int tenantId;
    private String name;
    private int flowStatusId;
    private boolean isBroadcast;
    private boolean isPublished;
    private boolean isIPaaSSubscription;
    private int connectorId;
    private String code;
    private String description;
    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;
    private List<FlowEndpointDto> sources;
    private List<FlowEndpointDto> targets;
}
