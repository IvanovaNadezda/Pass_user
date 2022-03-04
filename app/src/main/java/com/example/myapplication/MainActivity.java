package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    public static final String USER = "test";
    public static final String PASS = "123";
    private ActivityMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        bind=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        bind.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((bind.login.getText().toString().equals(USER))&&(bind.password.getText().toString().equals(PASS))){
                    bind.result.setText(R.string.correct);
                    bind.result.setTextColor(Color.GREEN);
                    bind.login.setText("");
                    bind.password.setText("");
                }
                else {
                    bind.result.setText(R.string.notcorrect);
                    bind.result.setTextColor(Color.RED);
                    bind.login.setText("");
                    bind.password.setText("");
                }
            }
        });
    }
}