package com.cryptocurrencies.api.domain.mapper;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.CryptocurrencyDto;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface CryptoCurrencyToCryptoCurrencyDtoMapper {
    CryptocurrencyDto cryptoToCryptoDto(Cryptocurrency cryptocurrency);
}
