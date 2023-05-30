package com.cryptocurrencies.api.domain.port.service;

import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.infrastructure.in.controllers.exception.UserAlreadyExsitsException;


public interface UserServicePort {
    User getActualUser(String cuenta, String password);

    User updateUser(User user);
    User registerUser(User user) throws UserAlreadyExsitsException;
}
