package com.example.yashsinghania.zlurp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main3Activity extends AppCompatActivity {

    private Button  button2;
    private RadioButton radioButton5,radioButton6,radioButton7,radioButton8,radioButton9,radioButton10;
    private RadioGroup cuisine,diet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        cuisine = (RadioGroup)findViewById(R.id.cuisine);
        diet = (RadioGroup)findViewById(R.id.diet);
        radioButton9 = (RadioButton) findViewById(R.id.radioButton9);
        radioButton10 = (RadioButton)findViewById(R.id.radioButton10);
        button2 = (Button)findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioButton9.isChecked()) {
                    Intent in2 = new Intent(Main3Activity.this, Main4Activity.class);
                    startActivity(in2);
                } else {
                    Intent in = new Intent(Main3Activity.this, Main2Activity.class);
                    startActivity(in);
                }
            }
        });
    }
}

