package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/owner")
@RequiredArgsConstructor
public class OwnerController {

    @RequestMapping("/info")
    public void info() {
        System.out.println("info");
    }
}
