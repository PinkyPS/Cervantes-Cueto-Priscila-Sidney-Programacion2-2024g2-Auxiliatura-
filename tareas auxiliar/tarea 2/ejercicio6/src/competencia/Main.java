package competencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el valor de N: ");
        int n = scanner.nextInt();

        
        int numerador = Fracciones.calcularNumerador(n);

      
        System.out.println("El numerador de la fracción P" + n + " es: " + numerador);

        scanner.close();
    }
}

