package com.cryptocurrencies.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pricing {
    private BigDecimal currentPrice;
    private BigDecimal priceChange;
    private String currency;
    private BigDecimal volume24h;
}
