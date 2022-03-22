package Tests;

import Clases.Casillas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class OcaTest {

	Casillas Tablero[];

	@BeforeEach
	void before() {
		Tablero = new Casillas[63];
		for (int i = 0; i < Tablero.length; i++) {
			Tablero[i] = Casillas.Blanco;
		}
	}

	@Test
	void testColocarPozo() {
		Metodos.colocarFichas.ColocarPozo(Tablero);
		int pozo = 31;
		comprobarPosicion(Casillas.Pozo, pozo);
	}

	@Test
	void testPuente() {
		Metodos.colocarFichas.colocarPuente(Tablero);

	}

	@Test
	void testPosada() {
		Metodos.colocarFichas.ColocarPosada(Tablero);
		int posada = 19;
		comprobarPosicion(Casillas.Posada, posada);
	}

	@Test
	void testColocarOca() {
		Metodos.colocarFichas.colocarOca(Tablero);
		int Oca = 9;
		comprobarPosicion(Casillas.Oca, Oca);
	}

	@Test
	void comprobarOca() {
		int[] fichas = { 1, 9 };
		boolean excepted[] = { false, false };
		for (int i = 0; i < excepted.length; i++) {
			assertEquals(excepted[i], Metodos.ComprobarOca.comprobarOca(Tablero, fichas, i));

		}
	}

	@Test
	void avanzarOca() {

	}

	public void comprobarPosicion(Casillas tipo, int posicion) {
		for (int i = 0; i < Tablero.length; i++) {
			if (i != posicion) {
				assertNotEquals(tipo, Tablero[i]);
			} else {
				assertEquals(tipo, Tablero[i]);
			}
		}
	}
}
