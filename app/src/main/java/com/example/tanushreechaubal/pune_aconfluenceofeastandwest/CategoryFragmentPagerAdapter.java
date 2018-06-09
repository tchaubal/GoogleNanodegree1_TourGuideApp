package com.example.tanushreechaubal.pune_aconfluenceofeastandwest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by TanushreeChaubal on 3/11/18.
 */

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    public CategoryFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    private String tabTitles[] = new String[] { "Landmarks", "Restaurants", "Tech Parks", "Forts", "Gardens" };

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new LandmarkFragment();
        } else if(position == 1){
            return new PlaceToEatFragment();
        } else if(position == 2){
            return new TechParkFragment();
        } else if(position == 3){
            return new FortsFragment();
        } else {
            return new GardensFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
