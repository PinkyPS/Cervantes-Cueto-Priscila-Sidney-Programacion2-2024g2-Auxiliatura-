package game;

public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel, 100);
        this.fuerza = 100;
    }

    public void atacar() {
        System.out.println(nombre + " haz un ataque");
    }
}

