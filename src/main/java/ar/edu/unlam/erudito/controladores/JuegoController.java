package ar.edu.unlam.erudito.controladores;

import ar.edu.unlam.erudito.modelo.Jugador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JuegoController {

    @RequestMapping("/")
    public ModelAndView home(){
        Jugador nuevo=new Jugador();
        ModelMap modelo=new ModelMap();
        modelo.put("jugador",nuevo);
        return new ModelAndView("home",modelo);
    }

    @RequestMapping(path="/jugar",method = RequestMethod.POST)
    public ModelAndView recibirNombre(@ModelAttribute("jugador") Jugador jugador) {
        ModelMap modelo=new ModelMap();
        modelo.put("nombre",jugador.getNombre());
        return new ModelAndView("bienvenida",modelo);
    }
}
