package com.myapp;

import com.maven.app.Persona;

public class App {

    public static void main(String args[]){
        Persona persona = new Persona();
        persona.setId(1);
        persona.setName("Mariano");
        persona.setEdad(25);
        System.out.println(persona.toString());

    }
}
