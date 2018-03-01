package com.example.yashsinghania.zlurp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    private Button lite_proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        lite_proceed = (Button)findViewById(R.id.lite_proceed);

        lite_proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(Main4Activity.this,Main2Activity.class);
                startActivity(in1);
            }
        });
    }
}
