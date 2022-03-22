package ahorcado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.annotations.Ignore;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class AhorcadoV3Test {
    AhorcadoV3 ahorcado;
    String palabraSecreta;
    char[] cadenaLetrasAcertadas;

    @BeforeEach
    void beforeEach() {
        ahorcado = new AhorcadoV3();
        palabraSecreta = "palabra";
        cadenaLetrasAcertadas = new char[palabraSecreta.length()];

    }

    @Test
    void testSolicitarPalabraSecreta() {
        Scanner entradaScanner = new Scanner(System.in);
        String actual = ahorcado.solicitarPalabraSecreta();
        String esperado = palabraSecreta;
        assertEquals(actual.toLowerCase(), esperado.toLowerCase());
    }

    @Test
    void testComprobarResolucionPalabra() {

    }

    @Test
    void testAnotarAciertos() {

    }

    @Ignore
    void testPedirLetraUsuario() {
        fail("Not yet implemented");
    }

    @Test
    void testGeneraCadenaAciertos() {
        for (int i = 0; i < cadenaLetrasAcertadas.length; i++) {
            cadenaLetrasAcertadas[i] = '_';
            assertEquals(cadenaLetrasAcertadas[i], '_');
        }
    }

    @Ignore
    void testPlay() {
        fail("Not yet implemented");
    }

}
