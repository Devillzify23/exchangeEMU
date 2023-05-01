package com.cryptocurrencies.api.application.service.adapter;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.domain.port.service.PricingServicePort;
import com.cryptocurrencies.api.domain.repository.memory.CryptocurrenciesMemoryPersistence;
import com.cryptocurrencies.api.domain.repository.port.CryptocurrencyRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricingServiceAdapter implements PricingServicePort {

    private final CryptocurrencyRepositoryPort repository;

    public PricingServiceAdapter(CryptocurrencyRepositoryPort repository){
        this.repository = repository;
    }

    @Override
    public List<Cryptocurrency> getCurrentPricingList() {
        List<Cryptocurrency> result = CryptocurrenciesMemoryPersistence.getAvailableCryptocurrencies();

    }
}
