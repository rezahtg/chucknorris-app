package com.reza.chucknorrisapp.controllers;

import com.reza.chucknorrisapp.services.ChuckNorrisJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokeController {

    private final ChuckNorrisJokeService chuckNorrisJokeService;


    public ChuckNorrisJokeController(ChuckNorrisJokeService chuckNorrisJokeService) {
        this.chuckNorrisJokeService = chuckNorrisJokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("index", chuckNorrisJokeService.getRandomQuote());

        return "index";
    }
}
