package com.cryptocurrencies.api.infrastructure.in.controllers.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

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
    @JsonProperty("contra")
    private String contra;
    @JsonProperty("saldo")
    private BigDecimal saldo;
}
