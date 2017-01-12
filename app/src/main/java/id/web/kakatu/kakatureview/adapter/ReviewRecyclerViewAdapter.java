package id.web.kakatu.kakatureview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import id.web.kakatu.kakatureview.R;
import id.web.kakatu.kakatureview.model.Review;

/**
 * Created by Michael on 12/19/2016.
 */

public class ReviewRecyclerViewAdapter extends RecyclerView.Adapter<ReviewRecyclerViewAdapter.ReviewViewHolder> {

    private Context context;

    // Create a list of reviews
    ArrayList<Review> reviews = new ArrayList<Review>();

    // Constructor
    public ReviewRecyclerViewAdapter(Context context, ArrayList<Review> reviews) {
        this.context = context;
        this.reviews = reviews;
    }

    @Override
    public ReviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_review, parent, false);

        ReviewViewHolder view = new ReviewViewHolder(viewItem);

        return view;
    }

    @Override
    public void onBindViewHolder(ReviewViewHolder holder, int position) {
        holder.profilePictureReviewCardImageView.setImageResource(reviews.get(position).getProfilePictureResourceId());
        holder.userNameReviewCardTextView.setText(reviews.get(position).getName());
        holder.postTimeReviewCardTextView.setText(reviews.get(position).getPostTime());
        holder.titleReviewCardTextView.setText(reviews.get(position).getTitle());
        holder.contentReviewCardTextView.setText(reviews.get(position).getContent());
        holder.totalCommentsReviewCardTextView.setText(String.valueOf(reviews.get(position).getTotalComments()));
        holder.totalLikesReviewCardTextView.setText(String.valueOf(reviews.get(position).getTotalLikes()));
        holder.totalDislikesReviewCardTextView.setText(String.valueOf(reviews.get(position).getTotalDislikes()));
    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

    public class ReviewViewHolder extends RecyclerView.ViewHolder {

        CircleImageView profilePictureReviewCardImageView;
        TextView userNameReviewCardTextView, postTimeReviewCardTextView, titleReviewCardTextView, contentReviewCardTextView;
        TextView totalCommentsReviewCardTextView, totalLikesReviewCardTextView, totalDislikesReviewCardTextView;

        public ReviewViewHolder(View itemView) {
            super(itemView);

            profilePictureReviewCardImageView = (CircleImageView) itemView.findViewById(R.id.profile_picture_review_card_image_view);
            userNameReviewCardTextView = (TextView) itemView.findViewById(R.id.user_name_review_card_text_view);
            postTimeReviewCardTextView = (TextView) itemView.findViewById(R.id.post_time_review_card_text_view);
            titleReviewCardTextView = (TextView) itemView.findViewById(R.id.title_review_card_text_view);
            contentReviewCardTextView = (TextView) itemView.findViewById(R.id.content_review_card_text_view);
            totalCommentsReviewCardTextView =(TextView) itemView.findViewById(R.id.total_comments_review_card_text_view);
            totalLikesReviewCardTextView = (TextView) itemView.findViewById(R.id.total_likes_review_card_text_view);
            totalDislikesReviewCardTextView = (TextView) itemView.findViewById(R.id.total_dislikes_review_card_text_view);
        }
    }
}
