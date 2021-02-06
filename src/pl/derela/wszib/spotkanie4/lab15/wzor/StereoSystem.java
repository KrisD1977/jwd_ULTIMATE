package pl.derela.wszib.spotkanie4.lab15.wzor;

public class StereoSystem {

    public static void main(String[] args) {

        Song [] library = new Song[4];
        library[0] = new Song("Jackson M", "Beat It", "Thriller");
        library[1] = new Song("Pearl Jam", "Flow", "Ten");
        library[2] = new Song("Portishead", "Over", "NYC");
        library[3] = new Song("Jackson M", "Janice", "Thriller");


        Player [] players = {new CDPlayer(library), new MP3Player(library)};

        players[0].play();
        players[0].pause();
        players[0].next();
        players[0].prev();
        players[0].stop();
        System.out.println();

        players[1].play();
        players[1].pause();
        players[1].play();
        players[1].prev();
        players[1].stop();

    }

}
