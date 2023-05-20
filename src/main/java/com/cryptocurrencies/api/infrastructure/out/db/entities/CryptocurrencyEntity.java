package com.cryptocurrencies.api.infrastructure.out.db.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(
        name = "cryptocurrencies"
)
public class CryptocurrencyEntity
{

    @Id
    @Column(name = "symbol")
    private String symbol;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
