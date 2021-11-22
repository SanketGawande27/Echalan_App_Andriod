package com.example.echalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.echalan.data.MyDBHandler;
import com.example.echalan.model.Login;
import com.example.echalan.model.VehicleInfo;

public class MainActivity extends AppCompatActivity {
    private Button signupbtn;
    private Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //login db files set
        MyDBHandler db = new MyDBHandler(MainActivity.this);
        //Adding COntents in Login Table
        //Login login = new Login();
        //login.setUsername("sanket11");
        //login.setPassword("0000");
        //db.addLogin(login);
        //end filed

        loginbtn = findViewById(R.id.login);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Login_Form.class);
                startActivity(intent);
            }
        });

    }


}