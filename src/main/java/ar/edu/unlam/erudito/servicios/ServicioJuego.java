package ar.edu.unlam.erudito.servicios;

import ar.edu.unlam.erudito.modelo.Tarjeta;

import java.util.List;

public interface ServicioJuego {
    Integer generarRandom(Integer minimo, Integer maximo);

    Tarjeta obtenerTarjeta(Integer categoria);
}
