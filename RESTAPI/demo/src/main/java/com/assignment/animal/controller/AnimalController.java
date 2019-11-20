package com.assignment.animal.controller;

import com.assignment.animal.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @RequestMapping(value = "/get-animals", method = RequestMethod.GET)
    public ResponseEntity<List<Object>> getAnimals(){
        return ResponseEntity.ok(animalService.getAnimals());
    }

    @RequestMapping(value = "/get-animal-by-name", method = RequestMethod.GET)
    public ResponseEntity<Object> getAnimalByName(@RequestParam String name){
        return ResponseEntity.ok(animalService.getAnimalByName(name));
    }

}
