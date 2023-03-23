package com.piyush.taskfirst.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.piyush.taskfirst.R;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button b1,b2;
        EditText et1,et2;

            et1 = findViewById(R.id.et1);
            et2 = findViewById(R.id.et2);
            b1 = findViewById(R.id.b1);
            b2=findViewById(R.id.b2);
            b1.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    String n = et1.getText().toString().trim();
                    String p = et2.getText().toString().trim();
                    if (n.equals("Piyush") && p.equals("Singh")) {
                       Intent i = new Intent(LoginPage.this, UserHome.class);
                        startActivity(i);
                    } else {
                        Toast.makeText(LoginPage.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(LoginPage.this,SignupPage.class);
                    startActivity(i);
                }
            });
    }
}