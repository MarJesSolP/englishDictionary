package com.duolingo.entities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Diccionario {
    private Map<String,Set<String>> palabritas = new HashMap<>();

    public void agregarPalabrita(String palabrita){
        String inicialPalabrita;
        inicialPalabrita = palabrita.substring(0,1);

        if(palabritas.containsKey(inicialPalabrita)){
            palabritas.get(inicialPalabrita).add(palabrita);

        }else{
            Set<String> nuevaColeccion = new HashSet<>();
            palabritas.put(inicialPalabrita,nuevaColeccion);
            palabritas.get(inicialPalabrita).add(palabrita);
        }


    }

}
