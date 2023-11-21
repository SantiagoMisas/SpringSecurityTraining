package com.jjwte.SpringSecurityTraining.controllers;

import com.jjwte.SpringSecurityTraining.mappers.AuthenticationRequest;
import com.jjwte.SpringSecurityTraining.mappers.AuthenticationResponse;
import com.jjwte.SpringSecurityTraining.services.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody
            @Valid AuthenticationRequest authRequest){

        AuthenticationResponse jwtDto=authenticationService.login(authRequest);
        return ResponseEntity.ok(jwtDto);
    }

    @GetMapping("/public-access")
    public String publicAccessEndpoint (){
        return "este endpoint es publico";
    }


}
