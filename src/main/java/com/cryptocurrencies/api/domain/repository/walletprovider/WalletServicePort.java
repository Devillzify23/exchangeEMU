package com.cryptocurrencies.api.domain.repository.walletprovider;


import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.WalletDto;

import java.util.List;

public interface WalletServicePort {
    List<WalletDto> getAllWallets(Long id);
}
