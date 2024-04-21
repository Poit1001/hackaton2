package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.databinding.ActivityTeamLeadBinding;

public class TeamLead extends AppCompatActivity {
    private String[] role1 = {"not choose", "designer", "frontend", "backend"};
    private String[] role2 = {"not choose", "designer", "frontend", "backend"};
    private String[] role3 = {"not choose", "designer", "frontend", "backend"};
    public ActivityTeamLeadBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        binding = ActivityTeamLeadBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = new Intent(this, RegProject.class);
        ArrayAdapter<String> rolesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, role1);
        rolesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sproles = (Spinner) findViewById(R.id.role_spinner);
        sproles.setAdapter(rolesAdapter);

        ArrayAdapter<String> rolesAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, role2);
        rolesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sproles2 = (Spinner) findViewById(R.id.role_secspinner);
        sproles2.setAdapter(rolesAdapter);

        ArrayAdapter<String> rolesAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, role3);
        rolesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sproles3 = (Spinner) findViewById(R.id.role_thspinner);
        sproles3.setAdapter(rolesAdapter);
    }
}