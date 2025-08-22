package com.nttdata.services.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FlowResponse {

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

    private String deletedBy;

    private String deletedDate;

    private String contactId;

    // Getters y setters
}

