package ejercicio2;

public class Coche extends Vehiculo {
    public Coche(String marca, String modelo, int velocidadMaxima, int year) {
        super(marca, modelo, velocidadMaxima, year);
    }

    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }

    public void frenar() {
        System.out.println("El coche ha frenado.");
    }
}
