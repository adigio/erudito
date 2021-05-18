package ar.edu.unlam.erudito.servicios;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ServicioJuegoImpl implements ServicioJuego {

    @Override
    public Integer generarCodigo() {
        Integer minimo=1;
        Integer maximo=10;
        Integer codigo=(int)(Math.random()*(maximo-minimo)+minimo);
        return codigo;
    }
}
