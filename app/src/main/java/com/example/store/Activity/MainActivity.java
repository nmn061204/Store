package com.example.store.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.store.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
        defaultFragment();
    }

    private void addControls() {
        bottomNavigationView = findViewById(R.id.bottom_navbar);
    }


    private void defaultFragment() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navbar);
        bottomNavigationView.setSelectedItemId(R.id.menu_tab1);
    }

    void loadFragment(Fragment fmNew) {
        FragmentTransaction fmTran = getSupportFragmentManager().beginTransaction();
        fmTran.replace(R.id.frameLayout, fmNew);
        fmTran.addToBackStack(null);
        fmTran.commit();
    }

    private void addEvents() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fmNew;
                if (item.getItemId() == R.id.menu_tab1) {
                    fmNew = new homeFragment();
                    loadFragment(fmNew);
                    return true;
                }
                if (item.getItemId() == R.id.menu_tab2) {
                    fmNew = new CategoryFragment();
                    loadFragment(fmNew);
                    return true;
                }
                if (item.getItemId() == R.id.menu_tab3) {
                    fmNew = new DailyFragment();
                    loadFragment(fmNew);
                    return true;
                }
                if (item.getItemId() == R.id.menu_tab4) {
                    fmNew = new CartFragment();
                    loadFragment(fmNew);
                    return true;
                }
                if (item.getItemId() == R.id.menu_tab5) {
                    fmNew = new ProfileFragment();
                    loadFragment(fmNew);
                    return true;
                }
                return true;
            }
        });
    }
}