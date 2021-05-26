package ar.edu.unlam.erudito.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
public class TarjetaEnComun extends Tarjeta{
    private Integer categoria=3;
    @ElementCollection
    private List<String> opciones;
    private String respuesta;
    private String palabraClave;

    public List<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<String> opciones) {
        this.opciones = opciones;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getPalabraClave() {
        return palabraClave;
    }

    public void setPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }
}
