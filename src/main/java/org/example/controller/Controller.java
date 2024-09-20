package org.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Controller {
    @GetMapping("/hello")
    public String sayHello() {
        String id = UUID.randomUUID().toString();
        log.debug("Hello: ",id);
        return "hello " + id;
    }
}