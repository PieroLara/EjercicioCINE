package sesion;

import Peliculas.Peliculas_DAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.hibernate.Cine_Hibernate;
import pojos.Disponible;
import pojos.Peliculas;

public class Disponible_DAO {

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

    public int guardaDisponible(Disponible d) throws HibernateException {
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

    public void eliminaDisponible(Disponible p) throws HibernateException {
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

    public void actualizaDisponible(Disponible p) throws HibernateException {
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

    public Disponible obtenDisponible(int idDisponible) throws HibernateException {
        Disponible p = null;
        try {
            iniciaOperacion();
            p = (Disponible) sesion.get(Disponible.class, idDisponible);
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return p;
    }

    public List<Disponible> obtenListaPeliculasSala(int p) throws HibernateException {
        List<Disponible> listaPeliculaSala = null;
        try {
            iniciaOperacion();
            listaPeliculaSala = sesion.createQuery("from Disponible where pid=" + p).list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return listaPeliculaSala;
    }

    public List<Disponible> obtenListaPasesSalasAsientos(int sala, int pase) throws HibernateException {
        List<Disponible> listaPeliculaSala = null;
        try {
            iniciaOperacion();
            listaPeliculaSala = sesion.createQuery("from Disponible where sid=" + sala + " AND tid=" + pase).list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return listaPeliculaSala;
    }

    public int obtenEstadoButaca(String titulo, int salaBuscada, String butacaBuscada) throws HibernateException {
        int estado;
        int pid = new Peliculas_DAO().obtenPeliculaTitulo(titulo);
        try {
            iniciaOperacion();
            estado = (int) sesion.createQuery("Select estado from Disponible where pid=" + pid + " AND sid=" + salaBuscada + " AND butacas LIKE '%" + butacaBuscada + "%'").uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return estado;
    }

    public Peliculas calculaAsientosOcupadosUno() {
        List<Integer> lista = new ArrayList();
        lista = null;
        Peliculas peli = null;
        String consulta = "SELECT d.peliculas.pid "
                + "FROM Disponible d "
                + "WHERE d.estado = 0 "
                + "GROUP BY d.peliculas.pid "
                + "ORDER BY COUNT(d.estado) DESC";

        try {
            iniciaOperacion();
            lista = sesion.createQuery(consulta).list();

        } catch (HibernateException he) {

            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }

        if (lista.isEmpty()) {

            System.out.println("No se ha encontrado nada");
        }

        return new Peliculas_DAO().obtenPelicula(lista.get(0));
    }

    public Peliculas calculaAsientosOcupadosCero() {
        List<Integer> lista = new ArrayList();
        lista = null;
        Peliculas peli = null;
        String consulta = "SELECT d.peliculas.pid "
                + "FROM Disponible d "
                + "WHERE d.estado = 1 "
                + "GROUP BY d.peliculas.pid "
                + "ORDER BY COUNT(d.estado) DESC";

        try {
            iniciaOperacion();
            lista = sesion.createQuery(consulta).list();

        } catch (HibernateException he) {

            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }

        if (lista.isEmpty()) {

            System.out.println("No se ha encontrado nada");
        }

        return new Peliculas_DAO().obtenPelicula(lista.get(0));
    }

    public long muestraAsientosCero(Peliculas p) {
        String consulta = "SELECT COUNT(estado) "
                + "FROM Disponible "
                + "WHERE estado = 1 "
                + "AND  pid=" + p.getPid();
        long cantidad = 0;
        try {
            iniciaOperacion();
            cantidad = (long) sesion.createQuery(consulta).uniqueResult();

        } catch (HibernateException he) {

            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return cantidad;
    }

    /*
    SELECT COUNT(estado) 
                FROM Disponible 
                WHERE estado = 1
                AND  pid=1
     
        SELECT d.pid,count(estado)  FROM disponible d  WHERE d.estado = 0  GROUP BY d.pid ORDER BY COUNT(d.estado) DESC
     */
    public long muestraAsientosUno(Peliculas p) {
        String consulta = "SELECT COUNT(estado) "
                + "FROM Disponible "
                + "WHERE estado = 0 "
                + "AND  pid=" + p.getPid();
        long cantidad = 0;
        try {
            iniciaOperacion();
            cantidad = (long) sesion.createQuery(consulta).uniqueResult();

        } catch (HibernateException he) {

            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return cantidad;
    }
}
