package game;

public class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected Inventario inventario;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.inventario = new Inventario();
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + ", Nivel: " + nivel + ", Puntos de Vida: " + puntosVida);
    }

    public void recibirDanio(int danio) {
        puntosVida -= danio;
        if (puntosVida < 0) puntosVida = 0;
    }

    public void curar() {
        puntosVida += 20;
        System.out.println(nombre + " se curo 20 puntos de vida.");
    }
}

