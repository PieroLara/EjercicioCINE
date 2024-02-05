package vista.preguntas;

import java.util.Scanner;

public class PreguntasUsuario {

    Scanner teclado = new Scanner(System.in);

    public String preguntaCadena(String pregunta) {
        String cadena = "";
        boolean correcto = false;
        do {
            System.out.println("Por favor introduzca " + pregunta);
            try {
                correcto = false;
                cadena = teclado.nextLine();
            } catch (Exception e) {
                System.err.println("No ha introducido un valor aceptable :c");
                correcto = true;
            }
        } while ((correcto));
        return cadena;
    }

    public int preguntaNumeros(int minimo, int maximo) {
        int numero = -1;
        boolean correcto = false;
        do {
            System.out.println("Por favor introduzca un valor numérico");
            try {
                correcto = false;
                numero = teclado.nextInt();
                // Esta función se puede hacer como una excepción interna catch.
                if (numero < 0) {
                    correcto = true;
                    System.err.println(" Valores negativos no aceptables");
                }
            } catch (Exception e) {
                System.err.println("No ha introducido un valor aceptable :c");
                correcto = true;
                teclado.nextLine();
            }
        } while ((correcto) || ((numero < minimo) || (numero > maximo)));
        teclado.nextLine();
        return numero;
    }

    public int preguntaNumerosConPregunta(String pregunta, int minimo, int maximo) {
        int numero = -1;
        boolean correcto = false;
        System.out.println(pregunta);
        do {
            try {
                correcto = false;
                numero = teclado.nextInt();
                // Esta función se puede hacer como una excepción interna catch.
                if (numero < 0) {
                    correcto = true;
                    System.err.println(" Valores negativos no aceptables");
                }
            } catch (Exception e) {
                System.err.println("No ha introducido un valor aceptable :c");
                correcto = true;
                teclado.nextLine();
            }
        } while ((correcto) || ((numero < minimo) || (numero > maximo)));
        teclado.nextLine();
        return numero;
    }

    public double preguntaNumerosDouble(double minimo, double maximo) {
        double numero = -1;
        boolean correcto = false;
        do {
            System.out.println("Por favor introduzca un valor numérico");
            try {
                correcto = false;
                numero = teclado.nextDouble();
                // Esta función se puede hacer como una excepción interna catch.
                if (numero < 0) {
                    correcto = true;
                    System.err.println(" Valores negativos no aceptables");
                }
            } catch (Exception e) {
                System.err.println("No ha introducido un valor aceptable :c");
                correcto = true;
                teclado.nextLine();
            }
        } while ((correcto) || ((numero < minimo) || (numero > maximo)));
        teclado.nextLine();
        return numero;
    }

    public double preguntaNumerosDoubleconPregunta(String pregunta, double minimo, double maximo) {
        double numero = -1;
        boolean correcto = false;
        System.out.println(pregunta);
        do {
            System.out.println("Por favor introduzca un valor numérico");
            try {
                correcto = false;
                numero = teclado.nextDouble();
                // Esta función se puede hacer como una excepción interna catch.
                if (numero < 0) {
                    correcto = true;
                    System.err.println(" Valores negativos no aceptables");
                }
            } catch (Exception e) {
                System.err.println("No ha introducido un valor aceptable :c");
                correcto = true;
                teclado.nextLine();
            }
        } while ((correcto) || ((numero < minimo) || (numero > maximo)));
        teclado.nextLine();
        return numero;
    }

}
