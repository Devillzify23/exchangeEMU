package com.cryptocurrencies.api.infrastructure.out.db.adapters.walletjpa;

import com.cryptocurrencies.api.domain.model.Wallet;
import com.cryptocurrencies.api.domain.repository.walletprovider.WalletRepositoryPort;
import com.cryptocurrencies.api.infrastructure.out.db.entities.WalletEntity;
import com.cryptocurrencies.api.infrastructure.out.db.entities.WalletEntityPK;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.WalletMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;

@AllArgsConstructor
@Repository
public class WalletRespositoryAdapter implements WalletRepositoryPort
{

    private final WalletJpaRepository walletJpaRepository;
    private final WalletMapper walletEntityToModelMapper;
    @Override
    public List<Wallet> getAllWallets(Long id) {
        return walletJpaRepository.findByWalletEntityPKIdUser(id).stream().map(walletEntityToModelMapper::walletEntityToModel).toList();
    }

    @Override
    public Wallet createNewWallet(Long idUser, String symbol)
    {
        WalletEntity walletEntity = walletJpaRepository.save(new WalletEntity(new WalletEntityPK(idUser,symbol),0));
        return walletEntityToModelMapper.walletEntityToModel(walletEntity);
    }
}
