package com.cryptocurrencies.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User
{
    private int id;
    private String nombre;
    private String apellido;
    private String apodo;
    private String cuenta;
    private String password;
    private double saldo;
}
