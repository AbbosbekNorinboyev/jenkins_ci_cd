package uz.pdp.jenkins.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "Welcome to Jenkins Project!";
    }

    @GetMapping("v2")
    public String home2() {
        return "Welcome to Jenkins Project!";
    }
}
