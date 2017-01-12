package id.web.kakatu.kakatureview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import id.web.kakatu.kakatureview.R;
import id.web.kakatu.kakatureview.adapter.ApplicationRecyclerViewAdapter;
import id.web.kakatu.kakatureview.model.Application;

public class FavoriteActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private ApplicationRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        /* Set Toolbar */
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        // Create a list of applications
        ArrayList<Application> applications = new ArrayList<Application>();
        applications.add(new Application("Asphalt 8: Airborne", "Gameloft", R.drawable.ic_application, R.drawable.ic_review, 63));
        applications.add(new Application("Clash of Clans", "Supercell", R.drawable.ic_application, R.drawable.ic_review, 63));
        applications.add(new Application("Clash Royale", "Supercell", R.drawable.ic_application, R.drawable.ic_review, 63));
        applications.add(new Application("Fruit Ninja Free", "Halfbrick Studios", R.drawable.ic_application, R.drawable.ic_review, 63));
        applications.add(new Application("Jetpack Joyride", "Halfbrrick Studios", R.drawable.ic_application, R.drawable.ic_review, 63));
        applications.add(new Application("Modern Combat 5 eSports FPS", "Gameloft", R.drawable.ic_application, R.drawable.ic_review, 63));
        applications.add(new Application("My Talking Tom", "Outfit7", R.drawable.ic_application, R.drawable.ic_review, 63));
        applications.add(new Application("NinJump", "Backflip Studios, Inc.", R.drawable.ic_application, R.drawable.ic_review, 63));
        applications.add(new Application("Pou", "Zakeh", R.drawable.ic_application, R.drawable.ic_review, 63));
        applications.add(new Application("Real Racing 3", "ELECTRONIC ARTS", R.drawable.ic_application, R.drawable.ic_review, 63));

        // Create an {@link ApplicationRecyclerViewAdapter}, whose data source is a list of {@link Application}s. The
        // adapter knows how to create list items for each item in the list.
        adapter = new ApplicationRecyclerViewAdapter(this, applications);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
    }
}
