package com.cryptocurrencies.api.infrastructure.in.controllers;

import com.cryptocurrencies.api.domain.repository.walletprovider.WalletServicePort;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.WalletDto;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.WalletToWallerDtoMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/wallets")
public class WalletController {

    private final WalletServicePort walletServicePort;


    @GetMapping
    List<WalletDto> getWalletsById(@PathVariable("id") Long id)
    {
        return walletServicePort.getAllWallets(id);
    }
}
