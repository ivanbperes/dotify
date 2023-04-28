package ibperes.dotify.audiomodels;

public class Music extends Audio{
    private String musician;
    private String album;
    private String genre;

    public Music(String title, int timeInMinutes, String musician, String album, String genre) {
        super(title, timeInMinutes);
        this.musician = musician;
        this.album = album;
        this.genre = genre;
    }

    public String getMusician() {
        return musician;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void playAudio() {
        super.playAudio();
        System.out.println("Playing music " + getTitle());
    }
}
