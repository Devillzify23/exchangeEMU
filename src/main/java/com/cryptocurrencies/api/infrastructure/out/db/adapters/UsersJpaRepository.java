package com.cryptocurrencies.api.infrastructure.out.db.adapters;

import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.infrastructure.out.db.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersJpaRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByCuentaAndPassword(String cuenta, String password);
}
