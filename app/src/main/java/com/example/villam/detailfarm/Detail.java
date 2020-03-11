package com.example.villam.detailfarm;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.villam.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Detail extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);


        TextView txt = (TextView) findViewById(R.id.ttt);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String s = bundle.getString("id");

        txt.setText(s);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragment = new FragmentHome();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

    }


    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = null;

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            switch (menuItem.getItemId())
            {
                case R.id.home_tab:
                    fragment = new FragmentHome();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).commit();
                    return true;

                case R.id.history_tab:
                    fragment = new FragmentHistory();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).commit();
                    return true;

                case R.id.setting_tab:
                    fragment = new FragmentSetting();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).commit();
                    return true;
            }

            return false;
        }
    };
}
