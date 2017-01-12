package id.web.kakatu.kakatureview.model;

/**
 * Created by Michael on 1/9/2017.
 */

public class Leaderboard {

    /** Position in the leaderboard */
    private int position;

    /** User profile picture */
    private int profilePictureResourceId;

    /** User name */
    private String name;

    /** Level Name */
    private String levelName;

    /** Number of total posts */
    private int totalPosts;

    public Leaderboard(int position, int profilePictureResourceId, String name, String levelName, int totalPosts) {
        this.position = position;
        this.profilePictureResourceId = profilePictureResourceId;
        this.name = name;
        this.levelName = levelName;
        this.totalPosts = totalPosts;
    }

    public int getPosition() {
        return position;
    }

    public int getProfilePictureResourceId() {
        return profilePictureResourceId;
    }

    public String getName() {
        return name;
    }

    public String getLevelName() {
        return levelName;
    }

    public int getTotalPosts() {
        return totalPosts;
    }
}
