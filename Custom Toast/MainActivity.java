package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sp;
    EditText uname, pwd;
    Button register;
    String a, b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = getSharedPreferences("Mypref", MODE_PRIVATE);
        uname = (EditText) findViewById(R.id.uname);
        pwd = (EditText) findViewById(R.id.pwd);
        register = (Button) findViewById(R.id.register);

        register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        SharedPreferences.Editor editor = sp.edit();

        a = uname.getText().toString();
        b = pwd.getText().toString();

        editor.putString("Username", a);
        editor.putString("Password", b);
        editor.apply();

        Toast.makeText(this, "Registration successful", Toast.LENGTH_LONG).show();
        startActivity(new Intent(this, SecondActivity.class));

    }
}
