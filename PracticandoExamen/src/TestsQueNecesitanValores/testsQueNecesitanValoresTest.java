package TestsQueNecesitanValores;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * instance Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>mar. 9, 2022</pre>
 */
@DisplayName("Tests Que Necesitan Valores")
class testsQueNecesitanValoresTest {
    testsQueNecesitanValores instance;
    int size = 4;
    int value = 9;

    @BeforeEach
    void before() throws Exception {
        /*Propiedades para cada ejecucion.*/
        instance = new testsQueNecesitanValores(4);
    }

    /**
     * Method: addValue(int value)
     * El metodo a;adira el valor recibido al array,
     * dependiendo de si el valor de retorno es true o false.
     */
    @Test
    @DisplayName("Test Add Value")
    void testAddValue() {
        // TODO: Test Add Value...
        for (int i = 0; i < size; i++) {
            System.out.println("Iteracion " + i);
            assertTrue(instance.addValue(value));
        }
        assertFalse(instance.addValue(value));
    }

    /**
     * Method: getValue(int index)
     * el metodo retornara el el valor deseado o -1 si no se cumple la condicion.
     */
    @Test
    @DisplayName("Test Get Value")
    void testGetValue() throws Exception {
        // TODO: Test getValue...
        int insert = 2;
        int invalid = -1;
        for (int i = 0; i < insert; i++) {
            assertTrue(instance.addValue(value));
        }
        System.out.println(instance.getValue(insert - 1));
        System.out.println(instance.getValue(insert));
        assertEquals(value, instance.getValue(insert - 1));
        assertEquals(invalid, instance.getValue(insert));
    }
}
