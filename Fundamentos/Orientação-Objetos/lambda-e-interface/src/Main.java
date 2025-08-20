public class Main {
    public static void main(String[] args) {

        runMusic(new Computer());
        runVideo(new Computer());
    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }

}

// utilização de instancia anonima usando na propria main
// var musicPlayer = new MusicPlayer() {

// @Override
// public void playMusic() {
// System.out.println("Tocando musica");
// }

// @Override
// public void pauseMusic() {

// }

// @Override
// public void stopMusic() {

// }

// };
// var musicPlayer2 = new MusicPlayer() {

// @Override
// public void playMusic() {
// System.out.println("Tocando musica");
// }

// @Override
// public void pauseMusic() {

// }

// @Override
// public void stopMusic() {

// }

// };

// musicPlayer.playMusic();
// System.out.println(musicPlayer.getClass());
// System.out.println(musicPlayer2.getClass());
