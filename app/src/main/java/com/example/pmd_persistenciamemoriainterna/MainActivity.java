package com.example.pmd_persistenciamemoriainterna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText entradaTexto = (EditText) findViewById(R.id.editTextInf);
        Button BGuardar = (Button) findViewById(R.id.Bguardar);
        Button BRecuperar = (Button) findViewById(R.id.Brecuperar);
        TextView mostrarTexto = (TextView) findViewById(R.id.showtextView);

        BGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        BRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
}