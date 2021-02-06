package pl.derela.wszib.spotkanie4.lab15.wzor;

abstract class MusicPlayer implements Player {

    private int current;
    private Song [] library;

    public MusicPlayer( Song[] library) {
        this.current = 0;
        this.library = library;
    }

    public Song getCurrentSong () {
        return library[current];
    }

    @Override
    public void next() {
        if (++current >= library.length) {
            current = 0;
        }

        play();

    }

    @Override
    public void prev() {
        if (--current <0) {
            current = library.length -1;
        }
        play();

    }
}
