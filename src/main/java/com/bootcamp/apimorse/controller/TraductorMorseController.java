package com.bootcamp.apimorse.controller;


import com.bootcamp.apimorse.model.TraductorMorse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraductorMorseController {

    @GetMapping("/{morse}")
    public String traducirAMorse(@PathVariable("morse") String morse){

        TraductorMorse tr = new TraductorMorse(morse);

        return tr.getSalida();
    }

}
