package com.micro.accounts.service.client;

import com.micro.accounts.dto.CardsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("cards")
public interface CardsFeignClient {

    @GetMapping(value = "/api/fetch")
    public ResponseEntity<CardsDto> fetchCardDetails(@RequestParam("mobileNumber") String mobileNumber);
}
