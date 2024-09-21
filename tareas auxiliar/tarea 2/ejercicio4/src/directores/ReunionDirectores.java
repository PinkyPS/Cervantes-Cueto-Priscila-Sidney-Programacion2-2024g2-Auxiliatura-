package directores;

public class ReunionDirectores {
    private int numDirectores;
    private int duracionMaxima;

    public ReunionDirectores(int numDirectores, int duracionMaxima) {
        this.numDirectores = numDirectores;
        this.duracionMaxima = duracionMaxima;
    }

    public int calcularDuracionMaxima() {
        // Duración discursos + pausas
        int totalPausas = numDirectores - 1;
        int tiempoUtil = duracionMaxima - totalPausas;

        // Duración discurso
        return tiempoUtil / numDirectores;
    }
}

