package com.example.shift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button btn_login;
    private EditText edit_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
    }

    private void find(){
        btn_login = (Button) findViewById(R.id.btn_login);
        edit_email = (EditText) findViewById(R.id.edit_email);
    }


    public void listener(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}