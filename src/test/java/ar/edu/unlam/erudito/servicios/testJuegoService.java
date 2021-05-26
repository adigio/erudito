package ar.edu.unlam.erudito.servicios;

import ar.edu.unlam.erudito.modelo.Tarjeta;
import ar.edu.unlam.erudito.modelo.TarjetaSecuencia;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.*;

public class testJuegoService {
    @Autowired
    ServicioJuegoImpl servicio;

    @Test
    public void testQueRecibeUnaTarjeta() {
        Integer categoria = 1;
        ServicioJuego mock = instanciaMockito();
        Tarjeta nueva = new TarjetaSecuencia();
        Mockito.when(mock.obtenerTarjeta(categoria)).thenReturn(nueva);
        Tarjeta recibida = mock.obtenerTarjeta(categoria);
        assertThat((((TarjetaSecuencia)recibida).getCategoria())).isEqualTo(categoria);
    }

    @Test
    public void testQueRecibeUnNumero() {
        ServicioJuego servicioMock = instanciaMockito();
        Integer minimo = 100000;
        Integer maximo = 999999;
        Mockito.when(servicioMock.generarRandom(minimo, maximo)).thenReturn(123456);
        Integer numero = servicioMock.generarRandom(minimo, maximo);
        assertThat(numero).isEqualTo(123456);
    }

    private ServicioJuego instanciaMockito() {
        ServicioJuego mock = Mockito.mock(ServicioJuego.class);
        return mock;
    }
}