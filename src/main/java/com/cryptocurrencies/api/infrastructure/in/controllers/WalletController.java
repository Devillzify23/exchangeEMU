package com.cryptocurrencies.api.infrastructure.in.controllers;

import com.cryptocurrencies.api.domain.repository.walletprovider.WalletRepositoryPort;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.WalletDto;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.WalletMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/wallets")
public class WalletController {

    private final WalletRepositoryPort walletServicePort;
    private final WalletMapper walletEntityToModelMapper;

    @GetMapping("/{id}")
    List<WalletDto> getWalletsById(@PathVariable("id") Long id)
    {
        List<WalletDto> wallets = walletServicePort.getAllWallets(id).stream().map(walletEntityToModelMapper::walletModelToWalletDto).toList();
        return wallets;
    }
}
