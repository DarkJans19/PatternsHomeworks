package com.example;

public class GestorNotificaciones {
    // Instancia única de la clase, inicializada en el momento de la declaración
    private static final GestorNotificaciones instanciaUnica = new GestorNotificaciones();

    // Constructor privado para evitar la instanciación desde fuera
    private GestorNotificaciones() {
        // Inicialización si es necesario
    }

    // Método público estático para obtener la instancia única
    public static GestorNotificaciones getInstancia() {
        return instanciaUnica;
    }

    // Método para enviar una notificación
    public void enviarNotificacion(Notificacion notificacion, String mensaje) {
        notificacion.enviar(mensaje);
    }
}
