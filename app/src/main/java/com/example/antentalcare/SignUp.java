package com.example.antentalcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class SignUp extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        tabLayout.findViewById(R.id.tabs_layout);
        viewPager.findViewById(R.id.forfragments);

        tabLayout.addTab(tabLayout.newTab().setText("Doctor"));
        tabLayout.addTab(tabLayout.newTab().setText("Mother"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final SignupAdapter adapter = new SignupAdapter(getSupportFragmentManager(), this
        , this.tabLayout.getTabCount());

        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout
        ));

        }

}