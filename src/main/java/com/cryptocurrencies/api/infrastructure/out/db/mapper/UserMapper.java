package com.cryptocurrencies.api.infrastructure.out.db.mapper;

import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.UserDto;
import com.cryptocurrencies.api.infrastructure.out.db.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper
{
    User toModel(UserEntity entity);
    UserDto toDto(User user);
    UserEntity ToEntity(User user);

}
