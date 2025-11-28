package es.grupob.practica5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLuciaespejo {
    @GetMapping("/hola")
    public String hola() {
 luciaespejo
        return "¡Hola Mundo! Soy Lucia Espejo Molina este es mi controlador";

        return "¡Hola Mundo! Soy Lucia Espejo Molina";
main
    }
}
