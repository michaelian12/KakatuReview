package id.web.kakatu.kakatureview.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import id.web.kakatu.kakatureview.R;
import id.web.kakatu.kakatureview.fragment.PsychologistReviewFragment;
import id.web.kakatu.kakatureview.fragment.UserReviewFragment;

/**
 * Created by Michael on 1/9/2017.
 */

public class ReviewerAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context context;

    /**
     * Create a new {@link ReviewerAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public ReviewerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PsychologistReviewFragment();
        } else {
            return new UserReviewFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_psychologist);
        } else {
            return context.getString(R.string.category_user);
        }
    }
}
