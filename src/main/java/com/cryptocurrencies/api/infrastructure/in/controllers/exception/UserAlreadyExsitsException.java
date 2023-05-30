package com.cryptocurrencies.api.infrastructure.in.controllers.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UserAlreadyExsitsException extends ResponseStatusException
{
    public UserAlreadyExsitsException(String message, Exception cause)
    {
        super(HttpStatus.UNPROCESSABLE_ENTITY, message, cause,"100",new String[]{message});
    }
}
