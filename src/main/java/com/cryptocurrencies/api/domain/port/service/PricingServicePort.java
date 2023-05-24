package com.cryptocurrencies.api.domain.port.service;


import com.cryptocurrencies.api.domain.model.Cryptocurrency;

import java.util.List;

public interface PricingServicePort {
    List<Cryptocurrency> getCurrentPricingList();
}
