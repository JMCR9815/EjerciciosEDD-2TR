package MetodosConRetorno;

import modelo.Coordenada;
import modelo.Rectangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * metodoConRetorno Tester.
 *
 * @author <pre>Jesus Macarro</pre>
 * @version 1.0
 * @since <pre>mar. 9, 2022</pre>
 */
@SuppressWarnings("ALL")
@DisplayName("Metodo Con Retorno Test")
class metodosConretornoTest {

    metodosConRetorno metodoConRetorno;

    @BeforeEach
    void before() {
        // Parametros para cada ejecucion....
        metodoConRetorno = new metodosConRetorno();
    }

    /**
     * Method: generadorDeRectangulos(Coordenada leftUp, Coordenada rightDown)
     */
    @Test
    @DisplayName("Test Generador De Rectangulos")
    void testGeneradorDeRectangulos() {
        // TODO: Prueba para el metodo "Generador de Rectangulos"
        // Creando el Objeto de pruebas...
        Rectangulo newRectangulo = new Rectangulo(new Coordenada(0, 0), new Coordenada(1, 1));
        // El metodo debe retornar un objeto "Rectangulo";
        System.out.println("Rectangulo Esperado: " + newRectangulo.toString());
        System.out.println("Rectangulo Resultado: " + metodoConRetorno.generadorDeRectangulos(new Coordenada(0, 0), new Coordenada(1, 1)).toString());
        assertEquals(newRectangulo instanceof Rectangulo, metodoConRetorno.generadorDeRectangulos(new Coordenada(0, 0), new Coordenada(1, 1)) instanceof Rectangulo);
    }

    /**
     * Method: geveMe()
     */
    @Test
    @DisplayName("Test Geve Me")
    void testGeveMe() {
        // TODO: Prueba para el metodo "Geve Me"
        // El metodo retorna un valor true por lo tanto la prueba tienme que retornar true...
        assertTrue(metodoConRetorno.geveMe());
    }
}
