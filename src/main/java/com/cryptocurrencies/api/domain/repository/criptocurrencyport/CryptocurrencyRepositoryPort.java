package com.cryptocurrencies.api.domain.repository.criptocurrencyport;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;

import java.util.List;


public interface CryptocurrencyRepositoryPort {
    List<Cryptocurrency> getCryptocurrenciesList();
}
