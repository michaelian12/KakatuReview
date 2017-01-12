package id.web.kakatu.kakatureview.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.web.kakatu.kakatureview.R;
import id.web.kakatu.kakatureview.adapter.ReviewRecyclerViewAdapter;
import id.web.kakatu.kakatureview.model.Review;

/**
 * Created by Michael on 1/9/2017.
 */

public class PsychologistReviewFragment extends Fragment {

    private View rootView;
    private RecyclerView recyclerView;
    private ReviewRecyclerViewAdapter adapter;

    public PsychologistReviewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.list_view, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        // Create a list of reviews
        ArrayList<Review> reviews = new ArrayList<Review>();
        reviews.add(new Review(R.drawable.ic_application, "Farrah Khayra", "12/12/12", "Lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a nisi sapien. Nunc placerat sem fermentum lorem ipsum. Ut enim ad minim veniam, quis nostre", 21, 32, 2));
        reviews.add(new Review(R.drawable.ic_application, "Farrah Khayra", "12/12/12", "Lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a nisi sapien. Nunc placerat sem fermentum lorem ipsum. Ut enim ad minim veniam, quis nostre", 21, 32, 2));
        reviews.add(new Review(R.drawable.ic_application, "Farrah Khayra", "12/12/12", "Lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a nisi sapien. Nunc placerat sem fermentum lorem ipsum. Ut enim ad minim veniam, quis nostre", 21, 32, 2));
        reviews.add(new Review(R.drawable.ic_application, "Farrah Khayra", "12/12/12", "Lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a nisi sapien. Nunc placerat sem fermentum lorem ipsum. Ut enim ad minim veniam, quis nostre", 21, 32, 2));
        reviews.add(new Review(R.drawable.ic_application, "Farrah Khayra", "12/12/12", "Lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a nisi sapien. Nunc placerat sem fermentum lorem ipsum. Ut enim ad minim veniam, quis nostre", 21, 32, 2));
        reviews.add(new Review(R.drawable.ic_application, "Farrah Khayra", "12/12/12", "Lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a nisi sapien. Nunc placerat sem fermentum lorem ipsum. Ut enim ad minim veniam, quis nostre", 21, 32, 2));
        reviews.add(new Review(R.drawable.ic_application, "Farrah Khayra", "12/12/12", "Lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a nisi sapien. Nunc placerat sem fermentum lorem ipsum. Ut enim ad minim veniam, quis nostre", 21, 32, 2));
        reviews.add(new Review(R.drawable.ic_application, "Farrah Khayra", "12/12/12", "Lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a nisi sapien. Nunc placerat sem fermentum lorem ipsum. Ut enim ad minim veniam, quis nostre", 21, 32, 2));
        reviews.add(new Review(R.drawable.ic_application, "Farrah Khayra", "12/12/12", "Lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a nisi sapien. Nunc placerat sem fermentum lorem ipsum. Ut enim ad minim veniam, quis nostre", 21, 32, 2));
        reviews.add(new Review(R.drawable.ic_application, "Farrah Khayra", "12/12/12", "Lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a nisi sapien. Nunc placerat sem fermentum lorem ipsum. Ut enim ad minim veniam, quis nostre", 21, 32, 2));

        // Create an {@link ReviewRecyclerViewAdapter}, whose data source is a list of {@link Review}s. The
        // adapter knows how to create list items for each item in the list.
        adapter = new ReviewRecyclerViewAdapter(getActivity(), reviews);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);

        return rootView;
    }
}
