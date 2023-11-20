package com.jjwte.SpringSecurityTraining.controllers;

import com.jjwte.SpringSecurityTraining.mappers.AuthenticationRequest;
import com.jjwte.SpringSecurityTraining.mappers.AuthenticationResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody
            @Valid AuthenticationRequest authRequest){
        return null;
    }
}
