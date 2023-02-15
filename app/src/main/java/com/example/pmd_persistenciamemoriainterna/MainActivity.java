package com.example.pmd_persistenciamemoriainterna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText entradaTexto = (EditText) findViewById(R.id.editTextInf);
        Button BGuardar = (Button) findViewById(R.id.Bguardar);
        Button BRecuperar = (Button) findViewById(R.id.Brecuperar);
        TextView mostrarTexto = (TextView) findViewById(R.id.showtextView);
        String sdEstado = Environment.getExternalStorageState();


        BGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sdEstado.equals(Environment.MEDIA_MOUNTED){

                    try {
                        File rutaSD = Environment.getExternalStorageDirectory();
                        File miFichero = new File(rutaSD.getAbsolutePath(),"pruebaSD.txt");
                        OutputStreamWriter outputStreamWriter = null;
                        outputStreamWriter = new OutputStreamWriter(new FileOutputStream(miFichero));
                        outputStreamWriter.write(String.valueOf(entradaTexto.getText()));
                        outputStreamWriter.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        });

        BRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
}