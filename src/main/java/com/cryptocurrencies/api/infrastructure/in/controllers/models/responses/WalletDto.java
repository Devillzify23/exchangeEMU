package com.cryptocurrencies.api.infrastructure.in.controllers.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class WalletDto {
    @JsonProperty("idUser")
    private long idUser;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("funds")
    private BigDecimal funds;
}
