package com.nttdata.services.request;

import lombok.Data;

@Data
public class FlowRequest {

    private int tenantId;

    private String name;

    private int flowStatusId;

    private String description;

}
