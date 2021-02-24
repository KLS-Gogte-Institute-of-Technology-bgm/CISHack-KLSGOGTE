package com.teameffina.elearning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.teameffina.elearning.Fragments.analyticsFragment;
import com.teameffina.elearning.Fragments.dashboardFragment;
import com.teameffina.elearning.Fragments.helpFragment;
import com.teameffina.elearning.Fragments.libraryFragment;

public class HomeActivity extends AppCompatActivity {

    Spinner spinner1, spinner2;

    Button btnSignOut;

    FrameLayout frameLayout;

    BottomNavigationView bottomNavigationView;

    View dashboardFragment, libraryFragment, analyticsFragment, helpFragment, profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        dashboardFragment = View.inflate(HomeActivity.this, R.layout.fragment_dashboard, null);
        libraryFragment = View.inflate(HomeActivity.this, R.layout.fragment_library, null);
        analyticsFragment = View.inflate(HomeActivity.this, R.layout.fragment_analytics, null);
        helpFragment = View.inflate(HomeActivity.this, R.layout.fragment_help, null);
        profileFragment = View.inflate(HomeActivity.this, R.layout.fragment_profile, null);

        btnSignOut = profileFragment.findViewById(R.id.btnSignOut);

        btnSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity.this.finish();
            }
        });

        spinner1 = libraryFragment.findViewById(R.id.spinner1);
        spinner2 = helpFragment.findViewById(R.id.spinner2);
        setupSpinner();

        frameLayout = findViewById(R.id.flFragment);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.dashboard:
                        Toast.makeText(HomeActivity.this, "Dashboard", Toast.LENGTH_SHORT).show();
                        setCurrentFragment(dashboardFragment);
                        break;
                    case R.id.library:
                        Toast.makeText(HomeActivity.this, "Library", Toast.LENGTH_SHORT).show();
                        setCurrentFragment(libraryFragment);
                        break;
                    case R.id.analytics:
                        Toast.makeText(HomeActivity.this, "Analytics", Toast.LENGTH_SHORT).show();
                        setCurrentFragment(analyticsFragment);
                        break;
                    case R.id.help:
                        Toast.makeText(HomeActivity.this, "Help", Toast.LENGTH_SHORT).show();
                        setCurrentFragment(helpFragment);
                        break;
                    case R.id.profile:
                        Toast.makeText(HomeActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        setCurrentFragment(profileFragment);
                        break;
                }
                return true;
            }
        });

        /* bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.dashboard:
                        setCurrentFragment(dashboardFragment);
                        break;

                    case R.id.library:
                        setCurrentFragment(libraryFragment);
                        break;

                    case R.id.analytics:
                        setCurrentFragment(analyticsFragment);
                        break;

                    case R.id.help:
                        setCurrentFragment(helpFragment);
                        break;
                }
                return false;
            }
        }); */
    }

    private void setupSpinner() {
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item, new String[] {"CET Crash Course", "JEE Crash Course",
                "JEE Online Tests", "NEET Crash Course", "PU + IIT 11 - Learning Modules", "PU + IIT 11 - Video Modules",
                "PU2 + IIT (19-20) Learning Modules", "PU2 + IIT (19-20) Video Modules"});
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(aa);

        aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item, new String[] {"Biology", "Mathematics", "Physics", "Chemistry", "All"});
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(aa);
    }

    private void setCurrentFragment(View fragment) {
        try {
            frameLayout.removeAllViews();
        } catch (Exception e) {}
        frameLayout.addView(fragment);
    }
}