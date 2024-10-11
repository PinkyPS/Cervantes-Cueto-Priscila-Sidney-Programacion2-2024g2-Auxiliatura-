package ejercicio2;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;
    protected int year;

    public Vehiculo(String marca, String modelo, int velocidadMaxima, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.year = year;
    }

    public abstract void acelerar();

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Velocidad Máxima: " + velocidadMaxima + ", Año: " + year);
    }
}
