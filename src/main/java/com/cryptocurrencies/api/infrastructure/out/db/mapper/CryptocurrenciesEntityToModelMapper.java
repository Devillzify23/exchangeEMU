package com.cryptocurrencies.api.infrastructure.out.db.mapper;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.infrastructure.out.db.entities.CryptocurrencyEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CryptocurrenciesEntityToModelMapper {
    Cryptocurrency toDomainEntity(CryptocurrencyEntity databaseEntity);
}
