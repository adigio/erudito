package ar.edu.unlam.erudito.controladores;

import ar.edu.unlam.erudito.modelo.Jugador;
import ar.edu.unlam.erudito.servicios.ServicioJuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JuegoController {
    private ServicioJuego servicioJuego;

    @Autowired
    public JuegoController(ServicioJuego servicioJuego){
        this.servicioJuego=servicioJuego;
    }

    @RequestMapping("/")
    public ModelAndView home(){
        Jugador nuevo=new Jugador();
        ModelMap modelo=new ModelMap();
        modelo.put("jugador",nuevo);
        return new ModelAndView("home",modelo);
    }

    @RequestMapping(path="/invitar",method = RequestMethod.POST)
    public ModelAndView recibirDatosDelJuego(@ModelAttribute("jugador") Jugador jugador) {
        ModelMap modelo=new ModelMap();
        Integer codigo= servicioJuego.generarCodigo();
        modelo.put("nombre",jugador.getNombre());
        modelo.put("codigo",codigo);
        return new ModelAndView("bienvenida",modelo);
    }
}
