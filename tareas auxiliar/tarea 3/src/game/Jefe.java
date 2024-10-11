package game;

public class Jefe extends Enemigo {
    private double multiplicadorDanio;

    public Jefe(String nombre, double multiplicadorDanio) {
        super(nombre, 100, 20);
        this.multiplicadorDanio = multiplicadorDanio;
    }

    @Override
    public int atacar() {
        return (int) (danioBase * multiplicadorDanio);
    }

    public void hablar() {
        System.out.println(nombre + ": ¡soy el señor de este reino, hare que no quede nada de ti, tu viaje terminara!");
    }
}

