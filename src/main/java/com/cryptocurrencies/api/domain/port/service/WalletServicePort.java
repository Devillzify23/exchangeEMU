package com.cryptocurrencies.api.domain.port.service;

import com.cryptocurrencies.api.domain.model.Wallet;

import java.util.List;

public interface WalletServicePort
{
    List<Wallet> getAllWallets(Long id);
}
