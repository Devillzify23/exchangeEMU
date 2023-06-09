package com.cryptocurrencies.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cryptocurrency {
    private String name;
    private String symbol;
    private String description;
    private String maxSupply;
    private Pricing pricing;
}
