package com.nttdata.services.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FlowEndpointConfigurationDto {
    @JsonProperty("Id")
    private int id;

    @JsonProperty("FlowEndpointId")
    private int flowEndpointId;

    @JsonProperty("IsEnabled")
    private boolean isEnabled;

    @JsonProperty("IsOverwriteExistingFiles")
    private boolean isOverwriteExistingFiles;

    @JsonProperty("IsDeleteDeliveredFiles")
    private boolean isDeleteDeliveredFiles;

    @JsonProperty("IsCustomerArchive")
    private boolean isCustomerArchive;

    @JsonProperty("AlertHour")
    private int alertHour;

    @JsonProperty("IsSubfolders")
    private boolean isSubfolders;

    @JsonProperty("FlowEndpointName")
    private String flowEndpointName;

    @JsonProperty("CreatedBy")
    private String createdBy;

    @JsonProperty("CreatedDate")
    private String createdDate;

}

