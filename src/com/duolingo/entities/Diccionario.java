package com.duolingo.entities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Diccionario {
    private Map<String,Set<String>> diccionario = new HashMap<>();

    public void agregarPalabrita(String palabrita){
        String inicialPalabrita;
        inicialPalabrita = palabrita.substring(0,1);

        if(diccionario.containsKey(inicialPalabrita)){
            diccionario.get(inicialPalabrita).add(palabrita);

        }else{
            Set<String> nuevaColeccion = new HashSet<>();
            diccionario.put(inicialPalabrita,nuevaColeccion);
            diccionario.get(inicialPalabrita).add(palabrita);
        }
    }
    public void eliminarPalabrita(String palabraEliminar){
        boolean palabraEliminada= false;
        for(Set<String> palabras : diccionario.values()){
            if(palabras.contains(palabraEliminar)){
                palabras.remove(palabraEliminar);{
                    palabraEliminada = true;
                    break;
                }
            }
        }

        if(palabraEliminada){
           System.out.println("Word successfully delete");
            System.out.println("************************************");
        }else {
            System.out.println("The word doesn't exist in the dictionary");
            System.out.println("************************************");
        }
    }
    public void palabrasIguales(String palabraComparar){
        boolean existePalabrita = false;
        for(Set<String> palabras : diccionario.values()){
            if(palabras.contains(palabraComparar)){
                existePalabrita = true;
                break;
            }
        }
        if(existePalabrita){
            System.out.println("The word already exist");
            System.out.println("************************************");
        }else {
            System.out.println("the word does not exist in the dictionary");
            System.out.println("************************************");
        }
    }
    public void mostrarIniciales (){
        System.out.println( "List of available initials " + diccionario.keySet());
        System.out.println("************************************");
    }

    public void mostrarPalabras(String inicialSolicitada){
        System.out.println("List of available words" + diccionario.get(inicialSolicitada));
        System.out.println("************************************");
    }
}
