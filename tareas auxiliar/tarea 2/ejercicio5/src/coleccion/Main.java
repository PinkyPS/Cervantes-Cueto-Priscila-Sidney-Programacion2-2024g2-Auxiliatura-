package coleccion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Ingrese el tamaño de la matriz (N): ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        Joyero joyero = new Joyero(matriz);

        int rotaciones = joyero.contarRotaciones();
        System.out.println("Número de rotaciones necesarias: " + rotaciones);

        scanner.close();
    }
}


