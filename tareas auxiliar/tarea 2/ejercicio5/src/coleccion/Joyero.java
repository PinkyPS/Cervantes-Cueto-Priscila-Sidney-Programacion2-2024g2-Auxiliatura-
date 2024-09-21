package coleccion;

public class Joyero {
    private int[][] matriz;

    public Joyero(int[][] matriz) {
        this.matriz = matriz;
    }

    public int contarRotaciones() {
        int n = matriz.length;
        int rotaciones = 0;

        while (rotaciones < 4) {
            if (esOriginal()) {
                return rotaciones;
            }
            rotarMatriz();
            rotaciones++;
        }

        return 0; // Esto no debería ocurrir
    }

    private void rotarMatriz() {
        int n = matriz.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[n - 1 - j][i];
                matriz[n - 1 - j][i] = matriz[n - 1 - i][n - 1 - j];
                matriz[n - 1 - i][n - 1 - j] = matriz[j][n - 1 - i];
                matriz[j][n - 1 - i] = temp;
            }
        }
    }

    private boolean esOriginal() {
        return matriz[0][0] == 1 && matriz[0][1] == 2 && matriz[0][2] == 3 && matriz[0][3] == 4 &&
               matriz[1][0] == 5 && matriz[1][1] == 6 && matriz[1][2] == 7 && matriz[1][3] == 8 &&
               matriz[2][0] == 9 && matriz[2][1] == 10 && matriz[2][2] == 11 && matriz[2][3] == 12 &&
               matriz[3][0] == 13 && matriz[3][1] == 14 && matriz[3][2] == 15 && matriz[3][3] == 16;
    }
}

