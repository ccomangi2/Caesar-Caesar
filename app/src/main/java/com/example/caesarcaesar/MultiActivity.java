package com.example.caesarcaesar;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MultiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_multi);

        Button amho = findViewById(R.id.amho);
        Button bokho = findViewById(R.id.bokho);

        EditText input = findViewById(R.id.input);
        EditText input2 = findViewById(R.id.input2);
    }
}
