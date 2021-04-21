package com.example.caesarcaesar;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Single {
    //암호화
    public static void amho(ArrayList<Integer> sub, char plain[], TextView t) {
        Collections.shuffle(sub);
        char cipher_arr[] = new char[plain.length];

        for (int i = 0; i < plain.length ; i++){
            int word = sub.get(plain[i]-65);
            cipher_arr[i] = (char)word;
        }
        String cipher_text = String.valueOf(cipher_arr);
        t.setText(cipher_text);
    }
}
