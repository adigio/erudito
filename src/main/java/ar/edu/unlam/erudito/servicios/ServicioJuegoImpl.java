package ar.edu.unlam.erudito.servicios;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ServicioJuegoImpl implements ServicioJuego {

    @Override
    public Integer generarCodigo() {
        return 12345;
    }
}
