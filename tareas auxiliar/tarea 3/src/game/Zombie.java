package game;

public class Zombie extends Enemigo {
    public Zombie(String nombre) {
        super(nombre, 50, 10);
    }

    @Override
    public int atacar() {
        puntosVida += 5; 
        return danioBase;
    }
}

