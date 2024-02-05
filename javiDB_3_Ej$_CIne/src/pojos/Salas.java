package pojos;

import java.util.HashSet;
import java.util.Set;

public class Salas implements java.io.Serializable {

    private Integer sid;
    private String descr;
    private Set disponibles = new HashSet(0);
    private Set peliculaSalas = new HashSet(0);
    private Set paseSalas = new HashSet(0);

    public Salas() {
    }

    public Salas(String descr) {
        this.descr = descr;
    }

    public Salas(String descr, Set disponibles, Set peliculaSalas, Set paseSalas) {
        this.descr = descr;
        this.disponibles = disponibles;
        this.peliculaSalas = peliculaSalas;
        this.paseSalas = paseSalas;
    }

    public Integer getSid() {
        return this.sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getDescr() {
        return this.descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
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

    public Set getPaseSalas() {
        return this.paseSalas;
    }

    public void setPaseSalas(Set paseSalas) {
        this.paseSalas = paseSalas;
    }

}
