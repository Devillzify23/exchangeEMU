package com.cryptocurrencies.api.infrastructure.in.controllers.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class PricingListDto {

    @JsonProperty("cryptocurrencies")
    private List<SimpleCryptocurrencyDto> cryptocurrencies;
}
