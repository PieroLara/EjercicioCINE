/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peliculas;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Salas;
import util.hibernate.Cine_Hibernate;

/**
 *
 * @author josepiero.lara
 */
public class Salas_DAO {

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

    public int guardaSalas(Salas d) throws HibernateException {
        int id;
        try {
            iniciaOperacion();
            id = (int) sesion.save(d);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return id;
    }

    public void actualizaSalas(Salas p) throws HibernateException {
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

    public void eliminaSalas(Salas p) throws HibernateException {
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

    public Salas obtenSalas(int idSala) throws HibernateException {
        Salas p = null;
        try {
            iniciaOperacion();
            p = (Salas) sesion.get(Salas.class, idSala);
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return p;
    }

    public List<Salas> obtenListaPeliculasSala(int p) throws HibernateException {
        List<Salas> listaPeliculaSala = null;
        try {
            iniciaOperacion();
            listaPeliculaSala = sesion.createQuery("from Salas where sid=" + p).list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return listaPeliculaSala;
    }
}
