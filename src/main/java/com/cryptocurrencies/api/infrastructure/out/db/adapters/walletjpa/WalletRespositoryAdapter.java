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
    private final WalletMapper walletMapper;
    @Override
    public List<Wallet> getAllWallets(Long id) {
        return walletJpaRepository.findByWalletEntityPKIdUser(id).stream().map(walletMapper::walletEntityToModel).toList();
    }

    @Override
    public Wallet createNewWallet(Long idUser, String symbol)
    {
        WalletEntity walletEntity = walletJpaRepository.save(new WalletEntity(new WalletEntityPK(idUser,symbol),0));
        return walletMapper.walletEntityToModel(walletEntity);
    }

    @Override
    public Wallet getEspecificWallet(Long id, String symbol) {

        return walletMapper.walletEntityToModel(walletJpaRepository.findByWalletEntityPKIdUserAndWalletEntityPKSymbol(id,symbol));
    }

    @Override
    public Wallet updateWallet(Wallet wallet) {

        WalletEntity walletEntity = walletMapper.toEntity(wallet);
        walletEntity.setWalletEntityPK( new WalletEntityPK(wallet.getIdUser(),wallet.getSymbol()));
        walletJpaRepository.save(walletEntity);
        return walletMapper.walletEntityToModel(walletEntity);
    }


}
