package com.cryptocurrencies.api.infrastructure.out.binance;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.domain.repository.priceprovider.PriceProviderPort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BinancePriceProviderAdapter implements PriceProviderPort {

    @Override
    public List<Cryptocurrency> getCurrentCryptoPrices(List<Cryptocurrency> cryptos) {
        return cryptos;
    }
}
