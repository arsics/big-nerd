package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by sasha on 22.7.14..
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
