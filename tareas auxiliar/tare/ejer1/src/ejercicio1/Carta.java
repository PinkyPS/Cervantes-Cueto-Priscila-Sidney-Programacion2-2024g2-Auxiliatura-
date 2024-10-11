package ejercicio1;

public abstract class Carta {
    protected int valor;
    protected String palo;
    protected String nombre;

    public Carta(int valor, String palo, String nombre) {
        this.valor = valor;
        this.palo = palo;
        this.nombre = nombre;
    }

    public abstract void jugar();
    
    public void mostrarCarta() {
        System.out.println("Carta: " + nombre + " (" + valor + " de " + palo + ")");
    }
}

