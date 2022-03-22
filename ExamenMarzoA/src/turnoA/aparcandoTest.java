package turnoA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class aparcandoTest {
    aparcando instancia;

    @BeforeEach
    void beforeEach() {
        instancia = new aparcando();
    }

    @Test
    void testTikect01pami() {
        //condiciones iniciales
        assertNull(instancia.getEntrando());
        //prueba del SUT
        instancia.tikect01pami();
        //asercion
        assertNotNull(instancia.getEntrando());
        String[] entrando = instancia.getEntrando();
        int horaMinimaCorrecta = 0;
        int horaMaximaCorrecta = 23;
        int minutoMaximoCorrecto = 59;
        int minutoMinimoCorrecto = 0;
        assertTrue(Integer.valueOf(entrando[0]) >= horaMinimaCorrecta && Integer.valueOf(entrando[0]) <= horaMaximaCorrecta);
        assertTrue(Integer.valueOf(entrando[1]) >= minutoMinimoCorrecto && Integer.valueOf(entrando[1]) <= minutoMinimoCorrecto);

    }

    @Test
    void testMePiro() {
        /* condiciones iniciales */
        String[] horaComienzo = {"0", "0"}, horaSalida = {"0", "1"};
        float tarifa = 1f;
        float expected = 1;
        /* La prueba */
        instancia.setEntrando(horaComienzo);
        instancia.setLadolorosa(tarifa);
        //metodo SUT
        float mePiro = instancia.mePiro(horaSalida);
        //asercion
        assertEquals(expected, mePiro);
    }

}
