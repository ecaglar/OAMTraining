package com.zipwhip.oam.api.helpers;


import java.util.ArrayList;
import java.util.List;

public class StringConverter {

    public List<String> convertStringToList(String toBeConverted) {
        List<String> converter = new ArrayList<String>();
        if(toBeConverted.length() > 1){
            for(String convert : toBeConverted.split(", ")) {
                converter.add(convert);
            }
        }
        return converter;
    }
}
