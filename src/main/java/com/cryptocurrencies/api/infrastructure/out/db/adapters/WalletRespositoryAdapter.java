package com.cryptocurrencies.api.infrastructure.out.db.adapters;

import com.cryptocurrencies.api.domain.model.Wallet;
import com.cryptocurrencies.api.domain.repository.walletprovider.WalletServicePort;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.WalletDto;
import com.cryptocurrencies.api.infrastructure.out.db.adapters.JpaInteface.WalletJpaRepository;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.WalletEntityToModelMapper;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.WalletToWallerDtoMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
public class WalletRespositoryAdapter implements WalletServicePort {

    private final WalletJpaRepository walletJpaRepository;
    private final WalletEntityToModelMapper walletEntityToModelMapper;
    private final WalletToWallerDtoMapper walletToWallerDtoMapper;
    @Override
    public List<WalletDto> getAllWallets(Long id) {
        return walletJpaRepository.findByWalletEntityPKIdUser(id).stream().map(walletEntityToModelMapper::walletEntityToModel).toList()
                .stream().map(z -> walletToWallerDtoMapper.walletToWalletDto(z)).toList();
    }
}
