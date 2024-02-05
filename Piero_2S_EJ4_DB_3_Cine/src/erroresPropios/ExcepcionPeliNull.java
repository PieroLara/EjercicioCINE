package erroresPropios;

import pojos.Peliculas;

public class ExcepcionPeliNull extends Exception {

    public ExcepcionPeliNull(String mensajeError) {
        super(mensajeError);
    }

    static void peliNull(Peliculas p) throws ExcepcionPeliNull {
        if (p == null) {
            throw new ExcepcionPeliNull("La Película no se encuentra en la base de datos");
        }
    }
}
