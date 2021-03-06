package ahorcado;

import java.util.Scanner;

//Extraer metodos para mejorar la legibilidad
public class AhorcadoV1
{
	static String solicitarPalabraSecreta() {
		Scanner lectorTeclado = new Scanner(System.in);
		System.out.println("Introduce la palabra secreta");
		String cadena = lectorTeclado.nextLine();
		cadena=cadena.toUpperCase();
		return cadena;
	}
	
	public static void main(String[] args) {
		//Leer la palabra secreta
		String palabraSecreta=solicitarPalabraSecreta();
		//se crea la palabra con los aciertos
		boolean letraNoEstaEnPalabra = true;
		boolean palabraAcertada=false;
		int cantidadDeFallos=0;
		char[] cadenaLetrasAcertadas = generaCadenaAciertos(palabraSecreta);
		//el bucle del juego
		do {
			char caracterDeUsuario = pedirLetraUsuario();
			letraNoEstaEnPalabra = anotarAciertos(palabraSecreta, letraNoEstaEnPalabra, cadenaLetrasAcertadas,
					caracterDeUsuario);
			System.out.println("ha fallao " + letraNoEstaEnPalabra);
			palabraAcertada=true;
			palabraAcertada = comprobarResolucionPalabra(palabraAcertada, cadenaLetrasAcertadas);
			//me pregunto si he alcanzado el numero maximo de fallos
			if(letraNoEstaEnPalabra) {
				cantidadDeFallos++;
				letraNoEstaEnPalabra=true;
			}
		} while (cantidadDeFallos<5&&!palabraAcertada);
		System.out.println("terminado");
	}

	static boolean comprobarResolucionPalabra(boolean palabraAcertada, char[] cadenaLetrasAcertadas) {
		//me pregunto si alguna letra de parc esta con '_' significa que no
		//esta todavia acertada la palabra
		for (int i = 0; i < cadenaLetrasAcertadas.length; i++) {
			System.out.print(" " + cadenaLetrasAcertadas[i]);
			if(cadenaLetrasAcertadas[i]=='_') {
				palabraAcertada=false;
			}
		}
		return palabraAcertada;
	}

	static boolean anotarAciertos(String palabraSecreta, boolean letraNoEstaEnPalabra,
			char[] cadenaLetrasAcertadas, char caracterDeUsuario) {
		//si la letra est? en la palabra secreta la escribo en la de los aciertos
		for (int i = 0; i < cadenaLetrasAcertadas.length; i++) {
			if (palabraSecreta.charAt(i) == caracterDeUsuario) {
				cadenaLetrasAcertadas[i] = caracterDeUsuario;
				letraNoEstaEnPalabra = false;
			}
		}
		return letraNoEstaEnPalabra;
	}

	static char pedirLetraUsuario() {
		Scanner lectorTeclado = new Scanner(System.in);
		System.out.println("Introduce la letra");
		char caracterDeUsuario = lectorTeclado.nextLine().charAt(0);
		caracterDeUsuario = Character.toUpperCase(caracterDeUsuario);
		return caracterDeUsuario;
	}

	static char[] generaCadenaAciertos(String palabraSecreta) {
		char[] cadenaLetrasAcertadas = new char[palabraSecreta.length()];
		for (int i = 0; i < cadenaLetrasAcertadas.length; i++) {
				cadenaLetrasAcertadas[i] = '_';
		}
		return cadenaLetrasAcertadas;
	}
}
