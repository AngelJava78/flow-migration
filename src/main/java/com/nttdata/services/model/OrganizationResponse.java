package com.nttdata.services.model;

import lombok.Data;

@Data
public class OrganizationResponse {
    private int id;
    private int tenantId;
    private String name;
    private int organizationTypeId;
    private int organizationStatusId;
    private String publicCode;
    private String systemCode;
    private String description;
    private String secretKey;
    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;
    private String deletedBy;
    private String deletedDate;

}
