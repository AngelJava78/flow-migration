package com.nttdata.services.client;

import com.nttdata.services.config.FeignClientConfig;
import com.nttdata.services.model.FlowResponse;
import com.nttdata.services.request.FlowRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
        name = "flowApiClient",
        url = "https://staging.thruinc.com/api",
        configuration = FeignClientConfig.class
)
public interface FlowApiClient {

    @PostMapping(value = "/Flow/createFlow", consumes = "application/json", produces = "text/plain")
    FlowResponse createFlow(
            @RequestHeader("apikey") String apiKey,
            @RequestBody FlowRequest flowRequest
    );
}
