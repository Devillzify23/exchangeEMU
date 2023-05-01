package com.cryptocurrencies.api.domain.repository.port;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;

import java.util.List;

public interface CryptocurrencyRepositoryPort {

    List<Cryptocurrency> getCryptocurrenciesList();

}
