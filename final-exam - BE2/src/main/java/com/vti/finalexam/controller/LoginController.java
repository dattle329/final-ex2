package com.vti.finalexam.controller;

import com.vti.finalexam.dto.UserDto;
import com.vti.finalexam.entity.User;
import com.vti.finalexam.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


@RestController
@RequestMapping(value = "api/v1/login")
@CrossOrigin("*")
public class LoginController {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<?> login(Principal principal) {
        String username = principal.getName();
        // Tim account tương ứng dựa vào username
        User userLogin = userService.findUserByUsername(username);
        UserDto userDTO = mapper.map(userLogin, UserDto.class);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

}
