package facade;

public class Main {
    public static void main(String[] args) {
        // Llamamos a la fachada para reproducir la musica
        MusicFacade musicFacade = new MusicFacade();

        // Usamos la fachada para la musica
        musicFacade.playMusic("Cliffs Of Dover.mp3");
    }
}