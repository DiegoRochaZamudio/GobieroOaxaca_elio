package com.diego.gobiernodeoaxaca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText numHijos, numHijosEscolares;
    private Button generar;
    private RadioButton viuda, otro;
    private TextView totalH, totalHE, viudez, subsidioTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numHijos = (EditText)findViewById(R.id.edTxt1);
        numHijosEscolares = (EditText)findViewById(R.id.edTxt2);
        generar = (Button)findViewById(R.id.btn1);
        viuda = (RadioButton)findViewById(R.id.rButton1);
        otro = (RadioButton)findViewById(R.id.rButton2);
        totalH = (TextView) findViewById(R.id.totalHijos);
        totalHE = (TextView) findViewById(R.id.hijosEscolares);
        viudez = (TextView) findViewById(R.id.viudez);
        subsidioTotal = (TextView) findViewById(R.id.subsidioTotal);
    }
}
