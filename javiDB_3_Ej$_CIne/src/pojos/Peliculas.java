package pojos;

import Peliculas.Peliculas_Sala_DAO;
import Peliculas.Salas_DAO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import sesion.Disponible_DAO;

public class Peliculas implements java.io.Serializable {

    private Integer pid;
    private String titulo;
    private String director;
    private String nacionalidad;
    private String genero;
    private String clasificacion;
    private String descr;
    private double duracion;
    private String actores;
    private String linkExterior;
    private String linkImagen;
    private int estado;
    private Set disponibles = new HashSet(0);
    private Set peliculaSalas = new HashSet(0);

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, String nacionalidad, String genero, String clasificacion, String descr, double duracion, String actores, String linkExterior, String linkImagen, int estado) {
        this.titulo = titulo;
        this.director = director;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.descr = descr;
        this.duracion = duracion;
        this.actores = actores;
        this.linkExterior = linkExterior;
        this.linkImagen = linkImagen;
        this.estado = estado;
    }

    public Peliculas(String titulo, String director, String nacionalidad, String genero, String clasificacion, String descr, double duracion, String actores, String linkExterior, String linkImagen, int estado, Set disponibles, Set peliculaSalas) {
        this.titulo = titulo;
        this.director = director;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.descr = descr;
        this.duracion = duracion;
        this.actores = actores;
        this.linkExterior = linkExterior;
        this.linkImagen = linkImagen;
        this.estado = estado;
        this.disponibles = disponibles;
        this.peliculaSalas = peliculaSalas;
    }

    public Integer getPid() {
        return this.pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return this.clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDescr() {
        return this.descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getActores() {
        return this.actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getLinkExterior() {
        return this.linkExterior;
    }

    public void setLinkExterior(String linkExterior) {
        this.linkExterior = linkExterior;
    }

    public String getLinkImagen() {
        return this.linkImagen;
    }

    public void setLinkImagen(String linkImagen) {
        this.linkImagen = linkImagen;
    }

    public int getEstado() {
        return this.estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Set getDisponibles() {
        return this.disponibles;
    }

    public void setDisponibles(Set disponibles) {
        this.disponibles = disponibles;
    }

    public Set getPeliculaSalas() {
        return this.peliculaSalas;
    }

    public void setPeliculaSalas(Set peliculaSalas) {
        this.peliculaSalas = peliculaSalas;
    }

    @Override
    public String toString() {
        return "ID: " + pid + "\t" + titulo + "\n\tDirector: " + director + "\n\tNacionalidad: " + nacionalidad + "\n\tGenero: " + genero + "\n\tClasificacion por edades: " + clasificacion + "\n\tDescripción de la película:\n\t\t" + descr + "\n\tDuración: " + duracion + "\n\tActores: " + muestraTodosActores(listadoActores()) + "\n\tURL: " + linkExterior + "\n\tImagen: " + linkImagen + "\n\tEn cartelera: " + muestraEstado() + "\n\tAsientos Disponibles: " + Integer.toString(listadoButacas().size()) + "\n\tSalas: " + muestraSalas();
    }

    public List<String> listadoActores() {
        List<String> listado = new ArrayList<>();

        for (String cadena : this.actores.split(", ")) {

            listado.add(cadena);
        }
        return listado;
    }

    public String muestraTodosActores(List<String> listado) {
        StringBuilder sb = new StringBuilder();
        for (String s : listado) {
            sb.append("\t\t").append(s).append("\n");
        }

        return sb.toString();
    }

    public String muestraEstado() {
        String estado;
        if (this.estado == 1) {
            estado = "Sí";
        } else {
            estado = "No";
        }
        return estado;

    }

    public List<Disponible> listadoButacas() {

        List<Disponible> listado = new ArrayList<>();
        Disponible_DAO disponible_DAO = new Disponible_DAO();
        for (Object cadena : disponible_DAO.obtenListaPeliculasSala(pid)) {
            Disponible disponible = (Disponible) cadena;
            if (disponible.getEstado() == 1) {
                listado.add(disponible);
            }
        }
        return listado;
    }

    public String pruebaDisponibles() {
        List<String> listado = new ArrayList<>();
        for (String cadena : this.actores.split(",")) {
            listado.add(cadena);
        }
        return "holi";
    }

    public String muestraSalas() {
        StringBuilder sb = new StringBuilder();
        Peliculas_Sala_DAO peliSala_DAO = new Peliculas_Sala_DAO();
        Salas_DAO salas_DAO = new Salas_DAO();
        for (Object s : peliSala_DAO.obtenListaPeliculasSala(pid)) {
            PeliculaSala peliSala = (PeliculaSala) s;
            for (Salas sala : salas_DAO.obtenListaPeliculasSala(peliSala.getId())) {

                sb.append("\t").append(sala.getDescr()).append("\n");
            }

        }

        return sb.toString();
    }
}
