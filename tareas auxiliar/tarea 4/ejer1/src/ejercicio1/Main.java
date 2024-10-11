package ejercicio1;

public class Main {
    public static void main(String[] args) {
        CartaNormal cartaNormal = new CartaNormal(5, "Corazones", "Cinco de Corazones");
        cartaNormal.mostrarCarta();
        cartaNormal.jugar();
        cartaNormal.mostrarValor();

        CartaEspecial cartaEspecial = new CartaEspecial(10, "Diamantes", "Diez de Diamantes");
        cartaEspecial.mostrarCarta();
        cartaEspecial.jugar();
        cartaEspecial.realizarAccion();
    }
}
