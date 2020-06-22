package com.example.whatamitodoapp.presentation.intro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.os.Bundle;

import com.example.whatamitodoapp.R;

public class IntroActivity extends AppCompatActivity {
    String POSITION = "position";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

public class IntroPagerAdapter extends FragmentPagerAdapter{

    public IntroPagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new IntroFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(IntroFragment.ARG_POSITION, position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
}
