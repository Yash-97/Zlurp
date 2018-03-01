package com.example.yashsinghania.zlurp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private EditText pass,username;
    private int flag=0;
    private String us,pa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button)findViewById(R.id.login);
        pass = (EditText)findViewById(R.id.pass);
        username = (EditText)findViewById(R.id.username);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                us = username.getText().toString();
                pa = pass.getText().toString();
                if(us.equals("Yash") && pa.equals("login"))
                    flag=1;
                else
                    Toast.makeText(getApplicationContext(),"Wrong Login",Toast.LENGTH_SHORT).show();
                if(flag==1)
                {
                    Intent i=new Intent(MainActivity.this,Main3Activity.class);
                    Toast.makeText(getApplicationContext(),"Login successful",Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }
            }
        });

    }
}
