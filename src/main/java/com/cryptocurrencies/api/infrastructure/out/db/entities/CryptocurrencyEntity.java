package com.cryptocurrencies.api.infrastructure.out.db.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "crypto_list")
public class CryptocurrencyEntity {
    @Id
    @Column(name = "symbol")
    private String symbol;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "maxSupply")
    private String maxSupply;
}
