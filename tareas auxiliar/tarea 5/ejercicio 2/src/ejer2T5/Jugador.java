package ejer2T5;

public class Jugador {
    private String nombre;
    private int puntos;

    public Jugador(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public void aplicarBonificacion(CalculadoraBonificacion calculadora) {
        int bonificacion = calculadora.calcular(puntos);
        puntos += bonificacion;
        System.out.println(nombre + " recibio una bonificación de " + bonificacion + " puntos. sus puntos totales son: " + puntos);
    }

    public int getPuntos() {
        return puntos;
    }
}

