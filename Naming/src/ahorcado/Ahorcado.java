package ahorcado;

import java.util.Scanner;

public class Ahorcado {
    public static String pedirPalabraSecreta() {
        Scanner entradaScanner = new Scanner(System.in);
        System.out.print("Introduce la palabra secreta: ");
        String palabraSecreta = entradaScanner.nextLine();
        palabraSecreta = palabraSecreta.toUpperCase();

        return palabraSecreta;
    }

    public static char pedirLetraUsuario() {
        Scanner entradaScanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Introduce una letra: ");
        char letraUsuario = entradaScanner.nextLine().charAt(0);
        letraUsuario = Character.toUpperCase(letraUsuario);
        return letraUsuario;
    }

    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        // Leer la palabra secreta
        // se crea la palabra con los aciertos
        String palabraSecreta = pedirPalabraSecreta();
        boolean fallo = true;
        boolean acierto = false;
        int contadorFallos = 0;
        int limiteFallos = 5;
        int intentosRestantes = 1;
        char[] cadenaLetrasAcertadas = new char[palabraSecreta.length()];

        for (int i = 0; i < cadenaLetrasAcertadas.length; i++) {
            cadenaLetrasAcertadas[i] = '_';
        }
        // el bucle del juego

        do {
            // si la letra est� en la palabra secreta la escribo en la de los aciertos

            acierto = isAcierto(palabraSecreta, acierto, cadenaLetrasAcertadas);

            if (!acierto) {
                System.out.println("ha fallao, intentelo de nuevo ");
                contadorFallos++;

                System.out.println("Intentos restantes: " + (intentosRestantes = (limiteFallos - contadorFallos)));
                System.out.println("");
            } else {
                System.out.println("Seguimos jugando");
                System.out.println("");
            }

            acierto = true;
            // me pregunto si alguna letra de parc esta con '_' significa que no
            // esta todavia acertada la palabra
            for (int i = 0; i < cadenaLetrasAcertadas.length; i++) {
                System.out.print(" " + cadenaLetrasAcertadas[i]);
                if (cadenaLetrasAcertadas[i] == '_') {
                    acierto = false;
                }
            }

            System.out.println("");
            // me pregunto si he alcanzado el numero maximo de fallos

            if (intentosRestantes == 0) {
                System.out.println("");
                System.out.println("No le quedan mas intentos.");
                System.out.println("");
            } else
                if (acierto) {
                    System.out.println("");
                    System.out.println("Ha adivinado la palabra secreta.");
                    System.out.println("");
                    break;
                }

        } while (contadorFallos < limiteFallos && !acierto);

        System.out.println("****Juego terminado****");
    }

    private static boolean isAcierto(String palabraSecreta, boolean acierto, char[] cadenaLetrasAcertadas) {
        boolean fallo;
        for (int i = 0; i < cadenaLetrasAcertadas.length; i++) {
            if (palabraSecreta.charAt(i) == pedirLetraUsuario()) {
                cadenaLetrasAcertadas[i] = pedirLetraUsuario();
                fallo = false;
                acierto = true;
            }
            fallo = true;
        }
        return acierto;
    }
}
