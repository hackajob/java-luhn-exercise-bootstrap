package uk.co.argos.interview.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import uk.co.argos.interview.service.CardNumberValidationService;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @GetMapping("/h/c/n/{card}")
    public boolean check(@PathVariable String card) {
        CardNumberValidationService validator = new CardNumberValidationService();

        return validator.isValid(card);
    }
}
