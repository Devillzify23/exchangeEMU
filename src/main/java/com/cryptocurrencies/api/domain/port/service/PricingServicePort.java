package com.cryptocurrencies.api.domain.port.service;


import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.CryptocurrencyDto;

import java.util.List;

public interface PricingServicePort {
    List<Cryptocurrency> getCurrentPricingList();

    CryptocurrencyDto getCryptoFull(String crypto);
}
