package com.factus.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController/*@RestController ➜ Es como decirle: “Esta clase va a responder a las visitas
                 del navegador (como si fuera una casita con timbre)”. */
/*Dice que esta clase va a responder peticiones HTTP (como desde el navegador o Postman).  */

public class FacturaController {

    @GetMapping("/hola")/*@GetMapping("/hola") ➜ Si alguien va a localhost:8080/hola, esta función se activa y 
                         responde con el mensajito "¡Hola, Factus!". */
    public String saludo() { //public String hola() ➜ Es la función que se activa cuando alguien toca el timbre (/hola), y devuelve un mensaje.

        return "¡Hola! Tu API de Factus ya está funcionando.";
    }
}
