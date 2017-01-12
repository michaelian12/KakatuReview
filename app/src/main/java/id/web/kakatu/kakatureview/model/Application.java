package id.web.kakatu.kakatureview.model;

/**
 * Created by Michael on 1/9/2017.
 */

public class Application {

    /** Name of the application */
    private String name;

    /** Developer name of the application */
    private String developer;

    /** Icon of the application */
    private int iconResourceId;

    /** Age Rating Icon of the application */
    private int ageRatingResoucreId;

    /** Total reviews of the application */
    private int totalReview;

    public Application(String name, String developer, int iconResoucreId, int ageRatingResoucreId, int totalReview) {
        this.name = name;
        this.developer = developer;
        this.iconResourceId = iconResoucreId;
        this.ageRatingResoucreId = ageRatingResoucreId;
        this.totalReview = totalReview;
    }

    public String getName() {
        return name;
    }

    public String getDeveloper() {
        return developer;
    }

    public int getIconResourceId() {
        return iconResourceId;
    }

    public int getAgeRatingResoucreId() {
        return ageRatingResoucreId;
    }

    public int getTotalReview() {
        return totalReview;
    }
}
