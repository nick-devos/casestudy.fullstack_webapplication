package com.devos.perscholas.casestudy.controllers;

import com.devos.perscholas.casestudy.dto.RegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping
    public void signup(@RequestBody RegisterRequest registerRequest) {

    }
}
