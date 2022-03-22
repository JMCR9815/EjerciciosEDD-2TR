package Metodos;

import Clases.Casillas;

public class colocarFichas {
	/**
	 * Cambia la naturaleza de la casilla 31 (solo la 31) que pasa de blanco a pozo
	 * 
	 * @param Tablero
	 */
	public static void ColocarPozo(Casillas[] Tablero) {
		for (int i = 0; i < Tablero.length; i++) {
			if (i == 31) {
				Tablero[i] = Casillas.Pozo;
//				System.out.println("La casilla 31 se ha cambiado a Pozo");
//				System.out.println(Tablero[i]);
			}
		}

	}

	public static void ColocarPosada(Casillas[] Tablero) {
		for (int i = 0; i < Tablero.length; i++) {
			if (i == 19) {
				Tablero[i] = Casillas.Posada;
//				System.out.println("La casilla 19 se ha cambiado por posada ");
//				System.out.println(Tablero[i]);
			}
		}
	}

	public static void colocarOca(Casillas[] Tablero) {
		int posicion = 9;
		for (int i = 0; i < Tablero.length; i++) {
			if (i == posicion) {
				Tablero[i] = Casillas.Oca;
				posicion = posicion + 9;
			}
		}
	}

	public static void colocarPuente(Casillas[] Tablero) {
		for (int i = 0; i < Tablero.length; i++) {
			if (i == 12) {
				Tablero[i] = Casillas.Puente;
			}
			if (i == 23) {
				Tablero[i] = Casillas.Puente;
			}
		}
	}

	public static void colocarMuerte(Casillas[] Tablero) {
		for (int i = 0; i < Tablero.length; i++) {
			if (i == 60) {
				Tablero[i] = Casillas.Muerte;
			}
		}
	}
}
