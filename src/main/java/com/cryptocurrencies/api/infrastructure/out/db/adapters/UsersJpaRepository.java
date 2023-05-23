package com.cryptocurrencies.api.infrastructure.out.db.adapters;

import com.cryptocurrencies.api.infrastructure.out.db.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersJpaRepository extends JpaRepository<UserEntity,Long>
{
}
