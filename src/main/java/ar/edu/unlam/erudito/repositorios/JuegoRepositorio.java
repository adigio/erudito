package ar.edu.unlam.erudito.repositorios;

import ar.edu.unlam.erudito.modelo.Jugador;
import ar.edu.unlam.erudito.modelo.Tarjeta;

import java.util.List;

public interface JuegoRepositorio {
    Long guardarTarjeta(Tarjeta tarjeta);

//    List<Tarjeta> obtenerTarjetas(Integer categoria);

    List<Tarjeta> obtenerTarjetasSecuencia();
    List<Tarjeta> obtenerTarjetasAsociacion();
    List<Tarjeta> obtenerTarjetasEnComun();
    List<Tarjeta> obtenerTarjetasAproximacion();
}
