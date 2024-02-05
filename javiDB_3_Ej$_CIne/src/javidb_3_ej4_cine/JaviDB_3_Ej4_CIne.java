package javidb_3_ej4_cine;

import Peliculas.Pase_Sala_DAO;
import Peliculas.Pases_DAO;
import vista.preguntas.PreguntasUsuario;
import pojos.Peliculas;
import Peliculas.Peliculas_DAO;
import java.util.ArrayList;
import java.util.List;
import pojos.Disponible;
import pojos.PaseSala;
import sesion.Disponible_DAO;
import sesion.InsertaDisponible;

public class JaviDB_3_Ej4_CIne {

    public static void main(String[] args) {

        int opcion = -1;
        PreguntasUsuario pregunton = new PreguntasUsuario();
        Peliculas_DAO peliculas_DAO = new Peliculas_DAO();

        do {
            System.out.println("Bienvenido al menu Principal");
            System.out.println("\t1. Mostrar una película.");
            System.out.println("\t2. Insertar una película.");
            System.out.println("\t3. Modificar una película.");
            System.out.println("\t4. MOstrar todos.");
            System.out.println("\t5. Mostrar el total de películas guardads en la base de Datos.");
            System.out.println("\t6. Mostrar el nombre de la película (pidiendo el pid) y los actores que han participado.");
            System.out.println("\t7. Mostrar el nombre de las películas donde ha trabajado un actor pedido por teclado.");
            System.out.println("\t8. Cargar la tabla \"disponibles\" siguiendo el mismo criterio.");
            System.out.println("\t9. Comprobar si hay un asiento libre (estado 0) para el nombre de una película, el número de una sala y butaca leídos por teclado.");
            System.out.println("\t10. Mostrar la disposición de una sala y un pase leídos por teclado.");
            System.out.println("\t11. Mostrar la película que más espectadores tiene.");
            System.out.println("\t0. Salir");
            opcion = pregunton.preguntaNumeros(0, 11);
            switch (opcion) {
                case 1:
                    Peliculas p = obtenPelícula();
                    System.out.println(obtenPelícula());
                    break;
                case 2:
                    Peliculas pelicula = new Peliculas(pregunton.preguntaCadena("el nombre de la película."), pregunton.preguntaCadena("el nombre del director."), pregunton.preguntaCadena("cuál es la nacionalidad de la película."), pregunton.preguntaCadena(" qué genero pertenece la película."), pregunton.preguntaCadena("cual es su calificación por edades?"), pregunton.preguntaCadena("una descripción de la película"), pregunton.preguntaNumerosDoubleconPregunta("¿Cuánto dura en minutos la película?", 10.0, 300.0), pregunton.preguntaCadena("qué actores aparecen en la película, separados por comas"), pregunton.preguntaCadena("aquí la dirección URL"), "imagenes/" + pregunton.preguntaCadena("aquí el nombre de la imagen de la película, sin formato.") + ".jpg", pregunton.preguntaNumerosConPregunta("¿Está disponible en cartelera?\n\t.1 SI\n\t0. NO", 0, 1));
                    peliculas_DAO.guardaPeliculas(pelicula);
                    break;
                case 3:
                    peliculas_DAO.actualizaPelicula(obtenPelícula());
                    break;
                case 4:
                    for (Peliculas peli : peliculas_DAO.obtenListaPeliculas()) {
                        System.out.println(peli);
                    }
                    break;
                case 5:
                    System.out.println("Utilizando Array.size");
                    System.out.println(peliculas_DAO.obtenListaPeliculas().size());
                    System.out.println("Utilizando HQL");
                    System.out.println(peliculas_DAO.obtenListaPeliculasTamanyo());

                    break;
                case 6:
                    Peliculas pe = obtenPelícula();
                    System.out.println("TItulo:\t" + pe.getTitulo() + "\nActores:\n" + pe.muestraTodosActores(pe.listadoActores()));
                    break;
                case 7:
                    for (Peliculas peli : peliculas_DAO.obtenListaPeliculasActores(pregunton.preguntaCadena("Introduzca el nombre del actor"))) {
                        System.out.println(peli);
                    }

                    break;
                case 8:
                    System.out.println("Este proceso es largo, puede tomar unos minutos.\n\tEspere hasta que la creación haya acabado");
                    InsertaDisponible.creaDisponiblesEspecifico();
                    System.out.println("Completado");
                    break;
                case 9:
                    String titulo = pregunton.preguntaCadena("el nombre de la película");
                    int salaBuscado = pregunton.preguntaNumerosConPregunta("Introduzca la Sala: ", 1, 3);
                    String nombreButaca = pregunton.preguntaCadena("Introduzca el nombre del asiento en formato: 1A... 10Z,10AA,10AB");
                    if (new Disponible_DAO().obtenEstadoButaca(titulo, salaBuscado, nombreButaca) == 0) {
                        System.out.println("Butaca Disponibles");
                    } else {
                        System.out.println("Butaca NO Disponible");
                    }
                    break;
                case 10:
                    int salaMuestra = pregunton.preguntaNumerosConPregunta("Introduzca el número de sala que desea consultar", 1, 3);
                    List<PaseSala> listaPasesSala = new Pase_Sala_DAO().obtenListaPaseSalaDada(salaMuestra);
                    ArrayList<Integer> listaPases = new ArrayList<>();
                    int salaPaseMuestra = 0;
                    do {
                        for (PaseSala paseSala : listaPasesSala) {
                            listaPases.add(paseSala.getPases().getTid());

                            System.out.println(paseSala.getPases().getTid() + ". " + new Pases_DAO().obtenPases(paseSala.getPases().getTid()).getHora());
                        }
                        salaPaseMuestra = pregunton.preguntaNumerosConPregunta("Indique al pase al que quiere asistir", 1, 8);
                    } while (!listaPases.contains(salaPaseMuestra));
                    for (Disponible butaca : new Disponible_DAO().obtenListaPasesSalasAsientos(salaMuestra, salaPaseMuestra)) {
                        System.out.print(butaca.toString());
                    }
                    System.out.println("");

                    break;
                case 11:
                    Peliculas peli1 = new Disponible_DAO().calculaAsientosOcupadosUno();
                    System.out.println("Si el valor que indica que el asiento está ocupado es 1.\n\tla Película que más asientos ocupados es: " + peli1.toString() + "\n\t\tCon un total de: " + new Disponible_DAO().muestraAsientosUno(peli1));
                    Peliculas peli0 = new Disponible_DAO().calculaAsientosOcupadosCero();
                    System.out.println("Si el valor que indica que el asiento está ocupado es 0.\n\tla Película que más asientos ocupados es: " + peli0.toString() + "\n\t\tCon un total de: " + new Disponible_DAO().muestraAsientosCero(peli0));

                    break;
                case 0:
                    System.out.println("Hasta Luego");
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
        System.exit(opcion);
    }

    public static Peliculas obtenPelícula() {
        Peliculas_DAO peliculas_DAO = new Peliculas_DAO();
        PreguntasUsuario pregunton = new PreguntasUsuario();
        Peliculas p = peliculas_DAO.obtenPelicula(pregunton.preguntaNumerosConPregunta("Diga un id de película", 1, 100));
        if (p == null) {
            System.out.println("Película no encontrada");
        }
        return p;
    }

}
