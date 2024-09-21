package juego;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class game {
    private List<Botin> botinRecolectado;

    public game() {
        botinRecolectado = new ArrayList<>();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            Botin nuevoBotin = Botin.generarBotin();
            botinRecolectado.add(nuevoBotin);
            System.out.println("Has encontrado: " + nuevoBotin);

            System.out.print("¿Quieres seguir enfrentándote a enemigos para obtener más botín? (si/no): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }

        mostrarResumen();
        scanner.close();
    }

    private void mostrarResumen() {
        System.out.println("\nResumen del botín obtenido:");
        for (Botin b : botinRecolectado) {
            System.out.println(b);
        }
    }
}
