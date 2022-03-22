package modelo;

import java.util.Objects;

public class Rectangulo {
    private final Coordenada leftUp;
    private final Coordenada rightDown;

    public Rectangulo(Coordenada leftUp, Coordenada rightDown) {
        super();
        this.leftUp = leftUp;
        this.rightDown = rightDown;
    }

    public void move(int horizontal, int vertical) {
        this.leftUp.move(horizontal, vertical);
        this.rightDown.move(horizontal, vertical);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangulo)) return false;
        Rectangulo that = (Rectangulo) o;
        return Objects.equals(leftUp, that.leftUp) && Objects.equals(rightDown, that.rightDown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftUp, rightDown);
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "leftUp=" + leftUp + ", rightDown=" + rightDown + '}';
    }
}
