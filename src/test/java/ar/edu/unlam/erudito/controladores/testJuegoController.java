package ar.edu.unlam.erudito.controladores;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import static org.assertj.core.api.Assertions.*;

public class testJuegoController {

    private JuegoController juego=new JuegoController();
    private ModelAndView mav;

    @Test
    public void testQueMuestraInicio(){
        mav=juego.home();
        assertThat(mav.getViewName()).isEqualTo("home");
    }

    @Test
    public void testQueRecibeNombre(){
        String nombreJugador="Matias";
        mav=juego.recibirNombre(nombreJugador);
        assertThat(mav.getModel().get("nombre")).isEqualTo(nombreJugador);
    }
}
