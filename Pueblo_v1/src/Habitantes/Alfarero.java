package Habitantes;

public class Alfarero {
	String nombre;
	int esperanzaVida;
	int edad=0;
	
	public void cumplirAnno() {
		if(isVivo())edad++;
	};
	
	public boolean isVivo() {
		return edad<esperanzaVida;
	}
	
	public void realizarActividadPrimaria() {
		System.out.println("afarea");
	}
}
