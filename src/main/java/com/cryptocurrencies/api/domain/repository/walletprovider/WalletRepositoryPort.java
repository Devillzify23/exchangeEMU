package com.cryptocurrencies.api.domain.repository.walletprovider;


import com.cryptocurrencies.api.domain.model.Wallet;

import java.util.List;

public interface WalletRepositoryPort
{
    List<Wallet> getAllWallets(Long id);

    Wallet createNewWallet(Long idUser,String symbol);
}
