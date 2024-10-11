package game;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int nivel) {
        super(nombre, nivel, 100);
        this.mana = 100;
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo");
    }
}

