package com.micro.accounts.service.client;

import com.micro.accounts.dto.LoansDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "loans", fallback = LoansFallback.class)
public interface LoansFeignClient {

    @GetMapping(value = "/api/fetch")
    public ResponseEntity<LoansDto> fetchLoanDetails(@RequestParam("mobileNumber") String mobileNumber);
}
