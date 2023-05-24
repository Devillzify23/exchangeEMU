package com.cryptocurrencies.api.domain.mapper;

import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.infrastructure.out.db.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserEntityToModelMapper {
    User toModel(UserEntity entity);
}
