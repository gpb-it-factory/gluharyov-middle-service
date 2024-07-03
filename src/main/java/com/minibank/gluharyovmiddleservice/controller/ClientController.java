package com.minibank.gluharyovmiddleservice.controller;

import com.minibank.gluharyovmiddleservice.model.RegisterAccountRequest;
import com.minibank.gluharyovmiddleservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(value = "/v2/users")
    public ResponseEntity<HttpStatus> register(@RequestBody RegisterAccountRequest request) {
        clientService.register(request);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
