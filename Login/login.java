package com.example.login;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText user, pwd;
    String u = "android";
    String p = "123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void verify(View v){
         if (v.getId()==R.id.button){
            user = (EditText) findViewById(R.id.username);
            pwd = (EditText) findViewById(R.id.password);
            String a = user.getText().toString();
            String b = pwd.getText().toString();
            if (a.equals(u) && b.equals(p))
                Toast.makeText(this, "LOGIN SUCESSFULLY", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this, "INVALID ID OR PASSWORD", Toast.LENGTH_LONG).show();
        }
    }
}

