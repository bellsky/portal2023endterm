package com.example.portalend;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class PageController {
        @RequestMapping("../../resources/templates/home.html")
        public String home(Model model) {
            model.addAttribute("title", "Hello World!");
            return "home";
        }
}
