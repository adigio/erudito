package ar.edu.unlam.erudito.servicios;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ServicioJuegoImpl implements ServicioJuego {

    @Override
    public Integer generarCodigo() {
        Integer codigo=(int)(Math.random()*(10-1)+1);
        return codigo;
    }
}
