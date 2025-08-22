package com.nttdata.services.dto;

import lombok.Data;

@Data
public class FlowEndpointConfigurationDto {
    private int id;
    private int flowEndpointId;
    private boolean isEnabled;
    private boolean isOverwriteExistingFiles;
    private boolean isDeleteDeliveredFiles;
    private boolean isCustomerArchive;
    private int alertHour;
    private boolean isSubfolders;
    private String flowEndpointName;
    private String createdBy;
    private String createdDate;
}

