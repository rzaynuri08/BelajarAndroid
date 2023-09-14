package com.example.belajargit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
Button btnLogin;
private EditText edtName, edtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        edtName = findViewById(R.id.edtName);
        edtPass = findViewById(R.id.edtPass);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_payment);
                Intent intent = new Intent(Login.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    public void actionSubmit(View view) {
        String name  = edtName.getText().toString();
        String pass = edtPass.getText().toString();
        Toast.makeText(this, "hallo "+name+"\n password kamu adalah "+pass, Toast.LENGTH_LONG).show();
    }
}