package pojos;
// Generated 25-ene-2024 20:30:11 by Hibernate Tools 4.3.1

/**
 * PeliculaSala generated by hbm2java
 */
public class PeliculaSala implements java.io.Serializable {

    private Integer id;
    private Peliculas peliculas;
    private Salas salas;
    private int estado;

    public PeliculaSala() {
    }

    public PeliculaSala(Peliculas peliculas, Salas salas, int estado) {
        this.peliculas = peliculas;
        this.salas = salas;
        this.estado = estado;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Peliculas getPeliculas() {
        return this.peliculas;
    }

    public void setPeliculas(Peliculas peliculas) {
        this.peliculas = peliculas;
    }

    public Salas getSalas() {
        return this.salas;
    }

    public void setSalas(Salas salas) {
        this.salas = salas;
    }

    public int getEstado() {
        return this.estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}