package mastermind;

import mastermind.dominio.ColorCombinacion;
import mastermind.dominio.ColorResultado;
import mastermind.dominio.Combinacion;

import java.util.Random;

public class MasterMind5 {
    Combinacion enigma;


    /**
     * Sortea el enigma a adivinar
     *
     * @return vector de 4 posiciones con n�meros entre 1 y 5
     * Combinacion de 4 colores con valores de ColorCombinacion
     */
    public void sortearEnigma() {
        Random rnd = new Random(5);
        for (int i = 0; i < enigma.size(); i++) {
            enigma.setCOlorCombinacion(i, ColorCombinacion.values()[rnd.nextInt()]);
        }

    }

    public Combinacion getEnigma() {
        return enigma;
    }

    public void setEnigma(Combinacion secreta) {
        this.enigma = getEnigma();
    }

    /**
     * Pide lo que va en la posicion del vector
     *
     * @return el vector que se va a comprobar con el sorteado
     */
    public Combinacion pedirCombinacion() {


        return null;
        //TODO
    }

    /**
     * Comprueba si el resultado obtenido es una combinacion ganadora
     *
     * @param resultado vector de 4 posiciones que representa el resultado de la combinacion
     * @return verdadero si el resultado esta relleno completamente con 7
     */
    public boolean comprobarGanador(ColorResultado[] resultado) {
        boolean ganador = false;
        for (ColorResultado colorResultado : resultado) {
            ganador = colorResultado == ColorResultado.negro;
        }
        return ganador;
    }

    /**
     * Comprueba si los colores coincidentes estan en la posicion correcta
     *
     * @param combinacion
     * @param resultado
     * @return
     */
    ColorResultado[] comprobarPosicion(Combinacion combinacion, ColorResultado[] resultado) {
        for (int i = 0; i < resultado.length; i++) {
            if (combinacion.getAt(i).equals(getEnigma().getAt(i))) {
                resultado[i] = ColorResultado.negro;
            }
        }
        return resultado;
    }

    /**
     * Comprueba si la ficha que has metido esta en el vector enigma
     *
     * @param combinacion es el vector que el jugador ha metido y quiere comprobar
     * @return el vector resultante que pone 6 si el numero esta en el vector enigma
     */
    ColorResultado[] comprobarColor(Combinacion combinacion) {
        ColorResultado[] resultados = new ColorResultado[4];
        for (int i = 0; i < resultados.length; i++) {
            if (combinacion.equals(getEnigma())) {
                resultados[i] = ColorResultado.blanco;
            }
        }
        return resultados;
    }

    /**
     * Compara la combinacion del jugador con el enigma de la maquina
     *
     * @param combinacion
     * @return vector de resultados donde 6 es color y 7 colr y posicion
     */
    public ColorResultado[] comprobarCombinacion(Combinacion combinacion) {
        ColorResultado[] resultado = new ColorResultado[4];
        ColorResultado[] comprobarColor = comprobarColor(combinacion);
        ColorResultado[] comprobarPosicion = comprobarPosicion(combinacion, comprobarColor);
        for (int i = 0; i < resultado.length; i++) {
            if (combinacion.equals(getEnigma())) {
                resultado[i] = comprobarColor[i];
            } else {
                resultado[i] = comprobarPosicion[i];
            }
        }
        return resultado;
    }

    public void play() {
        String hola;
        // TODO Auto-generated method stub

    }
}
