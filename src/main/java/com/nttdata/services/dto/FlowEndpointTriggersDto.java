package com.nttdata.services.dto;

import lombok.Data;

@Data
public class FlowEndpointTriggersDto {
    private int id;
    private int flowEndpointId;
    private boolean isEnabled;
    private boolean isTriggerSemaphoreFile;
    private boolean isTriggerTemporaryFilename;
    private boolean isTriggerBatchSemaphore;
    private boolean isAddExtension;
    private boolean isReplaceExtension;
    private boolean isTemporaryPrefix;
    private boolean isTemporaryExtension;
    private String createdBy;
    private String createdDate;
    private String filePrefix;
    private String fileExtension;
    private String batchSemaphoreFilename;
}
