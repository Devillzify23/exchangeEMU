package com.cryptocurrencies.api.infrastructure.out.db.adapters.walletjpa;

import com.cryptocurrencies.api.domain.model.Wallet;
import com.cryptocurrencies.api.infrastructure.out.db.entities.WalletEntity;
import com.cryptocurrencies.api.infrastructure.out.db.entities.WalletEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletJpaRepository extends JpaRepository<WalletEntity, WalletEntityPK>
{
    List<WalletEntity> findByWalletEntityPKIdUser(Long id);

    WalletEntity findByWalletEntityPKIdUserAndWalletEntityPKSymbol(Long id, String symbol);
}

