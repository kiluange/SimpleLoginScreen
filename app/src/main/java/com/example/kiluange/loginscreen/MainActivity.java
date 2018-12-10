package com.example.kiluange.loginscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        final EditText email = findViewById(R.id.emailText);
        final EditText password = findViewById(R.id.passwordText);

        Button button = findViewById(R.id.loginButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("teste") && password.getText().toString().equals("teste")){
                    Toast.makeText(MainActivity.super.getApplicationContext(), R.string.login,Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.super.getApplicationContext(), R.string.login_error,Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
