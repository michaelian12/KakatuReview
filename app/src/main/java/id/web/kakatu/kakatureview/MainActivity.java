package id.web.kakatu.kakatureview;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import id.web.kakatu.kakatureview.activity.FavoriteActivity;
import id.web.kakatu.kakatureview.activity.LeaderboardActivity;
import id.web.kakatu.kakatureview.activity.ProfileActivity;
import id.web.kakatu.kakatureview.activity.SettingsActivity;
import id.web.kakatu.kakatureview.adapter.ApplicationRecyclerViewAdapter;
import id.web.kakatu.kakatureview.model.Application;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private ApplicationRecyclerViewAdapter adapter;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Set Toolbar */
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        // Floating action button
//        fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "settings", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(this, AddVehicleActivity.class);
//                startActivity(intent);
//            }
//        });

        /* Set Navigation Drawer */
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(navItemSelect);

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

    NavigationView.OnNavigationItemSelectedListener navItemSelect = new NavigationView.OnNavigationItemSelectedListener() {

        Intent intent;

        @Override
        public boolean onNavigationItemSelected(MenuItem menuItem) {

            menuItem.setCheckable(true);

            drawerLayout.closeDrawer(GravityCompat.START);

            switch (menuItem.getItemId()){
                case R.id.nav_profile:
                    intent = new Intent(MainActivity.this, ProfileActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.nav_leaderboard:
                    intent = new Intent(MainActivity.this, LeaderboardActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.nav_favorite:
                    intent = new Intent(MainActivity.this, FavoriteActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.nav_settings:
                    intent = new Intent(MainActivity.this, SettingsActivity.class);
                    startActivity(intent);
                    return true;
                default:
                    return true;
            }
        }
    };
}
