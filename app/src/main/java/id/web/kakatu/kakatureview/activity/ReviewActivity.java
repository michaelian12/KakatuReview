package id.web.kakatu.kakatureview.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import id.web.kakatu.kakatureview.R;
import id.web.kakatu.kakatureview.adapter.ReviewerAdapter;

public class ReviewActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView icon;
    private TextView name, developer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        /* Set Toolbar */
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /* Set View Pager */
        ViewPager viewPager = (ViewPager) findViewById(R.id.review_viewpager);
        ReviewerAdapter adapter = new ReviewerAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        /* Set Tab Layout */
        TabLayout tabLayout = (TabLayout) findViewById(R.id.reviewer_tabs);
        tabLayout.setupWithViewPager(viewPager);

        icon = (ImageView) findViewById(R.id.application_icon_review_image_view);
        name = (TextView) findViewById(R.id.application_name_review_text_view);
        developer = (TextView) findViewById(R.id.developer_name_review_text_view);

        icon.setImageResource(getIntent().getIntExtra("icon", 0));
        name.setText(getIntent().getStringExtra("name"));
        developer.setText(getIntent().getStringExtra("developer"));
    }
}
