package com.cryptocurrencies.api.application.service.adapter;

import com.cryptocurrencies.api.domain.model.Wallet;
import com.cryptocurrencies.api.domain.port.service.WalletServicePort;
import com.cryptocurrencies.api.domain.repository.walletprovider.WalletRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletServiceAdapter implements WalletServicePort
{
    private final WalletRepositoryPort walletRepositoryPort;

    public WalletServiceAdapter(WalletRepositoryPort walletRepositoryPort)
    {
        this.walletRepositoryPort = walletRepositoryPort;
    }

    @Override
    public List<Wallet> getAllWallets(Long id)
    {
        return walletRepositoryPort.getAllWallets(id);
    }
}
