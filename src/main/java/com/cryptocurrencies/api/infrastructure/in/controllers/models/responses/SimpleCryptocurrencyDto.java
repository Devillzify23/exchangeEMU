package com.cryptocurrencies.api.infrastructure.in.controllers.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class SimpleCryptocurrencyDto {

    @JsonProperty("name")
    private String name;
    @JsonProperty("current_price")
    private BigDecimal currentPrice;
    @JsonProperty("price_change")
    private String priceChange;
}
