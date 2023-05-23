package com.cryptocurrencies.api.infrastructure.out.db.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(
        name = "users"
)
public class UserEntity
{
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "cuenta")
    private String cuenta;

    @Column(name = "password")
    private String password;

    @Column(name = "apodo")
    private String apodo;

    @Column(name = "saldo")
    private double saldo;
}
