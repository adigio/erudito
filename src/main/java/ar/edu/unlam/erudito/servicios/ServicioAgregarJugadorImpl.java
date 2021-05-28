package ar.edu.unlam.erudito.servicios;

import ar.edu.unlam.erudito.modelo.Jugador;
import org.springframework.stereotype.Service;

@Service
public class ServicioAgregarJugadorImpl implements ServicioAgregarJugador{

    @Override
    public Boolean agregarJugador(Jugador jugador) {
        return false;
    }
}
