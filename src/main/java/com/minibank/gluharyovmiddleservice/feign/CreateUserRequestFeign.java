package com.minibank.gluharyovmiddleservice.feign;

import com.minibank.gluharyovmiddleservice.model.RegisterAccountRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;



@FeignClient(name = "register-service", path = "/v2/users")
public interface CreateUserRequestFeign {

    @PostMapping()
    ResponseEntity<HttpStatus> register(RegisterAccountRequest registerAccountRequest);
}
