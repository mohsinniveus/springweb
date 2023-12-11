package com.niveus.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemowebController {

    @GetMapping("/")
    public String home() {
        return " ArgoCD - Canary Deployment - Version 2.0.0";
    }

}