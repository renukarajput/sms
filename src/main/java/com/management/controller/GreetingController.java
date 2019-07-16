package com.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    private static final String appName = "Tour";

    @GetMapping("/")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "guest") String name,
                           Model model) {
        model.addAttribute("name", name);
        model.addAttribute("title", appName);
        return "user";
    }
}
