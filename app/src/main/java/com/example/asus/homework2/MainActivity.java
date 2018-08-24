package com.example.asus.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        int a = v.getId();
        Button b = (Button)v;
        String buttonText = b.getText().toString();
//        int number = Integer.parseInt(buttonText);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.append(buttonText);
//        textView.setText(buttonText);
    }

    public void caculator(View v){
        TextView textView = (TextView)findViewById(R.id.textView);
        String input = textView.getText().toString();
        String regex = "\\D";
        String[] splitString = input.split(regex);

        TextView textView2 = (TextView)findViewById(R.id.textView2);
//        textView2.setText(splitString.length);
//        System.out.println(splitString[0]);

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        for (String element: splitString) {
            System.out.println(element);
        }

//        while (matcher.find()) {
////           add list operator
//
//        }
    }


}
