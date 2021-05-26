package ar.edu.unlam.erudito.repositorios;

import ar.edu.unlam.erudito.SpringTest;
import ar.edu.unlam.erudito.modelo.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

@ContextConfiguration(locations = {"/applicationContext.xml"})
public class TestJuegoRepo extends SpringTest {
    @Autowired
    private JuegoRepositorio repo;

    @Test @Transactional @Rollback
    public void testQueGuardaUnaTarjeta(){
        Tarjeta nueva= crearTarjetaSecuencia();
        Long resultado=guardarTarjeta(nueva);
        assertThat(resultado).isNotNull();
    }

    private Long guardarTarjeta(Tarjeta nueva) {
        repo.guardarTarjeta(nueva);
        return nueva.getId();
    }

    @Test @Transactional @Rollback
    public void testQueObtieneUnaTarjetaSecuencia(){
        Tarjeta nueva= crearTarjetaSecuencia();
        guardarTarjeta(nueva);
        Integer categoria=1;
        List<Tarjeta> obtenida=repo.obtenerTarjetas(categoria);
        assertThat(obtenida.get(0).getPregunta()).isEqualTo(nueva.getPregunta());
    }

    @Test @Transactional @Rollback
    public void testQueObtieneUnaTarjetaAsociacion(){
        Tarjeta nueva= crearTarjetaAsociacion();
        guardarTarjeta(nueva);
        Integer categoria=2;
        List<Tarjeta> obtenida=repo.obtenerTarjetas(categoria);
        assertThat(obtenida.get(0).getPregunta()).isEqualTo(nueva.getPregunta());
    }

    @Test @Transactional @Rollback
    public void testQueObtieneUnaTarjetaEnComun(){
        Tarjeta nueva= crearTarjetaEnComun();
        guardarTarjeta(nueva);
        Integer categoria=3;
        List<Tarjeta> obtenida=repo.obtenerTarjetas(categoria);
        assertThat(obtenida.get(0).getPregunta()).isEqualTo(nueva.getPregunta());
    }

    @Test @Transactional @Rollback
    public void testQueObtieneUnaTarjetaAproximacion(){
        Tarjeta nueva= crearTarjetaAproximacion();
        guardarTarjeta(nueva);
        Integer categoria=4;
        List<Tarjeta> obtenida=repo.obtenerTarjetas(categoria);
        assertThat(obtenida.get(0).getPregunta()).isEqualTo(nueva.getPregunta());
    }

    private Tarjeta crearTarjetaAproximacion() {
        String unidad="kg.";
        Double respuesta=6.17D;
        String pregunta="¿Cuánto pesa el trofeo de la Copa Mundial de Fútbol?";
        Tarjeta nueva=new TarjetaAproximacion();
        nueva.setPregunta(pregunta);
        ((TarjetaAproximacion)nueva).setRespuesta(respuesta);
        ((TarjetaAproximacion)nueva).setUnidad(unidad);
        return nueva;
    }

    private Tarjeta crearTarjetaEnComun() {
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
        return nueva;
    }

    private Tarjeta crearTarjetaSecuencia() {
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
        return nueva;
    }

    private Tarjeta crearTarjetaAsociacion() {
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
        return nueva;
    }


}
