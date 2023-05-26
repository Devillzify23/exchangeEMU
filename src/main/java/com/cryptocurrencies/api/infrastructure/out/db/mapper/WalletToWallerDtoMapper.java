package com.cryptocurrencies.api.infrastructure.out.db.mapper;


import com.cryptocurrencies.api.domain.model.Wallet;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.WalletDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WalletToWallerDtoMapper {
    WalletDto walletToWalletDto(Wallet wallet);
}
