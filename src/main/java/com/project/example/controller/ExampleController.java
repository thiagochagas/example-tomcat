package com.project.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/")
public class ExampleController {


    /**
     * Get for summary Antecipation
     * Return the Antecipation Summarized information.
     *
     * @return ArvSummaryVO
     */
    @GetMapping
    public String helloWorld( ) throws ParseException {
        return "HELLO WORLD!";
    }
}
