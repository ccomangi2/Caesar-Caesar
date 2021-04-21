package com.example.caesarcaesar;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CaesarACtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_caesar);

        Button amho = findViewById(R.id.amho);
        Button bokho = findViewById(R.id.bokho);

        final EditText input = findViewById(R.id.input);
        final EditText input2 = findViewById(R.id.input2);

        final TextView text = findViewById(R.id.text);

        amho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Caesar c = new Caesar();
                int key = Integer.parseInt(input.getText().toString());
                c.solution(input2.getText().toString(), key, text);
            }
        });
        bokho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
