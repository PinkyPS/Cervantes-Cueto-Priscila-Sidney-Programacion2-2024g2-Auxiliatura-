package ejercicio1;

public class CartaNormal extends Carta {
    public CartaNormal(int valor, String palo, String nombre) {
        super(valor, palo, nombre);
    }

    @Override
    public void jugar() {
        System.out.println("La carta normal ha sido jugada.");
    }

    public void mostrarValor() {
        System.out.println("El valor de la carta es: " + valor);
    }
}

