package ibperes.dotify.usermodels;

public class User {
    private String name;
    private String subscription;
    private int userId;
    static int ids;

    public User(String name, String subscription) {
        this.name = name;
        this.subscription = subscription;
        ids++;
        this.userId = ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public int getUserId() {
        return userId;
    }
}
