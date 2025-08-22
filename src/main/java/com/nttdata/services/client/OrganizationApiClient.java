package com.nttdata.services.client;

import com.nttdata.services.config.FeignClientConfig;
import com.nttdata.services.model.OrganizationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(name = "organizationApiClient", url = "https://staging.thruinc.com/api")
public interface OrganizationApiClient {

    @GetMapping("/Organization")
    List<OrganizationResponse> getOrganizations(
            @RequestHeader("apikey") String apiKey,
            @RequestParam("showDeleted") boolean showDeleted
    );

}
