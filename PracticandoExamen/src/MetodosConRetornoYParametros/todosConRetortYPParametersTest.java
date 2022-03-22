package MetodosConRetornoYParametros;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * metodosConRetornoYParametros Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>mar. 9, 2022</pre>
 */
@DisplayName("Metodos Con Retorno Y Parametros Test")
class todosConRetortYPParametersTest {

    metodosConRetornoYParametros metodoConRetornoYParametros;

    @BeforeEach
    void before() {
        // Parametros para cada ejecucion...
        metodoConRetornoYParametros = new metodosConRetornoYParametros();
    }

    /**
     * Method: isOdd(int number)
     */
    @Test
    @DisplayName("Test Is Odd")
    void testIsOdd() {
        // TODO: Test "IsOdd"...
        int valor = 3;
        // El metodo retorna true o false segun si el valor que recibe no es dibisible entre dos
        assertTrue(metodoConRetornoYParametros.isOdd(valor));
    }
}
