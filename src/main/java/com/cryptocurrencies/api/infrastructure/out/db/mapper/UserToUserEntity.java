package com.cryptocurrencies.api.infrastructure.out.db.mapper;

import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.infrastructure.out.db.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserToUserEntity {
    UserEntity userToEntity(User user);
}
