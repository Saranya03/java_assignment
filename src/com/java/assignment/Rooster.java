package com.java.assignment;


import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken {

    Map<String,String> languages = new HashMap<String, String>(){{
        put("Danish","kykyliky");
        put("Dutch","kukeleku");
        put("Finnish","kukko kiekuu");
        put("French","cocorico");
        put("English","kukukuku");
    }};

    String language;

    public Rooster(){
        language = "English";
    }

    public Rooster(String lang){
        language = lang;
    }

    @Override
    public void makeSound() {
        System.out.println(languages.get(language));
    }

}
