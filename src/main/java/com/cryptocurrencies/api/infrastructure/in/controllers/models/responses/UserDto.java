package com.cryptocurrencies.api.infrastructure.in.controllers.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UserDto
{
    @JsonProperty("id")
    private int id;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("apellido")
    private String apellido;
    @JsonProperty("apodo")
    private String apodo;
    @JsonProperty("cuenta")
    private String cuenta;
    @JsonProperty("password")
    private String password;
    @JsonProperty("saldo")
    private double saldo;
}
