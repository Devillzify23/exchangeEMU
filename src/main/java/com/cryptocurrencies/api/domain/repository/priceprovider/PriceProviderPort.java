package com.cryptocurrencies.api.domain.repository.priceprovider;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;

import java.util.List;

public interface PriceProviderPort {

    List<Cryptocurrency> getCurrentCryptoPrices(List<Cryptocurrency> cryptos);
}
