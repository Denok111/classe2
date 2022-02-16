package com.example.compitoclasse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    Gestorebrani gb;

    EditText txtTitolo = (EditText)findViewById(R.id.editText);
    Button btnInserisci = (Button)findViewById(R.id.button);
    Spinner spnGenere = (Spinner)findViewById(R.id.spinner);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gestorebrani newGestoreBrani;
        gb = new Gestorebrani();


        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gb.addBrano();

            }
        });

    }
}