package com.cryptocurrencies.api.infrastructure.out.db.adapters;

import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.domain.repository.userprovider.UserServicePort;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.UsersEntityMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UsersRepositoryAdapter implements UserServicePort
{
    private final UsersJpaRepository usersJpaRepository;

    private final UsersEntityMapper usersEntityMapper;

    public UsersRepositoryAdapter(UsersJpaRepository usersJpaRepository, UsersEntityMapper usersEntityMapper)
    {
        this.usersJpaRepository = usersJpaRepository;
        this.usersEntityMapper = usersEntityMapper;
    }


    @Override
    public User getActualUser(String cuenta, String password)
    {
        return null;
    }
}
