package com.cryptocurrencies.api.infrastructure.in.controllers.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PricingListDto {

    @JsonProperty("cryptocurrencies")
    private List<SimpleCryptocurrencyDto> cryptocurrencies;
}
