package com.techychirag.tutorial4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    public static final String Message="com.example.tutorial3.Message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view)
    {
        EditText Edittxtuser=findViewById(R.id.edtUsername);
        EditText Edittxtpass=findViewById(R.id.edtPassword);
        String Username=Edittxtuser.getText().toString();
        String Password=Edittxtpass.getText().toString();
        if(!Username.isEmpty() && !Password.isEmpty())
        {
            if(Patterns.EMAIL_ADDRESS.matcher(Username).matches())
            {
                Intent intent=new Intent(MainActivity.this,Welcome.class);
                intent.putExtra(Message, Username);
                startActivity(intent);
                finish();
            }
            else
            {
                Toast.makeText(this, "Please Enter Valid Username!...", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {

            Edittxtpass.requestFocus();
            Edittxtpass.setError("Please Enter Password");
            Edittxtuser.requestFocus();
            Edittxtuser.setError("Please Enter Username");
            //Toast.makeText(this, "Please Enter Username and Password!...", Toast.LENGTH_SHORT).show();
        }
    }
}