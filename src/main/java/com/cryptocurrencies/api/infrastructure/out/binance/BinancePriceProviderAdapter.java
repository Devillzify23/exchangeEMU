package com.cryptocurrencies.api.infrastructure.out.binance;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.domain.repository.priceprovider.PriceProviderPort;

import java.util.List;

public class BinancePriceProviderAdapter implements PriceProviderPort {


    @Override
    public List<Cryptocurrency> getCurrentCryptoPrices(List<Cryptocurrency> cryptos) {
        return null;
    }
}
