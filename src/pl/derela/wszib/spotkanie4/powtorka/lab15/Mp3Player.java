package pl.derela.wszib.spotkanie4.powtorka.lab15;

public class Mp3Player extends MusicPlayer  {
    @Override
    public void play() {
        System.out.println( "MP3 Odtwarza" +getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println( "MP3 pauza" +getCurrentSong());
    }

    @Override
    public void stop() {
        current = 0;
        System.out.println( "MP3 stop: " +getCurrentSong());
    }

    @Override
    public void next() {
        if (current == mp3Songs.length - 1) {
            current = 0;
            play();
        } else if (current < mp3Songs.length){
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

    static Song s1 = new Song("Oczy zielone","Zenek","Zenek Hits");
    static Song s2 = new Song("Bolero","Ravell","Ravell Hits");
    static Song s3 = new Song("Sober","tool","Undertow");
    static Song s4 = new Song("Chop Suey","SOAD","Toxicity");

    public static Song [] mp3Songs = {s1,s2,s3,s4};

    public Mp3Player(Song[] mp3Songs) {this.mp3Songs = mp3Songs;
    }
    private int current;
    public Song getCurrentSong(){
        return mp3Songs[current];
    }
}
