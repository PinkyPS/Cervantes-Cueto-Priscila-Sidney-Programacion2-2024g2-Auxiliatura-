package ejercicio2;

public class Moto extends Vehiculo implements Turbo {
    public Moto(String marca, String modelo, int velocidadMaxima, int year) {
        super(marca, modelo, velocidadMaxima, year);
    }

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando.");
    }

    @Override
    public void activarTurbo() {
        System.out.println("La moto ha activado el turbo.");
    }
}

