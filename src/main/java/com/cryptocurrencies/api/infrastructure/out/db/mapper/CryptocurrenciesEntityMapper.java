package com.cryptocurrencies.api.infrastructure.out.db.mapper;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.infrastructure.out.db.entities.CryptocurrencyEntity;
import org.mapstruct.Mapper;

@Mapper
public abstract class CryptocurrenciesEntityMapper {

    public abstract Cryptocurrency toDomainEntity(CryptocurrencyEntity databaseEntity);
}
