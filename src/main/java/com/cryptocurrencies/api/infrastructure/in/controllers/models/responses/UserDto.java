package com.cryptocurrencies.api.infrastructure.in.controllers.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDto {
    @JsonProperty("id")
    private Long id;
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
