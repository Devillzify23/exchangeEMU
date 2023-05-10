package com.cryptocurrencies.api.infrastructure.out.db.adapters;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.domain.repository.port.CryptocurrencyRepositoryPort;
import com.cryptocurrencies.api.infrastructure.out.db.entities.CryptocurrencyEntity;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.CryptocurrenciesEntityMapper;

import java.util.List;
import java.util.stream.Collectors;

public class CryptocurrencyRepositoryAdapter implements CryptocurrencyRepositoryPort {

    private final CryptocurrencyJpaRepository cryptocurrencyRepository;
    private final CryptocurrenciesEntityMapper cryptocurrenciesEntityMapper;


    public CryptocurrencyRepositoryAdapter(
            CryptocurrencyJpaRepository cryptocurrencyRepository,
            CryptocurrenciesEntityMapper cryptocurrenciesEntityMapper){
        this.cryptocurrencyRepository = cryptocurrencyRepository;
        this.cryptocurrenciesEntityMapper = cryptocurrenciesEntityMapper;
    }

    @Override
    public List<Cryptocurrency> getCryptocurrenciesList() {
        List<CryptocurrencyEntity> dbResult = cryptocurrencyRepository.findAll();
        List<Cryptocurrency> results = dbResult.stream().map(x -> cryptocurrenciesEntityMapper.toDomainEntity(x)).collect(Collectors.toList());
        return results;
    }
}