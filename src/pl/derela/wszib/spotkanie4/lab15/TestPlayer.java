package pl.derela.wszib.spotkanie4.lab15;

public class TestPlayer {

    public static void main(String[] args) {

        Player mp3a = new Mp3Player();
        mp3a.play();
        mp3a.pause();
        mp3a.nextSong();
        mp3a.prevSong();


        Player cdA = new CDPlayer();
        cdA.play();
        cdA.pause();
        cdA.nextSong();
        cdA.prevSong();
                cdA.loader();

    }
}
