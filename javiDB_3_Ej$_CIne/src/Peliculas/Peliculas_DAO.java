package Peliculas;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.hibernate.Cine_Hibernate;
import pojos.Peliculas;
import java.util.List;

public class Peliculas_DAO {

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

    public int guardaPeliculas(Peliculas p) throws HibernateException {
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

    public void actualizaPelicula(Peliculas p) throws HibernateException {
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

    public void eliminaPeliculas(Peliculas p) throws HibernateException {
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

    public Peliculas obtenPelicula(int idPelicula) throws HibernateException {
        Peliculas p = null;
        try {
            iniciaOperacion();
            p = (Peliculas) sesion.get(Peliculas.class, idPelicula);
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return p;
    }

    public int obtenPeliculaTitulo(String titulo) throws HibernateException {
        int p = 0;
        try {
            iniciaOperacion();
            p = (int) sesion.createQuery("SELECT pid FROM Peliculas WHERE titulo LIKE '%" + titulo + "%'").uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return p;
    }

    public List<Peliculas> obtenListaPeliculas() throws HibernateException {
        List<Peliculas> listaPeliculas = null;
        try {
            iniciaOperacion();
            listaPeliculas = sesion.createQuery("from Peliculas").list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return listaPeliculas;
    }

    public List<Peliculas> obtenListaPeliculas(Peliculas p) throws HibernateException {
        List<Peliculas> listaPeliculas = null;
        try {
            iniciaOperacion();
            listaPeliculas = sesion.createQuery("from Peliculas where pid=" + p.getPid()).list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return listaPeliculas;
    }

    public long obtenListaPeliculasTamanyo() throws HibernateException {
        long tamanyoListaPeliculas = 0;
        try {
            iniciaOperacion();
            tamanyoListaPeliculas = (long) sesion.createQuery(" Select COUNT(*) from Peliculas").uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return tamanyoListaPeliculas;
    }

    public List<Peliculas> obtenListaPeliculas(String p) throws HibernateException {
        List<Peliculas> listaPeliculas = null;
        try {
            iniciaOperacion();
            listaPeliculas = sesion.createQuery("from Peliculas where pid=" + p).list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return listaPeliculas;
    }

    public List<Peliculas> obtenListaPeliculasActores(String p) throws HibernateException {
        List<Peliculas> listaPeliculas = null;
        try {
            iniciaOperacion();
            listaPeliculas = sesion.createQuery("FROM Peliculas WHERE actores LIKE '%" + p + "%'").list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        if (listaPeliculas == null) {
            System.out.println("No se encontró nada");
        }
        return listaPeliculas;
    }
}
