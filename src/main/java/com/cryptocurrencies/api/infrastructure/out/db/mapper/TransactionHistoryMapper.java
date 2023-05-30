package com.cryptocurrencies.api.infrastructure.out.db.mapper;

import com.cryptocurrencies.api.domain.model.TransactionHistory;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.TransactionHistoryDto;
import com.cryptocurrencies.api.infrastructure.out.db.entities.TransactionHistoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionHistoryMapper
{
    TransactionHistory toModel(TransactionHistoryEntity transactionHistoryEntity);
    TransactionHistoryDto toDto(TransactionHistory transactionHistory);

    TransactionHistoryEntity toEntity(TransactionHistory transactionHistory);
}
