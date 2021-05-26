package ar.edu.unlam.erudito.repositorios;

import ar.edu.unlam.erudito.modelo.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Repository("juegoRepositorio")
public class JuegoRepositorioImpl implements JuegoRepositorio {
    @Inject
    private SessionFactory sessionFactory;


    @Override
    public Long guardarTarjeta(Tarjeta tarjeta) {
        Session session = obtenerSesion();
        session.save(tarjeta);
        Long idTarjeta = tarjeta.getId();
        return idTarjeta;
    }

    private Session obtenerSesion() {
        Session nueva = sessionFactory.getCurrentSession();
        return nueva;
    }

    @Override
    public List<Tarjeta> obtenerTarjetasSecuencia() {
        Session session = obtenerSesion();
        List<Tarjeta> obtenidas=new ArrayList<>();
        obtenidas = session.createCriteria(TarjetaSecuencia.class).add(Restrictions.eq("categoria", 1)).list();
        return obtenidas;
    }

    @Override
    public List<Tarjeta> obtenerTarjetasAsociacion() {
        Session session = obtenerSesion();
        List<Tarjeta> obtenidas=new ArrayList<>();
        obtenidas = session.createCriteria(TarjetaAsociacion.class).add(Restrictions.eq("categoria", 2)).list();
        return obtenidas;
    }

    @Override
    public List<Tarjeta> obtenerTarjetasEnComun() {
        Session session = obtenerSesion();
        List<Tarjeta> obtenidas=new ArrayList<>();
        obtenidas = session.createCriteria(TarjetaEnComun.class).add(Restrictions.eq("categoria", 3)).list();
        return obtenidas;
    }

    @Override
    public List<Tarjeta> obtenerTarjetasAproximacion() {
        Session session = obtenerSesion();
        List<Tarjeta> obtenidas=new ArrayList<>();
        obtenidas = session.createCriteria(TarjetaAproximacion.class).add(Restrictions.eq("categoria", 4)).list();
        return obtenidas;
    }
}
