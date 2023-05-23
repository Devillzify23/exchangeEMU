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

    public static List<Cryptocurrency> getAvailableCryptocurrencies(){
        List<Cryptocurrency> clon = new ArrayList<>();
        availableCrypto.forEach(x -> {
            clon.add(new Cryptocurrency(
                x.getName(),
                x.getSymbol(),
                x.getDescription(),
                x.getMaxSupply(),
                x.getCurrentSupply(),
                x.getTimestamp(),
                x.getPricing()
            ));
        });
        return clon;
    }

    @Autowired
    private CryptocurrencyRepositoryPort repository;

    @PostConstruct
    private void populateAvailableCriptos(){ //carga al empezar la lista
        availableCrypto = repository.getCryptocurrenciesList();
    }
}
