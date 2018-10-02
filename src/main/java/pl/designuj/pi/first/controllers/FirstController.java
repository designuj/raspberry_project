package pl.designuj.pi.first.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FirstController {

    @RequestMapping({"/", ""})
    public String getIndexPage() {
        return "Hello!";
    }
}
