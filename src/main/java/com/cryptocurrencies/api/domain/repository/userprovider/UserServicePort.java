package com.cryptocurrencies.api.domain.repository.userprovider;

import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.infrastructure.out.db.entities.UserEntity;

public interface UserServicePort {
    User getActualUser(String cuenta, String password);

    UserEntity registerUser(User user) throws Exception;

}
