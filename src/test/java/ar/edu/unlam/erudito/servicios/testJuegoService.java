package ar.edu.unlam.erudito.servicios;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.assertj.core.api.Assertions.*;

public class testJuegoService {

    ServicioJuegoImpl servicio=new ServicioJuegoImpl();

    @Test
    public void testQueRecibeUnNumero(){
        Integer numero=servicio.generarCodigo();
        assertThat(numero).isEqualTo(12345);

    }
}
