package es.grupob.practica5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuciacazorlaController {
    @GetMapping("/saludo-lucia")
    public String hola() {
        return "¡Hola Mundo!";
    }
}
