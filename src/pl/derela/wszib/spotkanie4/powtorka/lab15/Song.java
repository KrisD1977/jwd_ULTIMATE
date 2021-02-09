package pl.derela.wszib.spotkanie4.powtorka.lab15;

public class Song {
    private String title;
    private String author;
    private String album;

    public Song(String title, String author, String album) {
        this.title = title;
        this.author = author;
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", album='" + album + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getAlbum() {
        return album;
    }


}
