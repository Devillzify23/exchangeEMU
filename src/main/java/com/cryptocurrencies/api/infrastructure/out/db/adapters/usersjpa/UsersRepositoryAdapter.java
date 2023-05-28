package com.cryptocurrencies.api.infrastructure.out.db.adapters.usersjpa;

import com.cryptocurrencies.api.domain.repository.userprovider.UserRepositoryPort;
import com.cryptocurrencies.api.infrastructure.in.controllers.exception.UserAlreadyExsitsException;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.UserMapper;
import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.infrastructure.out.db.entities.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UsersRepositoryAdapter implements UserRepositoryPort
{
    private final UsersJpaRepository usersJpaRepository;
    private final UserMapper userToModelMapper;

    public UsersRepositoryAdapter(UsersJpaRepository usersJpaRepository, UserMapper userToModelMapper) {
        this.usersJpaRepository = usersJpaRepository;
        this.userToModelMapper = userToModelMapper;
    }

    @Override
    public User getActualUser(String cuenta, String password) {
        Optional<UserEntity> user = usersJpaRepository.findByCuentaAndContra(cuenta, password);
        if (user.isPresent()) {
            return userToModelMapper.toModel(user.get());
        }
        return new User();
    }

    @Override
    @Transactional
    public User registerUser(User user, double initialFunds) throws UserAlreadyExsitsException
    {
        Optional<UserEntity> userEntity = usersJpaRepository.findByCuentaAndContra(user.getCuenta(),user.getContra());
        if(userEntity.isPresent()){
            throw new UserAlreadyExsitsException("El usuario ya existe",null);
        }
        user.setSaldo(initialFunds);
        UserEntity persistedEntity = usersJpaRepository.save(userToModelMapper.ToEntity(user));
        return userToModelMapper.toModel(persistedEntity);
    }
}
