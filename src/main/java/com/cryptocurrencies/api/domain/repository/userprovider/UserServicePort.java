package com.cryptocurrencies.api.domain.repository.userprovider;

import com.cryptocurrencies.api.domain.model.User;

public interface UserServicePort
{
    User getActualUser(String cuenta, String password);
}
