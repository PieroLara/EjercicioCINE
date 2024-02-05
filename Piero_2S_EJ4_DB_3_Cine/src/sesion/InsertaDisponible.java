package sesion;

import pojos.ButacaLetra;
import pojos.Disponible;
import pojos.Peliculas;
import pojos.Pases;
import pojos.Salas;
import Peliculas.Pases_DAO;
import Peliculas.Salas_DAO;
import Peliculas.Peliculas_DAO;
import Peliculas.Pase_Sala_DAO;
import Peliculas.Peliculas_Sala_DAO;
import pojos.PaseSala;
import pojos.PeliculaSala;

public class InsertaDisponible {

    public static void creaDisponiblesEspecifico() {

        Peliculas peli;
        Pases pase;
        Salas sala;
        double porcentaje = 1;
        for (int i = 1; i < 4; i++) {
            if (i == 1) {
                for (int j = 2; j < 4; j++) {
                    pase = new Pases_DAO().obtenPases(j);
                    if (j == 3) {
                        peli = new Peliculas_DAO().obtenPelicula(15);
                    } else {
                        peli = new Peliculas_DAO().obtenPelicula(j);
                    }
                    sala = new Salas_DAO().obtenSalas(i);
                    creaNuevaSesion(pase, peli, sala);
                    System.out.println(calculaPorcentajes(porcentaje, 8) + "%");
                    porcentaje++;
                }
            }
            if (i == 2) {
                for (int j = 1; j < 4; j++) {
                    pase = new Pases_DAO().obtenPases(j);
                    sala = new Salas_DAO().obtenSalas(i);

                    if (j == 3) {
                        peli = new Peliculas_DAO().obtenPelicula(1);
                    } else {
                        peli = new Peliculas_DAO().obtenPelicula(15);
                    }
                    creaNuevaSesion(pase, peli, sala);
                    System.out.println(calculaPorcentajes(porcentaje, 8) + "%");
                    porcentaje++;
                }
            }
            if (i == 3) {
                for (int j = 1; j < 4; j++) {
                    pase = new Pases_DAO().obtenPases(j);
                    sala = new Salas_DAO().obtenSalas(i);
                    if (j == 2) {
                        peli = new Peliculas_DAO().obtenPelicula(1);
                    } else {
                        peli = new Peliculas_DAO().obtenPelicula(2);
                    }
                    creaNuevaSesion(pase, peli, sala);
                    System.out.println(calculaPorcentajes(porcentaje, 8) + "%");
                    porcentaje++;
                }
            }

        }
    }

    public static double calculaPorcentajes(double porciento, double maximo) {

        return ((porciento / maximo * 100));
    }

    public static void creaNuevaSesion(Pases pases, Peliculas pelicula, Salas sala) {
        int i, j;
        int h = 0;
        ButacaLetra butaca = null;
        new Pase_Sala_DAO().guardaPaseSala(new PaseSala(pases, sala));
        new Peliculas_Sala_DAO().guardaPeliculaSala(new PeliculaSala(pelicula, sala, 1));
        for (i = 1; i <= 10; i++) {
            if (i == 10) {
                for (j = 0; j <= UtilDispopnibles.MAXIMA_LETRAS + 1; j++, h++) {

                    if (j < 14 || (j < 26 && j > 20)) {
                        butaca = new ButacaLetra(h, new StringBuilder().append((char) (j + 65)).toString(), i, new StringBuilder().append((char) (j + 65)).toString() + Integer.toString(i));
                    } else if (j < 21) {
                        butaca = new ButacaLetra(h, new StringBuilder().append((char) (j + 64)).toString(), i, new StringBuilder().append((char) (j + 64)).toString() + Integer.toString(i));

                    } else if (j == 26) {
                        butaca = new ButacaLetra(h, new StringBuilder().append((char) (j + 39)).append((char) (j + 39)).toString(), i, new StringBuilder().append((char) (j + 39)).append((char) (j + 39)).toString() + Integer.toString(i));

                    } else {
                        butaca = new ButacaLetra(h, new StringBuilder().append((char) (j + 38)).append((char) (j + 39)).toString(), i, new StringBuilder().append((char) (j + 38)).append((char) (j + 39)).toString() + Integer.toString(i));

                    }
                    new Disponible_DAO().guardaDisponible(new Disponible(pases, pelicula, sala, butaca.getFila(), butaca.getLetra(), butaca.getButaca(), random_Int(), butaca.getPos()));
                    System.out.println("Lenando Sala " + calculaPorcentajes(h + 1, UtilDispopnibles.MAXIMO_BUTACAS) + "%");
                }
            } else {
                for (j = 0; j < UtilDispopnibles.MAXIMA_LETRAS; j++, h++) {
                    if (j < 8) {
                        butaca = new ButacaLetra(h, new StringBuilder().append((char) (j + 65)).toString(), i, "" + (char) (j + 65) + Integer.toString(i));
                    } else if (j > 22 || j == 16 || j == 15) {
                        butaca = new ButacaLetra(h, new StringBuilder().append((char) (j + 63)).toString(), i, new StringBuilder().append((char) (j + 63)).toString() + Integer.toString(i));
                    } else if (j == 17 || j == 8) {
                        butaca = new ButacaLetra(h, new StringBuilder().append((char) (80)).append((char) (80)).toString(), i, new StringBuilder().append((char) (80)).append(" ").toString() + Integer.toString(i));
                    } else if (j > 17) {
                        butaca = new ButacaLetra(h, new StringBuilder().append((char) (j + 62)).toString(), i, new StringBuilder().append((char) (j + 62)).toString() + Integer.toString(i));
                    } else if (j > 8) {
                        butaca = new ButacaLetra(h, new StringBuilder().append((char) (j + 64)).toString(), i, new StringBuilder().append((char) (j + 64)).toString() + Integer.toString(i));
                    }
                    new Disponible_DAO().guardaDisponible(new Disponible(pases, pelicula, sala, butaca.getFila(), butaca.getLetra(), butaca.getButaca(), random_Int(), butaca.getPos()));
                    System.out.println("Lenando Sala" + calculaPorcentajes(h + 1, UtilDispopnibles.MAXIMO_BUTACAS) + "%");
                }
            }

        }
    }

    private static int random_Int() {
        return (int) Math.floor(Math.random() * (1 - 0 + 1));
    }

}
