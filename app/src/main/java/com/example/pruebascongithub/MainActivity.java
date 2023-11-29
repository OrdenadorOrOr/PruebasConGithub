package com.example.pruebascongithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//TONTO EL QUE LO LEA
        btnSaludo = (Button) findViewById(R.id.btnSaludo);
        
        
        btnSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hola Bienvenido!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
