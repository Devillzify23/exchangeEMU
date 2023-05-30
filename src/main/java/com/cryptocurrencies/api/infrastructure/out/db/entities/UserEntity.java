package com.cryptocurrencies.api.infrastructure.out.db.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "cuenta")
    private String cuenta;
    @Column(name = "contra")
    private String contra;
    @Column(name = "apodo")
    private String apodo;
    @Column(name = "saldo")
    private double saldo;
}
