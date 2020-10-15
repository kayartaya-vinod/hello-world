package co.vinod.tests;

import co.vinod.service.HelloService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHelloService {

    HelloService service;

    @BeforeEach
    void init() {
        service = new HelloService();
    }

    @Test
    void testGetGreeting() {
        Assertions.assertEquals("Hello, World!", service.getGreeting());
    }
}
