package game;

public class Enemigo {
    protected String nombre;
    protected int puntosVida;
    protected int danioBase;

    public Enemigo(String nombre, int puntosVida, int danioBase) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.danioBase = danioBase;
    }

    public int atacar() {
        return danioBase;
    }

    public void recibirDanio(int danio) {
        puntosVida -= danio;
        if (puntosVida < 0) puntosVida = 0;
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }
}

