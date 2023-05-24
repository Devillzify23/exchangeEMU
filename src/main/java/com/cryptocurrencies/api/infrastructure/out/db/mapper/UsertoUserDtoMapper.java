package com.cryptocurrencies.api.infrastructure.out.db.mapper;

import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsertoUserDtoMapper {
    UserDto userToUserDto(User user);
}
