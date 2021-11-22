package com.example.echalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Invoice extends AppCompatActivity {
       private TextView textView11,showDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invioce);
        textView11 = findViewById(R.id.textView11);
//         showDetails.setText("\n\n"+" Full Name : \t Sanket Gawande \n"
//                + "Mobile No : \t 7768901271 \n"
//                + "Vehicle Name : \t Dream Yuga \n"
//                + "Vehicle No : \t MH30AR6534 \n");
                Intent intent = getIntent();
        String str = intent.getStringExtra("TotalPenalty");
        //Log.d( "onCheckedChanged ", "Penalty List "+ str);
        textView11.setText("Total Penalty : "+str+ " rs/-");




    }
}