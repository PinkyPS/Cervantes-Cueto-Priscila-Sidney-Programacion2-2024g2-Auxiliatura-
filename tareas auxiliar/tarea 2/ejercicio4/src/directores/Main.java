package directores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // directores
        System.out.print("Ingrese número de directores: ");
        int numDirectores = scanner.nextInt();

        // duración máxima de la reunión
        System.out.print("Ingrese la duración máxima de la reunión (en minutos): ");
        int duracionMaxima = scanner.nextInt();

      
        ReunionDirectores reunion = new ReunionDirectores(numDirectores, duracionMaxima);

        // duración máxima de cada discurso
        int duracionMaximaPorDiscurso = reunion.calcularDuracionMaxima();
        System.out.println("La duración máxima de cada discurso es: " + duracionMaximaPorDiscurso + " minutos");

        scanner.close();
    }
}

