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
import id.web.kakatu.kakatureview.model.Leaderboard;

/**
 * Created by Michael on 12/20/2016.
 */

public class LeaderboardRecyclerViewAdapter extends RecyclerView.Adapter<LeaderboardRecyclerViewAdapter.LeaderboardViewHolder> {

    private Context context;

    // Create a list of leaderboards
    ArrayList<Leaderboard> leaderboards = new ArrayList<Leaderboard>();

    // Constructor
    public LeaderboardRecyclerViewAdapter(Context context, ArrayList<Leaderboard> leaderboards) {
        this.context = context;
        this.leaderboards = leaderboards;
    }

    @Override
    public LeaderboardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_leaderboard, parent, false);

        LeaderboardViewHolder view = new LeaderboardViewHolder(viewItem);

        return view;
    }

    @Override
    public void onBindViewHolder(LeaderboardViewHolder holder, int position) {
        holder.positionLeaderboardCardTextView.setText(String.valueOf(position + 1));
        holder.profilePictureLeaderboardCardImageView.setImageResource(leaderboards.get(position).getProfilePictureResourceId());
        holder.userNameLeaderboardCardTextView.setText(leaderboards.get(position).getName());
        holder.levelNameLeaderboardCardTextView.setText(leaderboards.get(position).getLevelName());
        holder.totalPostsLeaderboardCardTextView.setText(String.valueOf(leaderboards.get(position).getTotalPosts()  + " ulasan"));
    }

    @Override
    public int getItemCount() {
        return leaderboards.size();
    }

    public class LeaderboardViewHolder extends RecyclerView.ViewHolder {

        CircleImageView profilePictureLeaderboardCardImageView;
        TextView positionLeaderboardCardTextView, userNameLeaderboardCardTextView, levelNameLeaderboardCardTextView, totalPostsLeaderboardCardTextView;

        public LeaderboardViewHolder(View itemView) {
            super(itemView);

            positionLeaderboardCardTextView = (TextView) itemView.findViewById(R.id.rank_leaderboard_card_text_view);
            profilePictureLeaderboardCardImageView = (CircleImageView) itemView.findViewById(R.id.profile_picture_leaderboard_card_image_view);
            userNameLeaderboardCardTextView = (TextView) itemView.findViewById(R.id.user_name_leaderboard_card_text_view);
            levelNameLeaderboardCardTextView = (TextView) itemView.findViewById(R.id.level_name_leaderboard_card_text_view);
            totalPostsLeaderboardCardTextView = (TextView) itemView.findViewById(R.id.total_posts_leaderboard_card_text_view);
        }
    }
}
