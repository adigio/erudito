package ar.edu.unlam.erudito.modelo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TarjetaSecuencia extends Tarjeta {
    @ElementCollection
    List<String> opciones=new ArrayList<>();

    public List<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<String> opciones) {
        this.opciones = opciones;
    }
}
