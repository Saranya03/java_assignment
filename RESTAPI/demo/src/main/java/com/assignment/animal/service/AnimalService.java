package com.assignment.animal.service;

import com.assignment.animal.entity.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AnimalService {

    Map<String,Object> animals = new HashMap<String, Object>(){{
        put("Chicken",new Chicken());
        put("Dolphin",new Dolphin());
        put("Duck",new Duck());
        put("Shark",new Shark());
        put("Butterfly",new Butterfly());
    }};

    public List<Object> getAnimals(){
        List<Object> animalList = new ArrayList<>();
        animals.values().forEach(obj -> {
            animalList.add(obj);
        });

        return animalList;
    }

    public Object getAnimalByName(String name) {
        return animals.get(name);
    }
}
