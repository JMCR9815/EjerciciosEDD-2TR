package ClasesConPropiedades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.extension.ExtendWith;

/**
 * clasesConModificadoresDePropiedad Tester.
 *
 * @author <Jesus Macarro Valle>
 * @version 1.0
 * @since <pre>mar. 9, 2022</pre>
 */
@DisplayName("Clases Con Modificadores De Propiedad Test")
class clasesConModificadoresDePropiedadTest {

    clasesConModificadoresDePropiedad metodosModifecadoresPropiedad;

    @BeforeEach
    void before() {
        /*Propiedades para cada ejecucion.*/
        metodosModifecadoresPropiedad = new clasesConModificadoresDePropiedad();
    }

    /**
     * Method: incrementAmmount()
     * El metodo debe modificar la propiedad "ammount"
     * en funcion del incremento que reciba.
     */
    @Test
    @DisplayName("Test Increment Ammount")
    void testIncrementAmmount() {
        // TODO: Test Increment Ammount...
        int incremento = 1;
        int esperado = 1;
        metodosModifecadoresPropiedad.incrementAmmountw(incremento);
        assertEquals(esperado, metodosModifecadoresPropiedad.getAmmount());
    }
}
