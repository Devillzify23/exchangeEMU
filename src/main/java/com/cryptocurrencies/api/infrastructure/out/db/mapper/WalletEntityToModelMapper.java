package com.cryptocurrencies.api.infrastructure.out.db.mapper;

import com.cryptocurrencies.api.domain.model.Wallet;
import com.cryptocurrencies.api.infrastructure.out.db.entities.WalletEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WalletEntityToModelMapper {

    @Mapping(target = "idUser",source = "walletEntity.walletEntityPK.idUser")
    @Mapping(target = "crypto",source = "walletEntity.walletEntityPK.crypto")
    Wallet walletEntityToModel(WalletEntity walletEntity);
}
