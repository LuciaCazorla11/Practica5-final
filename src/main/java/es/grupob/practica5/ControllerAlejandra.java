package es.grupob.practica5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController 
public class ControllerAlejandra {

    @GetMapping("/holamundo")
    public String saludar() {
        return "¡Hola mundo! Soy Alejandra Viñegla y este es el controlador de mi rama de desarrollo.";
    }
}