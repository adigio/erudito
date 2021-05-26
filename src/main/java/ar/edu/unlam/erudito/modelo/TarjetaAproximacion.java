package ar.edu.unlam.erudito.modelo;

import javax.persistence.*;

@Entity
public class TarjetaAproximacion extends Tarjeta{
    private Integer categoria=4;
    private Double respuesta;
    private String unidad;

    public Double getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Double respuesta) {
        this.respuesta = respuesta;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }
}
