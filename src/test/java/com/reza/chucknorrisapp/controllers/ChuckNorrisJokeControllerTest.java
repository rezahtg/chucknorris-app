package com.reza.chucknorrisapp.controllers;

import com.reza.chucknorrisapp.services.ChuckNorrisJokeServiceImpl;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChuckNorrisJokeControllerTest {

    ChuckNorrisJokeController controller;

    @BeforeEach
    void setUp() {
        controller = new ChuckNorrisJokeController(new ChuckNorrisJokeServiceImpl());
    }

//    @Test
//    void getJoke() {
//        System.out.println(controller.getJoke());
//    }
}