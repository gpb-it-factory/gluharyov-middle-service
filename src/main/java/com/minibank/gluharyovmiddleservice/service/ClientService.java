package com.minibank.gluharyovmiddleservice.service;

import com.minibank.gluharyovmiddleservice.feign.CreateUserRequestFeign;
import com.minibank.gluharyovmiddleservice.model.RegisterAccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {

    @Autowired
    private CreateUserRequestFeign createUserRequestFeign;

    public void register(RegisterAccountRequest registerAccountRequest) {
        createUserRequestFeign.register(registerAccountRequest);
    }

    }

