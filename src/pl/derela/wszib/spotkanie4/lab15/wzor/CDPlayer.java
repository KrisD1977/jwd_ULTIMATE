package pl.derela.wszib.spotkanie4.lab15.wzor;

public class CDPlayer extends MusicPlayer{

    public CDPlayer(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("CDplayer odtwarza" + getCurrentSong());

    }

    @Override
    public void pause() {
        System.out.println("CDplayer pauza" + getCurrentSong());

    }

    @Override
    public void stop() {
        System.out.println("CDplayer stop");

    }


}
