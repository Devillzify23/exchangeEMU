package com.cryptocurrencies.api.infrastructure.in.controllers;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.domain.port.service.PricingServicePort;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.CryptocurrencyDto;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.PricingListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prices")
public class PriceController {

    @Autowired
    protected PricingServicePort service;

    @GetMapping()
    public PricingListDto getCurrentPricingList(){
        List<Cryptocurrency> cryptocurrencies = service.getCurrentPricingList();
        return null;
    }

    @GetMapping("/{crypto}")
    public CryptocurrencyDto getCurrentPricingList(@PathVariable("crypto") String crypto){
        return null;
    }
}
