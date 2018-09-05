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
    public static double sum;
    public void onClick(View v) {
        Button b = (Button)v;
        String buttonText = b.getText().toString();
        TextView textView = (TextView)findViewById(R.id.textView);
        if (!buttonText.equals("="))
        {
            textView.append(buttonText);
        }
        String input = textView.getText().toString();
        String regex = "[\\+\\-\\*\\/\\=]";
        String[] splitString = input.split(regex);
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()) {
            int start = matcher.start();
            char operator = input.charAt(start);
            if (splitString.length == 2) {
                switch (operator) {
                    case '+':
                        sum = Double.parseDouble(splitString[0]) + Double.parseDouble(splitString[1]);
                        textView.setText(Double.toString(sum));
                        break;
                    case '-':
                        sum = Double.parseDouble(splitString[0]) - Double.parseDouble(splitString[1]);
                        textView.setText(Double.toString(sum));
                        break;
                    case '*':
                        sum = Double.parseDouble(splitString[0]) * Double.parseDouble(splitString[1]);
                        textView.setText(Double.toString(sum));
                        break;
                    case '/':
                        sum = Double.parseDouble(splitString[0]) / Double.parseDouble(splitString[1]);
                        textView.setText(Double.toString(sum));
                        break;
                }
                if (!buttonText.equals("="))
                {
                    textView.append(buttonText);
                }

            }
        }
    }

    public void onClickNumber(View v) {
        int a = v.getId();
        Button b = (Button)v;
        String buttonText = b.getText().toString();
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.append(buttonText);
    }

    public void onClickClear(View v) {
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("");
        sum = 0;
    }
}
