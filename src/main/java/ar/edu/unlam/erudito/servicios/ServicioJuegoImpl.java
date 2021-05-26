package ar.edu.unlam.erudito.servicios;

import ar.edu.unlam.erudito.modelo.Tarjeta;
import ar.edu.unlam.erudito.repositorios.JuegoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioJuegoImpl implements ServicioJuego {

    private JuegoRepositorio repositorio;

    @Autowired
    public ServicioJuegoImpl(JuegoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Integer generarRandom(Integer minimo, Integer maximo) {
        Integer codigo = (int) (Math.random() * (maximo - minimo) + minimo);
        return codigo;
    }

    @Override
    public Tarjeta obtenerTarjeta(Integer categoria) {
        List<Tarjeta> tarjetas = new ArrayList<>();
        switch (categoria) {
            case 1:
                tarjetas = repositorio.obtenerTarjetasSecuencia();
                break;
            case 2:
                tarjetas = repositorio.obtenerTarjetasAsociacion();
                break;
            case 3:
                tarjetas = repositorio.obtenerTarjetasEnComun();
                break;
            case 4:
                tarjetas = repositorio.obtenerTarjetasAproximacion();
                break;
        }
        Integer maximo=tarjetas.toArray().length;
        Integer minimo=1;
        Integer random=generarRandom(minimo,maximo);
        Tarjeta obtenida=tarjetas.get(random);
        return obtenida;
    }
}
