package com.cryptocurrencies.api.infrastructure.out.binance.models.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Binance24hr
{
    private String symbol;
    private BigDecimal priceChange;
    private BigDecimal priceChangePercent;
    private BigDecimal prevClosePrice;
    private BigDecimal lastPrice;
    private BigDecimal bidPrice;
    private BigDecimal bidQty;
    private BigDecimal askPrice;
    private BigDecimal askQty;
    private BigDecimal openPrice;
    private BigDecimal highPrice;
    private BigDecimal lowPrice;
    private BigDecimal volume;
    private BigDecimal quoteVolume;
    private Long openTime;
    private Long closeTime;
    private Long firstId;
    private Long lastId;
    private Long count;
}
