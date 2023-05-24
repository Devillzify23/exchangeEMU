package com.cryptocurrencies.api.infrastructure.out.db.adapters;

import com.cryptocurrencies.api.domain.mapper.UserEntityToModelMapper;
import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.domain.repository.userprovider.UserServicePort;
import com.cryptocurrencies.api.infrastructure.out.db.entities.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UsersRepositoryAdapter implements UserServicePort {
    private final UsersJpaRepository usersJpaRepository;

    private final UserEntityToModelMapper userToModelMapper;

    public UsersRepositoryAdapter(UsersJpaRepository usersJpaRepository, UserEntityToModelMapper userToModelMapper) {
        this.usersJpaRepository = usersJpaRepository;
        this.userToModelMapper = userToModelMapper;
    }


    @Override
    public User getActualUser(String cuenta, String password) {
        Optional<UserEntity> user = usersJpaRepository.findByCuentaAndPassword(cuenta, password);
        if (user.isPresent()) {
            return userToModelMapper.toModel(user.get());
        }
        return new User();
    }

    @Override
    public UserEntity registerUser(User user) {
        return null;
    }


}
