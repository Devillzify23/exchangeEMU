package com.cryptocurrencies.api.domain.repository.userprovider;

import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.infrastructure.in.controllers.exception.UserAlreadyExsitsException;
import com.cryptocurrencies.api.infrastructure.out.db.entities.UserEntity;

public interface UserRepositoryPort
{
    User getActualUser(String cuenta, String password);
    User registerUser(User user, double initialFunds) throws UserAlreadyExsitsException;

    User updateUser(User user);

    User getUserById(Long id);
}
