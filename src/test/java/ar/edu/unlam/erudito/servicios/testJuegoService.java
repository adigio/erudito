package ar.edu.unlam.erudito.servicios;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.web.servlet.ModelAndView;

import static org.assertj.core.api.Assertions.*;

public class testJuegoService {

    ServicioJuegoImpl servicio=new ServicioJuegoImpl();

    @Test
    public void testQueRecibeUnNumero(){
        ServicioJuego servicioMock= Mockito.mock(ServicioJuego.class);
        Mockito.when(servicioMock.generarCodigo()).thenReturn(12345);
        Integer numero= servicioMock.generarCodigo();
        assertThat(numero).isEqualTo(12345);

    }
}
