package MetodosPrivadosAtravesDePublicos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * metodosPrivadosAtravesDePublicos Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>mar. 9, 2022</pre>
 */
@DisplayName("Metodos Privados Atraves De Publicos Test")
class metodosPrivadosAtravesDePublicosTest {
    metodosPrivadosAtravesDePublicos metodoPrivadoAtravesDePublico;

    @BeforeEach
    void before() {
        /*Propiedades para cada ejecucion.*/
        metodoPrivadoAtravesDePublico = new metodosPrivadosAtravesDePublicos();
    }


    /**
     * Method: addOdds(int valueOne, int valueTwo)
     */
    @Test
    @DisplayName("Test Add Odds")
    void testAddOdds() {
        // TODO: Test Add Odds...
        int valorOne = 1, valorTwo = 1;
        int expected = 2;
        Assertions.assertEquals(expected, metodoPrivadoAtravesDePublico.addOdds(valorOne, valorTwo));
        /*El metodo devolvera el valor esperado en la prueba o -1
         * segun el resultado de llamar al metodo privado
         */
        valorOne = 2;
        expected = -1;
        Assertions.assertEquals(expected, metodoPrivadoAtravesDePublico.addOdds(valorOne, valorTwo));

    }
}
