package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Vaca vaca = new Vaca("Betsy", 3);
        vaca.mostrarInfo();
        vaca.hacerSonido();
        vaca.producir();
        vaca.comer();

        Oveja oveja = new Oveja("Dolly", 2);
        oveja.mostrarInfo();
        oveja.hacerSonido();
        oveja.producir();
        oveja.comer();
    }
}

