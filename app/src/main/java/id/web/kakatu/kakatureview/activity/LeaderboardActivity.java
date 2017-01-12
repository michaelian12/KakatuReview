package id.web.kakatu.kakatureview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import id.web.kakatu.kakatureview.R;
import id.web.kakatu.kakatureview.adapter.LeaderboardRecyclerViewAdapter;
import id.web.kakatu.kakatureview.model.Leaderboard;

public class LeaderboardActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private LeaderboardRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        /* Set Toolbar */
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        // Create a list of applications
        ArrayList<Leaderboard> leaderboards = new ArrayList<Leaderboard>();
        leaderboards.add(new Leaderboard(1, R.drawable.ic_application, "Farrah Khayra", "Saviour", 63));
        leaderboards.add(new Leaderboard(2, R.drawable.ic_application, "Farrah Khayra", "Saviour", 63));
        leaderboards.add(new Leaderboard(3, R.drawable.ic_application, "Farrah Khayra", "Saviour", 63));
        leaderboards.add(new Leaderboard(4, R.drawable.ic_application, "Farrah Khayra", "Saviour", 63));
        leaderboards.add(new Leaderboard(5, R.drawable.ic_application, "Farrah Khayra", "Saviour", 63));
        leaderboards.add(new Leaderboard(6, R.drawable.ic_application, "Farrah Khayra", "Saviour", 63));
        leaderboards.add(new Leaderboard(7, R.drawable.ic_application, "Farrah Khayra", "Saviour", 63));
        leaderboards.add(new Leaderboard(8, R.drawable.ic_application, "Farrah Khayra", "Saviour", 63));
        leaderboards.add(new Leaderboard(9, R.drawable.ic_application, "Farrah Khayra", "Saviour", 63));
        leaderboards.add(new Leaderboard(10, R.drawable.ic_application, "Farrah Khayra", "Saviour", 63));

        // Create an {@link LeaderboardRecyclerViewAdapter}, whose data source is a list of {@link Application}s. The
        // adapter knows how to create list items for each item in the list.
        adapter = new LeaderboardRecyclerViewAdapter(this, leaderboards);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
    }
}
