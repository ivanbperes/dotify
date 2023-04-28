package ibperes.dotify.audiomodels;

public class Audio {
    private String title;
    private int timeInMinutes;
    private int totalPlay;
    private int totalLikes;
    private int rating;

    public Audio(String title, int timeInMinutes) {
        this.title = title;
        this.timeInMinutes = timeInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    public int getTotalPlay() {
        return totalPlay;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRating() {
        return rating;
    }

    public void giveLike() {
        this.totalLikes++;
    }

    public void playAudio() {
        this.totalPlay++;
    }
}
