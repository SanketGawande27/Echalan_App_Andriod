package com.example.echalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.echalan.data.MyDBHandler;
import com.example.echalan.model.VehicleInfo;

public class DashBoard extends AppCompatActivity {
    private Button confirm_vehical_no,button,clear;
    private TextView showdata,textView9;
    private EditText searchVehicleNo;
    String info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        clear = findViewById(R.id.clear);
        button = findViewById(R.id.search);
        confirm_vehical_no = findViewById(R.id.button2);
        searchVehicleNo = findViewById(R.id.searchVehicleNo);
        showdata = findViewById(R.id.showInfo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDBHandler db = new MyDBHandler(DashBoard.this);
                VehicleInfo VI = new VehicleInfo();
                VI.setFullname("Sanket Kailas Gawande");
                VI.setVechicleName("DREAM YUGA");
                VI.setVechicleNo("MH30AR6534");
                VI.setMobileNo("9834167456");
                VI.setAddress("Akola");
                VI.setMailId("sam2219kg@gmail.com");
                db.addVehicleInfo(VI);
                Log.d("ECHALLAN APP DB" , "Vehicle Information "+ VI);
                info = "Full Name :"+ VI.getFullname()+"\n\n"+"Vehicle Name :"+VI.getVechicleName()+"\n\n"+"Vehicle Number :"+VI.getVechicleNo()
                        +"\n\n"+"Mobile Number :"+VI.getMobileNo()+"\n\n"+"Email ID :"+VI.getMailId()+"\n\n"+"Address :"+VI.getAddress();
                String search = searchVehicleNo.getText().toString();
                Log.d("CheckCondition", "User Entered Number "+ search);
                //String searchNo = VI.getVechicleNo();
                //Log.d("CheckCondition", "Object Vehicle Number "+ searchNo);
               //Log.d("CheckCondition", "CheckCondition"+ searchResult.compareTo(VI.getVechicleNo()));

                if(search.compareTo(VI.getVechicleNo())==0){
                    showdata.setText(info);
                }else {
                    Toast.makeText(DashBoard.this, "Not Found", Toast.LENGTH_SHORT).show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //searchVehicleNo.setText("");
                showdata.setText("");
            }
        });

        confirm_vehical_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this,penalty_Dashboard.class);
                startActivity(intent);


                //Intent intent = new Intent(getApplicationContext(),penalty_Dashboard.class);





            }
        });

    }
}