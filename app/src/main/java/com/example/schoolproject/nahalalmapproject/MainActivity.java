package com.example.schoolproject.nahalalmapproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottom_navigation;
    TextView ph_MA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottom_navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottom_navigation.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent = null;

                switch (item.getItemId()) {
                    case R.id.navigation_map:
                        intent = new Intent(MainActivity.this, MapActivity.class);
                        break;
                    case R.id.navigation_favorite:
                        intent = new Intent(MainActivity.this, FavoriteActivity.class);
                        break;
                    case R.id.navigation_list:
                        intent = new Intent(MainActivity.this, ListActivity.class);
                        break;
                    case R.id.navigation_settings:
                        intent = new Intent(MainActivity.this, SettingsActivity.class);
                        break;
                    default:
                        break;
                }

                if (intent != null) {
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        });
        //THe following is a placeholder
        ph_MA = findViewById(R.id.ph_MA);
        ph_MA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SignInSignUp.class);
                startActivity(i);
            }
        }); //testing / continuing the sign in / sign up

    }
}
