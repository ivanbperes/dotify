import ibperes.dotify.audiomodels.Podcast;

public class Main {
    public static void main(String[] args) {
        Podcast novo = new Podcast("Test podcast", 522, "Xadrez Verbal", "Podcast de 5h");

        System.out.println("Title: " + novo.getTitle());
        System.out.println("Number of likes: " + novo.getTotalLikes());
        System.out.println("Rating: " + novo.getRating());
        System.out.println("Total play: " + novo.getTotalPlay());
        System.out.println("Time in minutes: " + novo.getTimeInMinutes());
        for (int i = 0; i < 47; i++) {
            novo.giveLike();
        }
        System.out.println("Number of likes after liking: " + novo.getTotalLikes());
        for (int i = 0; i < 1245; i++) {
            novo.playAudio();
        }
        System.out.println("Number of plays after playing: " + novo.getTotalPlay());
        System.out.println("Playing audio: ");
        novo.playAudio();


    }
}