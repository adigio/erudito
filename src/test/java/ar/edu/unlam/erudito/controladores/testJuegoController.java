package ar.edu.unlam.erudito.controladores;

import ar.edu.unlam.erudito.modelo.Jugador;
import ar.edu.unlam.erudito.servicios.ServicioJuegoImpl;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import static org.assertj.core.api.Assertions.*;

public class testJuegoController {

    private JuegoController juego=new JuegoController(new ServicioJuegoImpl());
    private ModelAndView mav;

    @Test
    public void testQueMuestraInicio(){
        mav=juego.home();
        assertThat(mav.getViewName()).isEqualTo("home");
    }

    @Test
    public void testQueRecibeJugador(){
        mav=juego.home();
        assertThat(mav.getModel().get("jugador")).isInstanceOf(Jugador.class);
    }

    @Test
    public void testQueRecibeNombre(){
        Jugador jugador=new Jugador();
        jugador.setNombre("Matias");
        mav=juego.recibirNombre(jugador);
        assertThat(mav.getModel().get("nombre")).isEqualTo("Matias");
    }

    @Test
    public void testQueRecibeNumero(){
        mav=juego.recibirNumero();
        assertThat(mav.getModel().get("codigo")).isInstanceOf(Integer.class);
    }
}
