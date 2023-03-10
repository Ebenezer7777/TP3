package fr.ensim.info.tp3aymaneouhadi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/greeting")
    public String greeting(
        @RequestParam(name="nameGET", required=false, defaultValue="World") String name,
        Model model
    ) {
        model.addAttribute("nomTemplate", name);
        return "greeting";
    }


}
