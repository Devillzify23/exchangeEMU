package com.cryptocurrencies.api.infrastructure.out.db.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "wallets")
public class WalletEntity
{

    @EmbeddedId
    private WalletEntityPK walletEntityPK;

    @Column(name = "funds")
    private double funds;
}



