package com.example.echalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.util.ArrayList;

public class penalty_Dashboard extends AppCompatActivity {
    private Button confirmFine, clearFine;
    private CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6;
    private int total_fine = 0;
    private ArrayList<String> penaltyList = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penalty_dashboard);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox1.isChecked()){
                    total_fine = total_fine + 500;
                    penaltyList.add("Without Helmet");
                    Log.d( "onCheckedChanged ", "Without Helmet "+ total_fine + " rs");
                    Toast.makeText(penalty_Dashboard.this, "Without Helmet is added", Toast.LENGTH_SHORT).show();
                }
            }
        });


        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox2.isChecked()){
                    total_fine = total_fine + 1000;
                    penaltyList.add("Without License");
                    Log.d( "onCheckedChanged ", "Without License "+ total_fine +" rs");
                    Toast.makeText(penalty_Dashboard.this, "Without Lecense is added", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox3.isChecked()){
                    total_fine = total_fine + 1000;
                    penaltyList.add("Drink and Drive");
                   // Log.d( "onCheckedChanged ", "Without License "+ total_fine +" rs");
                    Toast.makeText(penalty_Dashboard.this, "Drink and Drive is added", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox2.isChecked()){
                    total_fine = total_fine + 800;
                    penaltyList.add("Over Speed");
                    Log.d( "onCheckedChanged ", "Without License "+ total_fine +" rs");
                    Toast.makeText(penalty_Dashboard.this, "Over Speed is added", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox2.isChecked()){
                    total_fine = total_fine + 500;
                    penaltyList.add("Overloading two-wheeler vehicles");
                    Log.d( "onCheckedChanged ", "Without License "+ total_fine +" rs");
                    Toast.makeText(penalty_Dashboard.this, "Overloading two-wheeler vehicles is added", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox2.isChecked()){
                    total_fine = total_fine + 500;
                    penaltyList.add("Violation of Signal's");
                    Log.d( "onCheckedChanged ", "Without License "+ total_fine +" rs");
                    Toast.makeText(penalty_Dashboard.this, "Violation of Signal's is added", Toast.LENGTH_SHORT).show();
                }
            }
        });


        confirmFine = findViewById(R.id.confirmFine);
        confirmFine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Invoice.class);
                Log.d( "onCheckedChanged ", "Total Fine Send "+ total_fine +" rs");
                String totalFineInString = Integer.toString(total_fine);
                //Log.d( "onCheckedChanged ", "penalty Fine Send "+ totalFineInString);
                intent.putExtra("TotalPenalty",totalFineInString );
                startActivity(intent);
                //finish();
            }
        });








    }


}