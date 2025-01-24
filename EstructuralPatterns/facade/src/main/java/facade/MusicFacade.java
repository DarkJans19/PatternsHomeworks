package facade;

public class MusicFacade {
    private MusicLoader loader;
    private MusicDecoder decoder;
    private MusicPlayer player;

    public MusicFacade() {
        loader = new MusicLoader();
        decoder = new MusicDecoder();
        player = new MusicPlayer();
    }

    public void playMusic(String fileName){
        System.out.println("Iniciando el proceso de reproduccion...");
        loader.load(fileName);
        decoder.decoder(fileName);
        player.play(fileName);
        System.out.println("Disfruta de tu musica!");
    }
}
