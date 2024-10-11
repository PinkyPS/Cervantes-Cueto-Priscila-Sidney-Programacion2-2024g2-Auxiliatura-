package ejercicio1;

public class CartaEspecial extends Carta implements Accionable {
    public CartaEspecial(int valor, String palo, String nombre) {
        super(valor, palo, nombre);
    }

    @Override
    public void jugar() {
        System.out.println("La carta especial ha sido jugada.");
    }

    @Override
    public void realizarAccion() {
        System.out.println("Acción especial de la carta especial activada.");
    }
}

