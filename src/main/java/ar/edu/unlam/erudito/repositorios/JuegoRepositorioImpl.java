package ar.edu.unlam.erudito.repositorios;

import ar.edu.unlam.erudito.modelo.*;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
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
    public List<Tarjeta> obtenerTarjetas(Integer categoria) {
        Session session = obtenerSesion();
        List<Tarjeta> obtenida=new ArrayList<>();
        switch (categoria) {
            case 1:
                obtenida = session.createCriteria(TarjetaSecuencia.class).add(Restrictions.eq("categoria", categoria)).list();
                break;
            case 2:
                obtenida = session.createCriteria(TarjetaAsociacion.class).add(Restrictions.eq("categoria", categoria)).list();
                break;
            case 3:
                obtenida = session.createCriteria(TarjetaEnComun.class).add(Restrictions.eq("categoria", categoria)).list();
                break;
            case 4:
                obtenida = session.createCriteria(TarjetaAproximacion.class).add(Restrictions.eq("categoria", categoria)).list();
                break;
        }
        return obtenida;
    }
}
