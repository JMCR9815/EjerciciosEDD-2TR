package mastermind;

import mastermind.dominio.ColorCombinacion;
import mastermind.dominio.ColorResultado;
import mastermind.dominio.Combinacion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MasterMind5Test {
    final int SIZE = 4;
    final int EXPECTED = 4;
    MasterMind5 masterMind5;

    @BeforeEach
    void beforeEach() {
        masterMind5 = new MasterMind5();

    }

    @Test
    void testSortearEnigma() {
        //comndicion inicial
        boolean contains = Arrays.asList(ColorCombinacion.values()).contains("verde");

        masterMind5.sortearEnigma();
        //primera prueba longitud correcta
        assertEquals(EXPECTED, masterMind5.getEnigma().size());
        for (int i = 0; i < EXPECTED; i++) {
            boolean containsTeo = Arrays.asList(ColorCombinacion.values()).contains(masterMind5.getEnigma().getAt(i));
            assertTrue(ColorCombinacion.isValid(masterMind5.getEnigma().getAt(i)));
        }
    }

    @Test
    void pedirCombinacion() {

        Combinacion actualCOmbinacion = masterMind5.pedirCombinacion();
        assertEquals(EXPECTED, actualCOmbinacion.size());
        for (int i = 0; i < EXPECTED; i++) {
            assertTrue(ColorCombinacion.isValid(actualCOmbinacion.getAt(i)));
        }
    }

    @Test
    void comprobarGanador() {
        ColorResultado[] colorResultado = {ColorResultado.negro, ColorResultado.negro, ColorResultado.negro, ColorResultado.negro};
        for (ColorResultado resultado : colorResultado) {
            if (resultado == ColorResultado.negro) {
                assertTrue(masterMind5.comprobarGanador(colorResultado));
            }
        }
    }

    @Test
    void comprobarPosicion() {
        Combinacion secreta = new Combinacion(SIZE);
        ColorCombinacion[] combinacionCOores = {ColorCombinacion.amarillo, ColorCombinacion.verde, ColorCombinacion.rojo, ColorCombinacion.rosa};
        Combinacion usuario = new Combinacion(SIZE);
        for (int i = 0; i < combinacionCOores.length; i++) {
            usuario.setCOlorCombinacion(i, combinacionCOores[i]);
        }
        masterMind5.setEnigma(secreta);
        ColorResultado[] colorResultado = {ColorResultado.negro, ColorResultado.negro, ColorResultado.negro, ColorResultado.negro};
        ColorResultado[] comprobarPosicion = masterMind5.comprobarPosicion(usuario, colorResultado);
        assertEquals(colorResultado, comprobarPosicion);
    }

    @Test
    void comprobarColor() {
        Combinacion secreta = new Combinacion(SIZE);
        ColorCombinacion[] combinacionCOores = {ColorCombinacion.amarillo, ColorCombinacion.verde, ColorCombinacion.rojo, ColorCombinacion.rosa};
        Combinacion usuario = new Combinacion(SIZE);
        for (int i = 0; i < combinacionCOores.length; i++) {
            usuario.setCOlorCombinacion(i, combinacionCOores[i]);
        }

        masterMind5.setEnigma(secreta);
        ColorResultado[] colorResultado = {ColorResultado.blanco, ColorResultado.blanco, ColorResultado.blanco, ColorResultado.blanco};
        ColorResultado[] comprobarCoor = masterMind5.comprobarColor(usuario);
        assertArrayEquals(colorResultado, comprobarCoor);
    }

    @Test
    void comprobarCombinacion() {
        ColorCombinacion[] combinacionCOores = {ColorCombinacion.amarillo, ColorCombinacion.verde, ColorCombinacion.rojo, ColorCombinacion.rosa};
        Combinacion usuario = new Combinacion(SIZE);
        for (int i = 0; i < combinacionCOores.length; i++) {
            usuario.setCOlorCombinacion(i, combinacionCOores[i]);
        }
        ColorResultado[] resultadoCombinacion = {ColorResultado.negro, ColorResultado.negro, ColorResultado.negro, ColorResultado.negro};
        ColorResultado[] comprobarCombinacion = masterMind5.comprobarCombinacion(usuario);
        assertEquals(resultadoCombinacion, comprobarCombinacion);
    }

    @Test
    void play() {
    }
}
