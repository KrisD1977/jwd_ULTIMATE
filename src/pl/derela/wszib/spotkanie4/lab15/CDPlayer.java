package pl.derela.wszib.spotkanie4.lab15;

public class CDPlayer extends MusicPlayer{
    @Override
    public void play() {
        System.out.println("Gra CDplayer");

    }

    @Override
    public void pause() {
        System.out.println("Pauza CDplayer");
    }

    @Override
    public void nextSong() {
        System.out.println("Next CDplayer");

    }

    @Override
    public void prevSong() {
        System.out.println("Prev CDplayer");

    }

    Song [] cdPlayerSongList = new Song[2];

    Song s1 = new Song("Bocelli", "Con te partido", "Greatest Hits");
    Song s2 = new Song("Bocelli", "White Christmas", "Greatest Hits");
    Song s3 = new Song("Bocelli", "Fall On Me", "Greatest Hits");

    public void loader ( ) {
        s1 = cdPlayerSongList[0];
        s2 = cdPlayerSongList[1];
        s3 = cdPlayerSongList[2];
    }



}
