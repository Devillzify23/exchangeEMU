package com.cryptocurrencies.api.infrastructure.in.controllers.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PricingDto {

    @JsonProperty("current_price")
    private BigDecimal currentPrice;
    @JsonProperty("price_change")
    private BigDecimal priceChange;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("volume24h")
    private BigDecimal volume24h;
}
