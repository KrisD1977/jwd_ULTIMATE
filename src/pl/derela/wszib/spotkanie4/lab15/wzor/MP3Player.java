package pl.derela.wszib.spotkanie4.lab15.wzor;

public class MP3Player extends MusicPlayer{

    public MP3Player(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("MP3player odtwarza" + getCurrentSong());

    }

    @Override
    public void pause() {
        System.out.println("MP3player pauza" + getCurrentSong());

    }

    @Override
    public void stop() {
        System.out.println("MP3player stop");

    }



}
