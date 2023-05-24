package com.cryptocurrencies.api.infrastructure.in.controllers.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class SimpleCryptocurrencyDto {
    @JsonProperty("name")
    private String name;
    @JsonProperty("current_price")
    private BigDecimal currentPrice;
    @JsonProperty("price_change")
    private BigDecimal priceChange;
}
