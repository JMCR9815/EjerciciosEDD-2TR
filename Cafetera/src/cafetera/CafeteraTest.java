package cafetera;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CafeteraTest {
    Cafetera cafetera;
    int actual, esperado;

    @BeforeEach
    void beforeEach() {

        short capacidadMaxima = 10;
        cafetera = new Cafetera(capacidadMaxima);
        cafetera.llenarCafetera();
    }


    @Test
    void testLlenarCafetera() {
        actual = cafetera.getCapacidadMaxima();
        esperado = cafetera.getCantidadActual();
        assertEquals(actual, esperado);

    }

    @Test
    void testServirTaza() {
        int taza = 5;
        actual = cafetera.getCantidadActual() - taza;
        esperado = cafetera.servirTaza(taza);
        assertEquals(actual, esperado);

    }

    @Test
    void testVaciarCafetera() {
        actual = 0;
        cafetera.vaciarCafetera();
        esperado = cafetera.getCantidadActual();
        assertEquals(actual, esperado);
    }

    @Test
    void testAgregarCafe() {
        int cantidadAumento = 4;
        actual = cafetera.getCantidadActual() + cantidadAumento;
        cafetera.agregarCafe(cantidadAumento);
        esperado = cafetera.getCantidadActual();
        assertEquals(actual, esperado);
    }

}
