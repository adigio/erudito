package ar.edu.unlam.erudito.persistencia;

import ar.edu.unlam.erudito.SpringTest;
import ar.edu.unlam.erudito.modelo.*;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestPersistenciaTarjetas extends SpringTest {

    @Test
    @Transactional @Rollback
    public void testQueGuardaTarjetaSecuencia(){
        List<String> opciones=new ArrayList<>();
        opciones.add("Adam West");
        opciones.add("Michael Keaton");
        opciones.add("George Clooney");
        opciones.add("Christian Bale");
        opciones.add("Ben Affleck");
        String pregunta="Ordene cronológicamente los intérpretes de Batman";
        Tarjeta nueva=new TarjetaSecuencia();
        nueva.setPregunta(pregunta);
        ((TarjetaSecuencia)nueva).setOpciones(opciones);
        session().save(nueva);
        assertThat(nueva.getId()).isNotNull();
    }

    @Test @Transactional @Rollback
    public void testQueGuardaTarjetaAsociacion(){
        Map<String,String> opciones=new HashMap<>();
        opciones.put("Piara","Chanchos");
        opciones.put("Bandada","Aves");
        opciones.put("Cardumen","Peces");
        opciones.put("Enjambre","Abejas");
        opciones.put("Jauría","Perros");
        String pregunta="Asocie sustantivo colectivo con animal";
        Tarjeta nueva=new TarjetaAsociacion();
        nueva.setPregunta(pregunta);
        ((TarjetaAsociacion)nueva).setOpciones(opciones);
        session().save(nueva);
        assertThat(nueva.getId()).isNotNull();
    }

    @Test @Transactional @Rollback
    public void testQueGuardaTarjetaEnComun(){
        List<String> opciones=new ArrayList<>();
        opciones.add("Sol");
        opciones.add("Clepsidra");
        opciones.add("Cuarzo");
        opciones.add("Cuerda");
        opciones.add("Atómico");
        String pregunta="¿Qué tienen en común?";
        String respuesta="Son tipos de relojes";
        String palabraClave="reloj";
        Tarjeta nueva=new TarjetaEnComun();
        nueva.setPregunta(pregunta);
        ((TarjetaEnComun)nueva).setOpciones(opciones);
        ((TarjetaEnComun)nueva).setRespuesta(respuesta);
        ((TarjetaEnComun)nueva).setPalabraClave(palabraClave);
        session().save(nueva);
        assertThat(nueva.getId()).isNotNull();
    }

    @Test @Transactional @Rollback
    public void testQueGuardaTarjetaAproximacion(){
        String unidad="kg.";
        Double respuesta=6.17D;
        String pregunta="¿Cuánto pesa el trofeo de la Copa Mundial de Fútbol?";
        Tarjeta nueva=new TarjetaAproximacion();
        nueva.setPregunta(pregunta);
        ((TarjetaAproximacion)nueva).setRespuesta(respuesta);
        ((TarjetaAproximacion)nueva).setUnidad(unidad);
        session().save(nueva);
        assertThat(nueva.getId()).isNotNull();
    }
}
