package ton.example.employeemanager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping
public class ExampleController {
    @GetMapping("/hello")
    public String greeting() {
        return "Hello, World";
    }
}
