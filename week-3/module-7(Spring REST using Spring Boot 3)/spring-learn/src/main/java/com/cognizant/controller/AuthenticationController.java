package com.cognizant.controller;

import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.AuthenticationResponse;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authorizationHeader) {

        String encoded =
                authorizationHeader.substring(6);

        byte[] decoded =
                Base64.getDecoder().decode(encoded);

        String credentials =
                new String(decoded);

        String[] values =
                credentials.split(":");

        String username = values[0];
        String password = values[1];

        System.out.println("Username : " + username);
        System.out.println("Password : " + password);

        String data = username + ":" + password;

        String token = Base64.getEncoder().encodeToString(data.getBytes());

        return new AuthenticationResponse(token);
    }
}