package com.cryptocurrencies.api.infrastructure.in.controllers.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class CryptocurrencyDto {

    @JsonProperty("name")
    private String name;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("description")
    private String description;
    @JsonProperty("max_supply")
    private BigDecimal maxSupply;
    @JsonProperty("current_supply")
    private BigDecimal currentSupply;
    @JsonProperty("timestamp")
    private LocalDateTime timestamp;
    @JsonProperty("pricing")
    private PricingDto pricing;
}
