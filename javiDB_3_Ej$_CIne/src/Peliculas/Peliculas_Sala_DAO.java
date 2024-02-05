package Peliculas;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.hibernate.Cine_Hibernate;
import pojos.PeliculaSala;

public class Peliculas_Sala_DAO {

    private Session sesion;
    private Transaction tx;

    private void iniciaOperacion() throws HibernateException {
        sesion = Cine_Hibernate.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Error en la capa de acceso a datos", he);
    }

    public int guardaPeliculaSala(PeliculaSala p) throws HibernateException {
        int id;
        try {
            iniciaOperacion();
            id = (int) sesion.save(p);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return id;
    }

    public void actualizaPeliculaSala(PeliculaSala p) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.update(p);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public void eliminaPeliculaSala(PeliculaSala p) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.delete(p);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public PeliculaSala obtenPelicula(int idPeliculaSala) throws HibernateException {
        PeliculaSala p = null;
        try {
            iniciaOperacion();
            p = (PeliculaSala) sesion.get(PeliculaSala.class, idPeliculaSala);
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return p;
    }

    public List<PeliculaSala> obtenListaPeliculasSala() throws HibernateException {
        List<PeliculaSala> listaPeliculaSala = null;
        try {
            iniciaOperacion();
            listaPeliculaSala = sesion.createQuery("from PeliculaSala ").list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return listaPeliculaSala;
    }

    public List<PeliculaSala> obtenListaPeliculasSala(int p) throws HibernateException {
        List<PeliculaSala> listaPeliculaSala = null;
        try {
            iniciaOperacion();
            listaPeliculaSala = sesion.createQuery("from PeliculaSala where pid=" + p).list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return listaPeliculaSala;
    }

}
