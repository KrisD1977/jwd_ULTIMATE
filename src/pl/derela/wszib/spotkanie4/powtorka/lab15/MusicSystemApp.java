package pl.derela.wszib.spotkanie4.powtorka.lab15;

import static pl.derela.wszib.spotkanie4.powtorka.lab15.CDPlayer.cdSongs;
import static pl.derela.wszib.spotkanie4.powtorka.lab15.Mp3Player.mp3Songs;

public class MusicSystemApp {
    public static void main(String[] args) {

        Player mp3 = new Mp3Player(mp3Songs);
        Player cd = new CDPlayer(cdSongs);

        cd.play();
        cd.next();
        cd.next();
        cd.next();
        cd.pause();
        cd.play();
        cd.next();
        cd.stop();
        cd.prev();


        System.out.println("----------------------");
        mp3.next();
        mp3.play();
        mp3.stop();
        mp3.prev();
        mp3.prev();
        mp3.prev();
        mp3.prev();
        mp3.prev();
        mp3.prev();
        mp3.next();
        mp3.next();
        mp3.next();
        mp3.next();

    }
}
