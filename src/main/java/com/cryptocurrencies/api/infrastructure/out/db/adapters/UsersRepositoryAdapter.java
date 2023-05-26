package com.cryptocurrencies.api.infrastructure.out.db.adapters;

import com.cryptocurrencies.api.domain.mapper.UserEntityToModelMapper;
import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.domain.repository.userprovider.UserServicePort;
import com.cryptocurrencies.api.infrastructure.out.db.adapters.JpaInteface.UsersJpaRepository;
import com.cryptocurrencies.api.infrastructure.out.db.entities.UserEntity;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.UserToUserEntity;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UsersRepositoryAdapter implements UserServicePort {
    private final UsersJpaRepository usersJpaRepository;
    private final UserEntityToModelMapper userToModelMapper;
    private final UserToUserEntity userToUserEntity;

    public UsersRepositoryAdapter(UsersJpaRepository usersJpaRepository, UserEntityToModelMapper userToModelMapper, UserToUserEntity userToUserEntity) {
        this.usersJpaRepository = usersJpaRepository;
        this.userToModelMapper = userToModelMapper;
        this.userToUserEntity = userToUserEntity;
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
    @Transactional
    public void registerUser(User user) throws Exception {
        Optional<UserEntity> exists = usersJpaRepository.findByCuentaAndPassword(user.getCuenta(),user.getPassword());

        if(exists.isPresent())
        {
            throw new Exception("El usuario ya existe");
        }
        else
        {
            user.setSaldo(50000.0);
            usersJpaRepository.save(userToUserEntity.userToEntity(user));
        }
    }
}
