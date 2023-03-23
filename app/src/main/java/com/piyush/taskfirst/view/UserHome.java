package com.piyush.taskfirst.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.piyush.taskfirst.R;
import com.piyush.taskfirst.databinding.ActivityUserHomeBinding;

public class UserHome extends AppCompatActivity {

    ActivityUserHomeBinding binding;

    Home firstFragment=new Home();

    Profile secondFragment= new Profile();
    Setting thirdFragment=new Setting();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        binding = ActivityUserHomeBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());



        binding.bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, firstFragment).commit();
                        return true;

                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, secondFragment).commit();
                        return true;

                    case R.id.setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, thirdFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}