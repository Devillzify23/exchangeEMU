package com.cryptocurrencies.api.domain.repository.port;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CryptocurrencyRepositoryPort {

    List<Cryptocurrency> getCryptocurrenciesList();

}
