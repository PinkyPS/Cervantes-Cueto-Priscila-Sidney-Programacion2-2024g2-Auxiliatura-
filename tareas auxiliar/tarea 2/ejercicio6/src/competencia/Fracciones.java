package competencia;

import java.util.Scanner;

public class Fracciones {

    public static int calcularNumerador(int n) {
        if (n == 0) return 1; 
        if (n == 1) return 1; 

        int num1 = 1; 
        int num2 = 1; 

    
        for (int i = 2; i <= n; i++) {
            int temp = num2;
            num2 = num1 + num2; 
            num1 = temp; 
        }

        return num2; 
    }
}
