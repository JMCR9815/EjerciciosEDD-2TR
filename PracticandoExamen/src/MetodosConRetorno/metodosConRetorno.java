package MetodosConRetorno;

import modelo.Coordenada;
import modelo.Rectangulo;

public class metodosConRetorno {

    public Rectangulo generadorDeRectangulos(Coordenada leftUp, Coordenada rightDown) {
        return new Rectangulo(leftUp, rightDown);

    }


    public boolean geveMe() {
        return true;
    }
}
