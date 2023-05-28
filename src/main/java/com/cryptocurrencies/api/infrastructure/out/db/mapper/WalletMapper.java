package com.cryptocurrencies.api.infrastructure.out.db.mapper;

import com.cryptocurrencies.api.domain.model.Wallet;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.WalletDto;
import com.cryptocurrencies.api.infrastructure.out.db.entities.WalletEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WalletMapper
{

    @Mapping(target = "idUser",source = "walletEntity.walletEntityPK.idUser")
    @Mapping(target = "symbol",source = "walletEntity.walletEntityPK.symbol")
    Wallet walletEntityToModel(WalletEntity walletEntity);
    WalletDto walletModelToWalletDto(Wallet wallet);
}
