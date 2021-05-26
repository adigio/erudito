package ar.edu.unlam.erudito.modelo;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.MapKeyColumn;
import java.util.Map;

@Entity
public class TarjetaAsociacion extends Tarjeta{
    private Integer categoria=2;
    @ElementCollection
    @MapKeyColumn(name = "clave")
    @Column(name="valor")
    private Map<String,String> opciones;

    public Map<String, String> getOpciones() {
        return opciones;
    }

    public void setOpciones(Map<String, String> opciones) {
        this.opciones = opciones;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }
}
