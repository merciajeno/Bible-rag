package com.mercia.bible_rag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mercia.bible_rag.service.QueryService;

@Controller
public class HomeController {

	@Autowired
	QueryService queryService;
	
	@GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/ask")
    public String askQuestion(@RequestParam String question, Model model) {

        String response = queryService.generateResponse(question);

        model.addAttribute("question", question);
        model.addAttribute("response", response);

        return "index";
    }
}
