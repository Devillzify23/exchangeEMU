package com.cryptocurrencies.api.infrastructure.in.controllers;

import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.domain.port.service.UserServicePort;
import com.cryptocurrencies.api.infrastructure.in.controllers.exception.UserAlreadyExsitsException;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.UserDto;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController
{
    @Autowired
    private UserServicePort userServicePort;
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/login/{cuenta}/{password}")
    public UserDto getLogin(@PathVariable("cuenta") String cuenta, @PathVariable("password") String contra)
    {
        User encontrado = userServicePort.getActualUser(cuenta, contra);

        return new UserDto(encontrado.getId(), encontrado.getNombre(), encontrado.getApellido(), encontrado.getApodo(), encontrado.getCuenta(), encontrado.getContra(), encontrado.getSaldo());
    }

    @PostMapping("/register")
    public UserDto crearUser(@RequestBody User user)
    {
        try
        {
            User creado = userServicePort.registerUser(user);
            return userMapper.toDto(creado);
        } catch (UserAlreadyExsitsException exc)
        {
            throw exc;
        }
    }
}
