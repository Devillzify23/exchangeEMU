package com.cryptocurrencies.api.domain.model;

import com.cryptocurrencies.api.infrastructure.out.db.entities.WalletEntityPK;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {
    private long idUser;
    private String crypto;
    private double funds;
}
