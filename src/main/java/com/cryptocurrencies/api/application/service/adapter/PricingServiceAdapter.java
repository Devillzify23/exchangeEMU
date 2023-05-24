package com.cryptocurrencies.api.application.service.adapter;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.domain.port.service.PricingServicePort;
import com.cryptocurrencies.api.domain.repository.memory.CryptocurrenciesMemoryPersistence;
import com.cryptocurrencies.api.domain.repository.port.CryptocurrencyRepositoryPort;
import com.cryptocurrencies.api.domain.repository.priceprovider.PriceProviderPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricingServiceAdapter implements PricingServicePort {

    private final CryptocurrencyRepositoryPort repository;
    private final PriceProviderPort priceProvider;

    private final String EUR_CURRENCY = "EUR";

    public PricingServiceAdapter(CryptocurrencyRepositoryPort repository, PriceProviderPort priceProvider) {
        this.repository = repository;
        this.priceProvider = priceProvider;
    }

    @Override
    public List<Cryptocurrency> getCurrentPricingList() {
        List<Cryptocurrency> result = CryptocurrenciesMemoryPersistence.getAvailableCryptocurrencies();
        List<Cryptocurrency> cryptoWithPricing = priceProvider.getCurrentCryptoPrices(result, EUR_CURRENCY);
        return cryptoWithPricing;
    }
}
