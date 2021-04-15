package com.example.caesarcaesar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CaesarACtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caesar);

        Button amho = findViewById(R.id.amho);
        Button bokho = findViewById(R.id.bokho);

        EditText input = findViewById(R.id.input);

    }
}
