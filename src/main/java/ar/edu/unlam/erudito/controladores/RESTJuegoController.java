package ar.edu.unlam.erudito.controladores;

import ar.edu.unlam.erudito.modelo.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RESTJuegoController {

    @RequestMapping(value = "/datos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code= HttpStatus.CREATED)
    public Usuario datos(){
        Usuario nuevo=new Usuario();
        nuevo.setEmail("matias@correo.com");
        return nuevo;
    }
}
