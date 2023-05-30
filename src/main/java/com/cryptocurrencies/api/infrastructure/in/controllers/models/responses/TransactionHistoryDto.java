package com.cryptocurrencies.api.infrastructure.in.controllers.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class TransactionHistoryDto
{
    @JsonProperty("id")
    private Long id;
    @JsonProperty("idUser")
    private Long idUser;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("actualPrice")
    private Double actualPrice;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("opType")
    private Character opType;
    @JsonProperty("transactionTime")
    private Date transactionTime;
}
