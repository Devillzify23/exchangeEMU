package com.cryptocurrencies.api.infrastructure.in.controllers.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class TransactionError extends ResponseStatusException {
    public TransactionError(String message, Exception cause)
    {
        super(HttpStatus.CONFLICT,message,cause,"105",new String[]{message});
    }
}
