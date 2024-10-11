package game;

import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Mago mago = new Mago("Gandalf", random.nextInt(1, 11));
        Guerrero guerrero = new Guerrero("Conan", random.nextInt(1, 11));

        while (mago.puntosVida > 0 && guerrero.puntosVida > 0) {
            int danioMago = random.nextInt(10, 21);
            int danioGuerrero = random.nextInt(10, 21);

            mago.recibirDanio(danioGuerrero);
            guerrero.recibirDanio(danioMago);

            mago.mostrarEstado();
            guerrero.mostrarEstado();

            mago.lanzarHechizo();
            guerrero.atacar();
            System.out.println();
        }

        if (mago.puntosVida <= 0) {
            System.out.println("El mago ha sido derrotado.");
        } else {
            System.out.println("El guerrero ha sido derrotado.");
        }

        scanner.close();
    }
}

