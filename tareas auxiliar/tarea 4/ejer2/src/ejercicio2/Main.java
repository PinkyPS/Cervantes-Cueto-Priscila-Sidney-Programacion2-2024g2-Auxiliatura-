package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 180, 2020);
        coche.mostrarInfo();
        coche.acelerar();
        coche.frenar();

        Moto moto = new Moto("Yamaha", "MT-07", 200, 2021);
        moto.mostrarInfo();
        moto.acelerar();
        moto.activarTurbo();
    }
}
