package ar.edu.unlam.erudito.controladores;

import ar.edu.unlam.erudito.modelo.Jugador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JuegoController {

    @RequestMapping("/")
    public ModelAndView home(){
        return new ModelAndView("home");
    }

    @RequestMapping("/enviar-invitaciones")
    public ModelAndView enviarInvitaciones(){
        return null;
    }

    @RequestMapping(path="/jugar",method = RequestMethod.POST)
    public ModelAndView recibirNombre(Jugador jugador) {
        ModelMap datos=new ModelMap();
        datos.put("nombre",jugador.getNombre());
        return new ModelAndView("bienvenida",datos);
    }
}
