package com.cryptocurrencies.api.infrastructure.out.db.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WalletEntityPK implements Serializable {
    @Column(name = "idUser")
    private long idUser;
    @Column(name = "symbol")
    private String symbol;
}
