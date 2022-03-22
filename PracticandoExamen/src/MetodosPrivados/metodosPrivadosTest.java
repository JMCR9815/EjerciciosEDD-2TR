package MetodosPrivados;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * metodosPrivados Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>mar. 9, 2022</pre>
 */
@DisplayName("Metodos Privados Test")
class metodosPrivadosTest {

    metodosPrivados metodoPrivado;

    @BeforeEach
    void before() {
        /*Parametros para cada ejecucion: */
        metodoPrivado = new metodosPrivados();
    }

    /**
     * Method: tellMe()
     */
    @Test
    @DisplayName("Test Tell Me")
    void testTellMe() {
        // TODO: Test tellMe...
        // assertTrue(metodoPrivado.tellMe());
        /* No se puede acceder a un metodo privado de forma directa, para realizar esta prueba,
         * se debe de hacer mediante un metodo no privado que llame al metodo privado. */
        /*
        try {
           Method method = metodosPrivados.getClass().getMethod("tellMe");
           method.setAccessible(true);
           method.invoke(<Object>, <Parameters>);
        } catch(NoSuchMethodException e) {
        } catch(IllegalAccessException e) {
        } catch(InvocationTargetException e) {
        }
        */
    }
}
