package com.cryptocurrencies.api.infrastructure.in.controllers;

import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.domain.repository.userprovider.UserServicePort;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.UserDto;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.UsertoUserDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserServicePort userServicePort;
    @Autowired
    private UsertoUserDtoMapper usertoUserDtoMapper;

    @GetMapping("/login/{cuenta}/{password}")
    public UserDto getLogin(@PathVariable("cuenta") String cuenta, @PathVariable("password") String contra) {
        User encontrado = userServicePort.getActualUser(cuenta, contra);

        return new UserDto(encontrado.getId(), encontrado.getNombre(), encontrado.getApellido(), encontrado.getApodo(), encontrado.getCuenta(), encontrado.getContra(), encontrado.getSaldo());
    }

    @PostMapping("/register")
    public UserDto crearUser(@RequestBody User user) throws Exception {

        userServicePort.registerUser(user);
        return usertoUserDtoMapper.userToUserDto(user);
    }
}
