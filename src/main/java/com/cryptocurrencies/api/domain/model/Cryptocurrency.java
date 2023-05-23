package com.cryptocurrencies.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cryptocurrency {
    private String name;
    private String symbol;
    private String description;
    private String maxSupply;
    private BigDecimal currentSupply;
    private LocalDateTime timestamp;
    private Pricing pricing;
}
