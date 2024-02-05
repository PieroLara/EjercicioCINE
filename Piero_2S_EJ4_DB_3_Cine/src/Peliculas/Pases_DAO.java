package Peliculas;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.hibernate.Cine_Hibernate;
import pojos.Pases;

public class Pases_DAO {

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

    public int guardaPases(Pases p) throws HibernateException {
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

    public void actualizaPases(Pases p) throws HibernateException {
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

    public void eliminaPases(Pases p) throws HibernateException {
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

    public Pases obtenPases(int idPases) throws HibernateException {
        Pases p = null;
        try {
            iniciaOperacion();
            p = (Pases) sesion.get(Pases.class, idPases);
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return p;
    }

    public List<Pases> obtenListaPases() throws HibernateException {
        List<Pases> listaPeliculas = null;
        try {
            iniciaOperacion();
            listaPeliculas = sesion.createQuery("from Pases").list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return listaPeliculas;
    }

}
