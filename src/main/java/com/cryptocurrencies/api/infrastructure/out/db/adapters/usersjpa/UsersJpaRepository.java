package com.cryptocurrencies.api.infrastructure.out.db.adapters.usersjpa;

import com.cryptocurrencies.api.infrastructure.out.db.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersJpaRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByCuentaAndContra(String cuenta, String password);
}
