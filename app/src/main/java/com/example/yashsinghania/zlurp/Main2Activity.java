package com.example.yashsinghania.zlurp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.yashsinghania.zlurp.Restaurant.UnityPlayerActivity;

public class Main2Activity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.Company.Restaurant");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }
            }
        });
    }
}
