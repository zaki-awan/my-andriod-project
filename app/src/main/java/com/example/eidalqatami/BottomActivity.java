package com.example.eidalqatami;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListner);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmant_container, new HomeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;
            switch (menuItem.getItemId()){

                case R.id.nav_home:
                    selectedFragment = new HomeFragment();
                    break;

                case R.id.nav_category:
                    selectedFragment = new CategoryFragment();
                    break;


                case R.id.nav_cart:
                    selectedFragment = new CartFragment();
                    break;

                case R.id.nav_Account:
                    selectedFragment = new AccountFragment();
                    break;

            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragmant_container,selectedFragment).commit();

            return true;
        }
    };
}
