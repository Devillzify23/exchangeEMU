package com.cryptocurrencies.api.infrastructure.out.db.adapters.JpaInteface;

import com.cryptocurrencies.api.infrastructure.out.db.entities.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletJpaRepository extends JpaRepository<WalletEntity,Long>
{
    List<WalletEntity> findByWalletEntityPKIdUser(Long id);
}

