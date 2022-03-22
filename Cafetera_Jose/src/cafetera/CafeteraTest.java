package cafetera;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CafeteraTest {
    final short CAPACIDAD_MAXIMA = 100;
    Cafetera cafetera;
    short relleno;

    @BeforeEach
    void beforeEach() {
        cafetera = new Cafetera(CAPACIDAD_MAXIMA);
        cafetera.llenarCafetera();

    }


    @Test
    void testLlenarCafetera() {
        if (cafetera.getCapacidadMaxima() == 0) {
            fail("capacidad maxima a cero");
        }
        assertEquals(cafetera.getCantidadActual(), cafetera.getCapacidadMaxima());
    }

    @Test
    void testServirTaza() {
        //condiciones iniciales de la prueba
        short taza = 60;
        //ejecutar el SUT
        int tazaUno = cafetera.servirTaza(taza);
        int tazaDos = cafetera.servirTaza(taza);
        //comprobar resultado
        assertEquals(taza, tazaUno);
        assertEquals(cafetera.getCapacidadMaxima() - taza, tazaDos);
    }

    @Test
    void testServirTazaDos() {
        short taza = 160;
        int tazaUno = cafetera.servirTaza(taza);
        assertEquals(cafetera.getCapacidadMaxima(), tazaUno);

    }

    @Test
    void testVaciarCafetera() {
        cafetera.vaciarCafetera();
        assertEquals(0, cafetera.getCantidadActual());
    }

    @Test
    void testAgregarCafe() {
        //primer caso
        int relleno = 110;
        cafetera.agregarCafe(relleno);
        assertEquals(CAPACIDAD_MAXIMA, cafetera.getCantidadActual());
        //segundo caso (cantidad actual+relleno>capacidadMAxima)
        relleno = 60;
        cafetera.agregarCafe(relleno);
        assertEquals(CAPACIDAD_MAXIMA, cafetera.getCantidadActual());

    }

    @Test
    void agregarCafeDos() {
        relleno = 30;
        cafetera.agregarCafe(relleno);
        assertEquals(relleno, cafetera.getCantidadActual());
        cafetera.agregarCafe(relleno);
        relleno += relleno;
        assertEquals(relleno, cafetera.getCantidadActual());

    }
}