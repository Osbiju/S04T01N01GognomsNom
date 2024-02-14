package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController //es necesario poner la anotacion para avisar al programa que es el controler
public class HelloWorldController {

    @GetMapping("/HelloWorld") // para establecer el metodo mediante el cual se va a ejecutar este endpoint(SOLO PARA EL METODO GET(CONSULTA DE DATOS))
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom){
        return "Hola, " + nom + ". Estas executant un projecte Maven";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nom}"}) //OJO en {nom}
    public String saluda2(@PathVariable(required = false) String nom){
        return "Hola, " + nom + ". Estas executant un projecte Maven";
    }
}
