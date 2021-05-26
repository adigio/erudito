package ar.edu.unlam.erudito.modelo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TarjetaSecuencia extends Tarjeta {
    private Integer categoria=1;
    @ElementCollection
    List<String> opciones=new ArrayList<>();

    public List<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<String> opciones) {
        this.opciones = opciones;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }
}
