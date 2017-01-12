package id.web.kakatu.kakatureview.model;

/**
 * Created by Michael on 1/9/2017.
 */

public class Review {

    /** Profile picture of the reviewer */
    private int profilePictureResourceId;

    /** Name of the reviewer */
    private String name;

    /** Review post time */
    private String postTime;

    /** Tittle of the review */
    private String title;

    /** Content of the review */
    private String content;

    /** Total comments of the review */
    private int totalComments;

    /** Total likes of the review */
    private int totalLikes;

    /** Total dislikes of the review */
    private int totalDislikes;

    public Review(int profilePictureResourceId, String name, String postTime, String title, String content, int totalComments, int totalLikes, int totalDislikes) {
        this.profilePictureResourceId = profilePictureResourceId;
        this.name = name;
        this.postTime = postTime;
        this.title = title;
        this.content = content;
        this.totalComments = totalComments;
        this.totalLikes = totalLikes;
        this.totalDislikes = totalDislikes;
    }

    public int getProfilePictureResourceId() {
        return profilePictureResourceId;
    }

    public String getName() {
        return name;
    }

    public String getPostTime() {
        return postTime;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getTotalComments() {
        return totalComments;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getTotalDislikes() {
        return totalDislikes;
    }
}
