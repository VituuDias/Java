public class Smartphone implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("O smartphone está tocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone está pausando a musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smartphone está parando a musica");

    }

    @Override
    public void playVideo() {
        System.out.println("O smartphone está reproduzindo o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone está pausando o video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O smartphone está parando o video");

    }

}
