package ar.edu.unlam.erudito.persistencia;

import ar.edu.unlam.erudito.SpringTest;
import ar.edu.unlam.erudito.modelo.Jugador;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

public class TestJuegoPersistencia extends SpringTest {
    @Test
    @Transactional
    @Rollback
    public void testQueGuardarUnJugador(){
        Jugador nuevo=new Jugador();
        nuevo.setNombre("Matias");
        session().save(nuevo);
        assertThat(nuevo.getId()).isNotNull();
    }
}
