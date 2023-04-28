package ibperes.dotify.audiomodels;

public class Podcast extends Audio{
    private String host;
    private String description;

    public Podcast(String title, int timeInMinutes, String host, String description) {
        super(title, timeInMinutes);
        this.host = host;
        this.description = description;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void playAudio() {
        super.playAudio();
        System.out.println("Playing podcast " + getTitle());
    }
}
