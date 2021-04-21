package com.example.caesarcaesar;

import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Caesar {
    public String amho(String s, int n, TextView e) {
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
    public String bokho(String s, int n, TextView e) {
        String answer = "";
        int z = (int)'z';
        int Z = (int)'Z';
        int a = (int)'a';
        int A = (int)'A';
        char[] temp = s.toCharArray();

        for(int i =0; i<temp.length; i++){
            if(temp[i]>=a&& temp[i]<=z){
                //소문자인경우
                temp[i] = (char)(z + (temp[i]-z-n)%26);
            }else if(temp[i]>=A&& temp[i]<=Z){
                //대문자인경우
                temp[i] = (char)(Z + (temp[i]-Z-n)%26);
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
