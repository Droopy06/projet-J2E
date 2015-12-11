package project.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SampleController {

    @RequestMapping("/home")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}