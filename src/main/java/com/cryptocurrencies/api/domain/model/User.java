package com.cryptocurrencies.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User
{
    private Integer id;
    private String nombre;
    private String apellido;
    private String apodo;
    private String cuenta;
    private String password;
    private Double saldo;
}
