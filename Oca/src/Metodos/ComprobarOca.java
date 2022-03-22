package Metodos;

import Clases.Casillas;

public class ComprobarOca {
	public static boolean comprobarOca(Casillas[] tablero, int[] fichas, int turno) {

		return tablero[fichas[turno]] == Casillas.Oca;

	}
}
