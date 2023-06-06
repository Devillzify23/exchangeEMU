package com.cryptocurrencies.api.infrastructure.out.db.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users_wallets")
public class WalletEntity
{
    @EmbeddedId
    private WalletEntityPK walletEntityPK;
    @Column(name = "funds")
    private BigDecimal funds;
}



