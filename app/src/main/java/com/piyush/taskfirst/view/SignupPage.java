package com.piyush.taskfirst.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.piyush.taskfirst.R;
import com.piyush.taskfirst.database.DatabaseHelper;
import com.piyush.taskfirst.database.UserDao;
import com.piyush.taskfirst.modals.DataModel;

public class SignupPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        EditText mFirstName,mLastName,mPassword;
        Button mRegistration;
        TextView mloginBtn;


        mFirstName=findViewById(R.id.firstname);
        mLastName=findViewById(R.id.lastname);
        mPassword=findViewById(R.id.password);

        mRegistration=findViewById(R.id.registerBtn);
        mloginBtn=findViewById(R.id.createtext);

        DatabaseHelper databaseHelper=DatabaseHelper.getDB(this);

        mloginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LoginPage.class));
            }
        });

        mRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String lastname=mLastName.getText().toString().trim();
                String password=mPassword.getText().toString().trim();
                final String firstname=mFirstName.getText().toString();


                databaseHelper.userDao().addTx(
                        new DataModel(firstname, lastname, password)
                );
            /*ArrayList<Details> arrDetails=(ArrayList<Details>) databaseHelper.detailsDao().getAllDetails();
            for(int i=0;i<arrDetails.size();i++){
                Log.d("Data","Fullname "+ arrDetails.get(i).getFullname()+"Email"+ arrDetails.get(i).getEmail()+"Password"+ arrDetails.get(i).getPassword()+"Phone"+ arrDetails.get(i).getPhone());
            }*/
                startActivity(new Intent(getApplicationContext(),UserHome.class));
            }
        });
    }
}