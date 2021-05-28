package ar.edu.unlam.erudito.controladores;

import ar.edu.unlam.erudito.modelo.Jugador;
import ar.edu.unlam.erudito.servicios.ServicioAgregarJugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JuegoController {

    private ServicioAgregarJugador servicioAgregarJugador;

    @Autowired
    public JuegoController(ServicioAgregarJugador servicioAgregarJugador){
        this.servicioAgregarJugador=servicioAgregarJugador;
    }

    @RequestMapping("/")
    public ModelAndView irAlHome(){
        Jugador jugador =new Jugador();
        ModelMap modelo = new ModelMap();
        modelo.put("jugador", jugador);
        return new ModelAndView("home", modelo);
    }

    @RequestMapping("/agregarJugador")
    public ModelAndView agregaJugador(@ModelAttribute("jugador") Jugador nuevoJugador){
            ModelMap model = new ModelMap();
            Boolean jugadorAgregado = servicioAgregarJugador.agregarJugador(nuevoJugador);
            if(!jugadorAgregado){
                model.put("mensaje", "No se pudo agregar Jugador");
                return new ModelAndView("home", model);
            }else{
                return new ModelAndView("bienvenida");
            }


    }

}
