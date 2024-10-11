package game;

public class Vampiro extends Enemigo {
    public Vampiro(String nombre) {
        super(nombre, 50, 10);
    }

    @Override
    public int atacar() {
        return danioBase;
    }
}

