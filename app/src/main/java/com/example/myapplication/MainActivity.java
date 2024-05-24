package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText user, password;

    private Button buttonI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        user = findViewById(R.id.user);
        password = findViewById(R.id.password);
        buttonI = findViewById(R.id.buttonI);


        buttonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 =user.getText().toString();
                String v2 =password.getText().toString();

                if (v1.equals("") && v2.equals("")) {
                    Toast.makeText(MainActivity.this, "Tiene que llenar los campos", Toast.LENGTH_LONG).show();
                }else {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}