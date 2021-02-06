package pl.derela.wszib.spotkanie4.lab15;

public class Mp3Player extends MusicPlayer{
    @Override
    public void play() {
        System.out.println("Gra Mp3player");

    }

    @Override
    public void pause() {
        System.out.println("Pauza Mp3player");
    }

    @Override
    public void nextSong() {
        System.out.println("Next Mp3player");

    }

    @Override
    public void prevSong() {
        System.out.println("Prev Mp3player");

    }

    Song [] mp3PlayerSongList = new Song[2];

    Song s1 = new Song("Bocelli A", "Con te partido remix", "Greatest Hits");
    Song s2 = new Song("Bocelli A", "White Christmas remix", "Greatest Hits");
    Song s3 = new Song("Bocelli A", "Fall On Me remix", "Greatest Hits");

    public void loader ( ) {
        s1 = mp3PlayerSongList[0];
        s2 = mp3PlayerSongList[1];
        s3 = mp3PlayerSongList[2];
    }

    @Override
    public String toString() {
        return "Mp3Player{" +
                "s1=" + s1 +
                ", s2=" + s2 +
                ", s3=" + s3 +
                '}';
    }
}
