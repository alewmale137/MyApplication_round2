package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pushButton = findViewById(R.id.push_button);
        pushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t1 = Toast.makeText(MainActivity.this,"You push!!!!!",Toast.LENGTH_LONG);
                t1.show();
                Toast t2 = Toast.makeText(MainActivity.this,"Run!!!!",Toast.LENGTH_SHORT);
                t2.show();
            }
        });

    }
}
