package com.mercia.bible_rag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/ask")
    public String askQuestion(@RequestParam String question, Model model) {

        String response = "Searching scriptures for: " + question;

        model.addAttribute("question", question);
        model.addAttribute("response", response);

        return "index";
    }
}
