package com.cryptocurrencies.api.infrastructure.out.db.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "users")
public class UserEntity {
    @Id
    @Column(name = "id")
    private Long id;

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
