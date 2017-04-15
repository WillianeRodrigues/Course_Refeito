package br.com.usp.willianerodrigues.course.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import br.com.usp.willianerodrigues.course.R;
import br.com.usp.willianerodrigues.course.fragments.Slide01;
import br.com.usp.willianerodrigues.course.fragments.Slide02;

public class SlideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        SectionsPagerAdapter pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        if (viewPager != null) {
            viewPager.setAdapter(pagerAdapter);
        }

    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        private final String[] titles = {"1", "2"};

        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;

            if (position == 0) {
                fragment = new Slide01();
            } else if (position == 1) {
                fragment = new Slide02();
            }

            return fragment;
        }

        @Override
        public int getCount() {
            return titles.length;
        }
    }

}