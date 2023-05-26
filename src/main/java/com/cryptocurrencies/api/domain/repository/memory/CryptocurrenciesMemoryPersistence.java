package com.cryptocurrencies.api.domain.repository.memory;


import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.domain.repository.port.CryptocurrencyRepositoryPort;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CryptocurrenciesMemoryPersistence {

    private static List<Cryptocurrency> availableCrypto = new ArrayList<>();
    @Autowired
    private CryptocurrencyRepositoryPort repository;

    public static List<Cryptocurrency> getAvailableCryptocurrencies() {
        List<Cryptocurrency> clon = new ArrayList<>();
        availableCrypto.forEach(x -> clon.add(new Cryptocurrency(
                x.getName(),
                x.getSymbol(),
                x.getDescription(),
                x.getMaxSupply(),
                x.getPricing()
        )));
        return clon;
    }
    @PostConstruct
    private void populateAvailableCriptos() {
        availableCrypto = repository.getCryptocurrenciesList();
    }
}
