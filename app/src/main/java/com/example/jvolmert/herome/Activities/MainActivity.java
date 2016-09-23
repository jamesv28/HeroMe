package com.example.jvolmert.herome.Activities;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jvolmert.herome.Fragments.MainFragment;
import com.example.jvolmert.herome.Fragments.pickPowerFragment;
import com.example.jvolmert.herome.R;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentInteractionListener, pickPowerFragment.pickPowerInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getActionBar().hide();

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new MainFragment();
            manager.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }


    }

    public void pickPowerScrene() {

        pickPowerFragment pickPowerFragment = new pickPowerFragment();
        // replace old fragment and then move it to the back stack so we don't delete it
        this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, pickPowerFragment).addToBackStack(null).commit();

    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPickPowerFragmentInteraction(Uri uri) {

    }
}
