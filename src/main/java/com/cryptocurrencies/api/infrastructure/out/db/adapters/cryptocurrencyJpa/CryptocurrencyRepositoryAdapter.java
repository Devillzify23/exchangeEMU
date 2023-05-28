package com.cryptocurrencies.api.infrastructure.out.db.adapters.cryptocurrencyJpa;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.domain.repository.criptocurrencyport.CryptocurrencyRepositoryPort;
import com.cryptocurrencies.api.infrastructure.out.db.entities.CryptocurrencyEntity;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.CryptocurrenciesEntityToModelMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class CryptocurrencyRepositoryAdapter implements CryptocurrencyRepositoryPort
{

    private final CryptocurrencyJpaRepository cryptocurrencyRepository;
    private final CryptocurrenciesEntityToModelMapper cryptocurrenciesEntityMapper;

    @Override
    public List<Cryptocurrency> getCryptocurrenciesList()
    {
        List<CryptocurrencyEntity> dbResult = cryptocurrencyRepository.findAll();
        return dbResult.stream().map(cryptocurrenciesEntityMapper::toDomainEntity).toList();
    }
}
