package com.example.caesarcaesar;

import android.widget.EditText;
import android.widget.TextView;

public class Caesar {
    public String solution(String s, int n, TextView e) {
        String answer = "";
        int z = (int)'z';
        int Z = (int)'Z';
        int a = (int)'a';
        int A = (int)'A';
        char[] temp = s.toCharArray();

        for(int i =0; i<temp.length; i++){
            if(temp[i]>=a&& temp[i]<=z){
                //소문자인경우
                temp[i] = (int)temp[i]+n > z ? (char)(a+(int)temp[i]+n-z-1) : (char)((int)temp[i]+n);
            }else if(temp[i]>=A&& temp[i]<=Z){
                //대문자인경우
                temp[i] = (int)temp[i]+n > Z ? (char)(A+(int)temp[i]+n-Z-1) : (char)((int)temp[i]+n);
            }else{
                //공백
                temp[i]=temp[i];
            }
        }
        answer = new String(temp);
        e.setText(answer);
        return answer;
    }
}
