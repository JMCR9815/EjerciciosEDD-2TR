package Clases;

import java.util.Arrays;

public class PrinciplaOca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casillas Tablero[];
		Tablero = new Casillas[63];
		for (int i = 0; i < Tablero.length; i++) {
			Tablero[i] = Casillas.Blanco;
		}
		Metodos.colocarFichas.colocarOca(Tablero);
		Metodos.colocarFichas.colocarPuente(Tablero);
		Metodos.colocarFichas.ColocarPozo(Tablero);
		Metodos.colocarFichas.ColocarPosada(Tablero);
		Metodos.colocarFichas.colocarMuerte(Tablero);
		System.out.println("Tablero Generado: " + Arrays.toString(Tablero));

	}

}
