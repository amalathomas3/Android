package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText result;
    Button one,two,three,four,five,six,seven,eight,nine,zero,add,mul,sub,equal,clear,div,dot;
    String sign,text;
    Double sum=0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(EditText) findViewById(R.id.a);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        dot = (Button) findViewById(R.id.dot);

        equal = (Button) findViewById(R.id.equal);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        div = (Button) findViewById(R.id.div);
        mul = (Button) findViewById(R.id.mul);
        clear = (Button) findViewById(R.id.clear);


        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        dot.setOnClickListener(this);




        clear.setOnClickListener(this);
        sub.setOnClickListener(this);
        add.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);
        equal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        text = result.getText().toString();
        if(v.getId() == R.id.zero)
            result.setText(text + "0");
        if (v.getId() == R.id.one)
            result.setText(text + "1");
         if (v.getId() == R.id.two)
            result.setText(text + "2");
         if (v.getId() == R.id.three)
            result.setText(text + "3");
         if (v.getId() == R.id.four)
            result.setText(text + "4");
         if (v.getId() == R.id.five)
            result.setText(text + "5");
         if (v.getId() == R.id.six)
            result.setText(text + "6");
         if (v.getId() == R.id.seven)
            result.setText(text + "7");
         if (v.getId() == R.id.eight)
            result.setText(text + "8");
         if (v.getId() == R.id.nine)
            result.setText(text + "9");
        if (v.getId() == R.id.dot)
            result.setText(text + ".");
         if (v.getId() == R.id.add) {
             sign = "+";
             sum = Double.valueOf(result.getText().toString());
             result.setText("");
         }
         if (v.getId() == R.id.sub) {
             sign = "-";
             sum = Double.valueOf(result.getText().toString());
             result.setText("");
         }
         if (v.getId() == R.id.mul) {
             sign = "*";
             sum = Double.valueOf(result.getText().toString());
             result.setText("");
         }
         if (v.getId() == R.id.div) {
             sign = "/";
             sum = Double.valueOf(result.getText().toString());
             result.setText("");
         }
         if (v.getId() == R.id.equal) {
             if (sign.equals("-")) {
                 sum = sum - Float.valueOf(result.getText().toString());
                 result.setText(String.valueOf(sum));
                 sum =0.0;
             } else if (sign.equals("+")) {
                 sum = sum + Float.valueOf(result.getText().toString());
                 result.setText(String.valueOf(sum));
                 sum = 0.0;
             } else if (sign.equals("*")) {
                 sum = sum * Float.valueOf(result.getText().toString());
                 result.setText(String.valueOf(sum));
                 sum = 0.0;
             } else if (sign.equals("/")) {
                 sum = sum / Float.valueOf(result.getText().toString());
                 result.setText(String.valueOf(sum));
                 sum = 0.0;
             }

         }
         if(v.getId() == R.id.clear)
             result.setText("");

    }
}

