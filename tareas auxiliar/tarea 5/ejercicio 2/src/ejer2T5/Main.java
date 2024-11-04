package ejer2T5;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Erick", 100);
        Jugador jugador2 = new Jugador("Bob", 200);

        jugador1.aplicarBonificacion(puntosBase -> puntosBase * 10 / 100); 
        jugador1.aplicarBonificacion(puntosBase -> puntosBase * 20 / 100); 
        
        jugador2.aplicarBonificacion(puntosBase -> puntosBase + 50); 
        jugador2.aplicarBonificacion(puntosBase -> puntosBase * 5 / 100);
    }
}

