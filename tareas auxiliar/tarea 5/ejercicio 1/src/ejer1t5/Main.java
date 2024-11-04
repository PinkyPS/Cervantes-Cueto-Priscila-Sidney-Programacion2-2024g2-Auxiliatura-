package ejer1t5;

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento("Batalla Final");
        
        evento1.registrarNotificacion(mensaje -> System.out.println("Notificación 1: " + mensaje));
        evento1.registrarNotificacion(mensaje -> System.out.println("Notificación 2: " + mensaje));
        
        evento1.activar();
        
        Evento evento2 = new Evento("Recompensa de Misión");
        evento2.registrarNotificacion(mensaje -> System.out.println("Notificación 3: " + mensaje));
     
        evento2.activar();
    }
}

