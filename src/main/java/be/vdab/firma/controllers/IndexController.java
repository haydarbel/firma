package be.vdab.firma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
 class IndexController {
    public String index() {
        return "index";
    }
}
