package ejer3T5;

public class Main {
    public static void main(String[] args) {
        Aventura aventura = new Aventura();

        aventura.agregarTarea(() -> System.out.println("Explorando el bosque"));
        aventura.agregarTarea(() -> System.out.println("Luchando contra un monstruo"));
        aventura.agregarTarea(() -> System.out.println("Recogiendo tesoros"));
        aventura.agregarTarea(() -> System.out.println("Regresando a la aldea"));

        aventura.iniciar();
    }
}

