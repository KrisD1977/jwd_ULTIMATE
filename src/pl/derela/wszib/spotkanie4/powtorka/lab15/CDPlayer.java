package pl.derela.wszib.spotkanie4.powtorka.lab15;

public class CDPlayer extends MusicPlayer{
    @Override
    public void play() {
        System.out.println( "CD Odtwarza: " +getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println( "CD pauza: " +getCurrentSong());
    }

    @Override
    public void stop() {
        current = 0;
        System.out.println( "CD stop: " +getCurrentSong());
    }

    @Override
    public void next() {
        if (current == cdSongs.length - 1) {
            current = 0;
            play();
        } else if (current < cdSongs.length){
            current = current + 1;
            play();
        }
    }

    @Override
    public void prev() {
        if (current <= 0) {
            current = 0;
            play();
        } else {
            current = current - 1;
            play();
        }
    }

    static Song s1 = new Song("Nov Rain","GnR","Gnr Hits");
    static Song s2 = new Song("Purple Rain","Prince","Prince Hits");
    static Song s3 = new Song("Thriller","M Jackson","MJ Hits");

   public static Song [] cdSongs = {s1,s2,s3};

    public CDPlayer(Song[] cdSongs) {
        this.cdSongs = cdSongs;
    }
    private int current;
    public Song getCurrentSong(){
        return cdSongs[current];
    }
}
