package com.nttdata.services.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FlowEndpointTriggersDto {
    @JsonProperty("Id")
    private int id;

    @JsonProperty("FlowEndpointId")
    private int flowEndpointId;

    @JsonProperty("IsEnabled")
    private boolean isEnabled;

    @JsonProperty("IsTriggerSemaphoreFile")
    private boolean isTriggerSemaphoreFile;

    @JsonProperty("IsTriggerTemporaryFilename")
    private boolean isTriggerTemporaryFilename;

    @JsonProperty("IsTriggerBatchSemaphore")
    private boolean isTriggerBatchSemaphore;

    @JsonProperty("IsAddExtension")
    private boolean isAddExtension;

    @JsonProperty("IsReplaceExtension")
    private boolean isReplaceExtension;

    @JsonProperty("IsTemporaryPrefix")
    private boolean isTemporaryPrefix;

    @JsonProperty("IsTemporaryExtension")
    private boolean isTemporaryExtension;

    @JsonProperty("CreatedBy")
    private String createdBy;

    @JsonProperty("CreatedDate")
    private String createdDate;

    @JsonProperty("FilePrefix")
    private String filePrefix;

    @JsonProperty("FileExtension")
    private String fileExtension;

    @JsonProperty("BatchSemaphoreFilename")
    private String batchSemaphoreFilename;
}
