package com.nttdata.services.client;


import com.nttdata.services.model.AccountResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "accountApiClient", url = "https://staging.thruinc.com/api")
public interface  AccountApiClient {


  @GetMapping("/Account")
  AccountResponse getAccount(@RequestHeader("apikey") String apiKey);


}
