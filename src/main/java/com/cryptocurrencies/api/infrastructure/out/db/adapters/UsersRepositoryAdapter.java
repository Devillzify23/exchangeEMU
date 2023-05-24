package com.cryptocurrencies.api.infrastructure.out.db.adapters;

import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.domain.repository.userprovider.UserServicePort;
import com.cryptocurrencies.api.infrastructure.out.db.entities.UserEntity;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.UsersEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

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
        Optional<UserEntity> user = usersJpaRepository.findByCuentaAndPassword(cuenta,password);
        if(user.isPresent()){
            return new User(user.get().getId(),user.get().getNombre(),user.get().getApellido(),user.get().getApodo(),user.get().getCuenta(),user.get().getPassword(),user.get().getSaldo());
        }
        return new User();
    }
}
