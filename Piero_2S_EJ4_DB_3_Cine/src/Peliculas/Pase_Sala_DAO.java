package Peliculas;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.hibernate.Cine_Hibernate;
import pojos.PaseSala;

public class Pase_Sala_DAO {

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

    public int guardaPaseSala(PaseSala p) throws HibernateException {
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

    public void actualizaPaseSala(PaseSala p) throws HibernateException {
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

    public void eliminaPaseSala(PaseSala p) throws HibernateException {
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

    public PaseSala obtenPaseSala(int idPasesSala) throws HibernateException {
        PaseSala p = null;
        try {
            iniciaOperacion();
            p = (PaseSala) sesion.get(PaseSala.class, idPasesSala);
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return p;
    }

    public List<PaseSala> obtenListaPaseSala() throws HibernateException {
        List<PaseSala> listaPeliculas = null;
        try {
            iniciaOperacion();
            listaPeliculas = sesion.createQuery("from PaseSala").list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return listaPeliculas;
    }

    public List<PaseSala> obtenListaPaseSalaDada(int sala) throws HibernateException {
        List<PaseSala> listaPeliculas = null;
        try {
            iniciaOperacion();
            listaPeliculas = sesion.createQuery("from PaseSala p where p.salas.sid= " + sala).list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return listaPeliculas;
    }

}
