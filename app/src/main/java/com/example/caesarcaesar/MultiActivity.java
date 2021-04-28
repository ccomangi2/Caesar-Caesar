package com.example.caesarcaesar;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

public class MultiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_multi);

        Button amho = findViewById(R.id.amho);
        Button bokho = findViewById(R.id.bokho);
        Button copy = findViewById(R.id.copy);

        final EditText input = findViewById(R.id.input);
        final EditText input2 = findViewById(R.id.input2);

//        input.setFilters(new InputFilter[] {filter});
//        input2.setFilters(new InputFilter[] {filter});

        final TextView text = findViewById(R.id.text);
        final Multi multi = new Multi();

        amho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multi.amho(input.getText().toString(), input2.getText().toString(), text);
            }
        });
        bokho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multi.bokho(input.getText().toString(), input2.getText().toString(), text);
            }
        });
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //클립보드 사용 코드
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("ID", text.getText().toString()); //클립보드에 ID라는 이름표로 id 값을 복사하여 저장
                clipboardManager.setPrimaryClip(clipData);

                //복사가 되었다면 토스트메시지 노출
                Toast.makeText(getApplicationContext(),"클립보드에 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
//    protected InputFilter filter= new InputFilter() {
//        public CharSequence filter(CharSequence source, int start, int end,
//                                   Spanned dest, int dstart, int dend) {
//            Pattern ps = Pattern.compile("^[a-zA-Z0-9]+$");
//            if (!ps.matcher(source).matches()) {
//                return "";
//            }
//            return null;
//        }
//    };
}
