package juego;

import java.util.Random;

public class Botin {
    private String tipo; 
    private String rareza; 
    private int atributo1; 
    private int atributo2; 
    private int atributo3; 

    public Botin(String tipo, String rareza, int atributo1, int atributo2, int atributo3) {
        this.tipo = tipo;
        this.rareza = rareza;
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Rareza: " + rareza + ", Atributo 1: " + atributo1 +
               ", Atributo 2: " + atributo2 + ", Atributo 3: " + atributo3;
    }

    public static Botin generarBotin() {
        Random random = new Random();
        String[] tipos = {"Arma", "Escudo", "Modificador"};
        String[] rarezas = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};
        
        String tipo = tipos[random.nextInt(tipos.length)];
        String rareza = rarezas[random.nextInt(rarezas.length)];
        
        int atributo1 = random.nextInt(100) + 1; 
        int atributo2 = tipo.equals("Escudo") ? random.nextInt(50) + 1 : 0;
        int atributo3 = tipo.equals("Modificador") ? random.nextInt(30) + 1 : 0;

        return new Botin(tipo, rareza, atributo1, atributo2, atributo3);
    }
}


