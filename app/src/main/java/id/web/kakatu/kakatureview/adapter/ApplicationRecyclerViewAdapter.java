package id.web.kakatu.kakatureview.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.web.kakatu.kakatureview.R;
import id.web.kakatu.kakatureview.activity.ReviewActivity;
import id.web.kakatu.kakatureview.model.Application;

/**
 * Created by Michael on 12/15/2016.
 */

public class ApplicationRecyclerViewAdapter extends RecyclerView.Adapter<ApplicationRecyclerViewAdapter.ApplicationViewHolder> {

    private Context context;

    // Create a list of applications
    ArrayList<Application> applications = new ArrayList<Application>();

    // Constructor
    public ApplicationRecyclerViewAdapter(Context context, ArrayList<Application> applications) {
        this.context = context;
        this.applications = applications;
    }

    @Override
    public ApplicationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_application, parent, false);

        ApplicationViewHolder view = new ApplicationViewHolder(viewItem);

        return view;
    }

    @Override
    public void onBindViewHolder(final ApplicationViewHolder holder, final int position) {
        holder.applicationIconCardImageView.setImageResource(applications.get(position).getIconResourceId());
        holder.applicationNameCardTextView.setText(applications.get(position).getName());
        holder.developerNameCardTextView.setText(applications.get(position).getDeveloper());
        holder.ratingIconCardImageView.setImageResource(applications.get(position).getAgeRatingResoucreId());
        holder.totalReviewsCardTextView.setText(String.valueOf(applications.get(position).getTotalReview()));

        holder.applicationCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ReviewActivity.class);
                intent.putExtra("icon", applications.get(position).getIconResourceId());
                intent.putExtra("name", applications.get(position).getName());
                intent.putExtra("developer", applications.get(position).getDeveloper());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return applications.size();
    }

    public class ApplicationViewHolder extends RecyclerView.ViewHolder {

        CardView applicationCard;
        ImageView applicationIconCardImageView, ratingIconCardImageView;
        TextView applicationNameCardTextView, developerNameCardTextView, totalReviewsCardTextView;

        public ApplicationViewHolder(View itemView) {
            super(itemView);

            applicationCard = (CardView) itemView.findViewById(R.id.application_card);
            applicationIconCardImageView = (ImageView) itemView.findViewById(R.id.application_icon_card_image_view);
            applicationNameCardTextView = (TextView) itemView.findViewById(R.id.application_name_card_text_view);
            developerNameCardTextView = (TextView) itemView.findViewById(R.id.developer_name_card_text_view);
            ratingIconCardImageView = (ImageView) itemView.findViewById(R.id.rating_icon_card_image_view);
            totalReviewsCardTextView = (TextView) itemView.findViewById(R.id.total_reviews_card_text_view);
        }
    }
}
