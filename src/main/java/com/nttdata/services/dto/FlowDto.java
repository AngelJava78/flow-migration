package com.nttdata.services.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data

public class FlowDto {

    @JsonProperty("Id")
    private int id;

    @JsonProperty("TenantId")
    private int tenantId;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("FlowStatusId")
    private int flowStatusId;

    @JsonProperty("IsBroadcast")
    private boolean isBroadcast;

    @JsonProperty("IsPublished")
    private boolean isPublished;

    @JsonProperty("IsIPaaSSubscription")
    private boolean isIPaaSSubscription;

    @JsonProperty("ConnectorId")
    private int connectorId;

    @JsonProperty("Code")
    private String code;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("CreatedBy")
    private String createdBy;

    @JsonProperty("CreatedDate")
    private String createdDate;

    @JsonProperty("UpdatedBy")
    private String updatedBy;

    @JsonProperty("UpdatedDate")
    private String updatedDate;

    @JsonProperty("Sources")
    private List<FlowEndpointDto> sources;

    @JsonProperty("Targets")
    private List<FlowEndpointDto> targets;

    // Getters y setters (puedes generarlos automáticamente con tu IDE)
}

