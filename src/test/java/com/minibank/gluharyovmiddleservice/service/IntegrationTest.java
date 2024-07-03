package com.minibank.gluharyovmiddleservice.service;

import com.minibank.gluharyovmiddleservice.controller.ClientController;
import com.minibank.gluharyovmiddleservice.feign.CreateUserRequestFeign;
import com.minibank.gluharyovmiddleservice.model.RegisterAccountRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.*;

@SpringBootTest
public class IntegrationTest {

    @Autowired
    ClientController clientController;

    @MockBean
    CreateUserRequestFeign mockCreateUserRequestFeign;

    @Test
    public void testRegisterCommand() {

        var userName = "max";
        var userId = 1234L;





        RegisterAccountRequest request = spy(new RegisterAccountRequest(userName, userId)) ;

        mockCreateUserRequestFeign.register(request);

        verify(mockCreateUserRequestFeign, atLeastOnce()).register(request);

    }
}
