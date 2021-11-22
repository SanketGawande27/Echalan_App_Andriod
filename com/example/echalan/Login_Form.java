package com.example.echalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;


import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.example.echalan.model.Login;

public class Login_Form extends AppCompatActivity {
    //private Button dashboard;
    EditText username,password;
    private Button loginbtn;
    Login login = new Login();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginbtn = findViewById(R.id.login1);
        loginbtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                   if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                   Intent intent = new Intent(Login_Form.this, DashBoard.class);
                   startActivity(intent);
               }else{
                   Toast t = Toast.makeText(Login_Form.this,"Invalid Username and Password", Toast.LENGTH_SHORT);
                   t.show();
               }

            }
        });
    }
}