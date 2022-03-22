package cafetera;

public class Cafetera implements Cafeteable {
    private short capacidadMaxima, cantidadActual;

    public Cafetera(short capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0;
    }

    @Override
    public void llenarCafetera() {
        this.cantidadActual = (short) (cantidadActual + (capacidadMaxima - cantidadActual));

    }

    @Override
    public int servirTaza(int capacidad) {
        int cantidadResultado = 0;
        if (capacidad <= this.capacidadMaxima) {

            cantidadResultado = this.cantidadActual - capacidad;
        }
        return cantidadResultado;
    }

    @Override
    public void vaciarCafetera() {
        this.cantidadActual = 0;

    }

    @Override
    public void agregarCafe(int capacidad) {
        if (capacidad <= this.capacidadMaxima) {

            this.cantidadActual = (short) (getCantidadActual() + capacidad);
        }

    }

    public short getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(short capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public short getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(short cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

}
