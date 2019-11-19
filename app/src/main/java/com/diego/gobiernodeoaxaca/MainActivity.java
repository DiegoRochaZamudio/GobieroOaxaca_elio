package com.diego.gobiernodeoaxaca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText edTxt1, edTxt2;
    private Button generar;
    private RadioButton viuda, otro;
    private TextView totalH, totalHE, viudez, subsidioTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTxt1 = (EditText) findViewById(R.id.edTxt1);
        edTxt2 = (EditText)findViewById(R.id.edTxt2);
        generar = (Button)findViewById(R.id.btn1);
        viuda = (RadioButton)findViewById(R.id.rButton1);
        otro = (RadioButton)findViewById(R.id.rButton2);
        totalH = (TextView) findViewById(R.id.totalHijos);
        totalHE = (TextView) findViewById(R.id.hijosEscolares);
        viudez = (TextView) findViewById(R.id.viudez);
        subsidioTotal = (TextView) findViewById(R.id.subsidioTotal);


        generar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                generar_Subsidio();
            }
        });



    }

    public void generar_Subsidio(){

        int nHijos, nHijosEscolares;
        double sub1, sub2, sub3, subTotal;

        String numHijos = edTxt1.getText().toString();
        nHijos = Integer.parseInt(numHijos);

        String numHijosEscolares = edTxt2.getText().toString();
        nHijosEscolares = Integer.parseInt(numHijosEscolares);

        if (nHijos <= 2){
            sub1= 1700;

        }else if (nHijos <= 5){
            sub1 = 1900;
        }else
            sub1 = 1200;


        sub2 = nHijosEscolares * 1200;

        sub3 = 0;

        if(viuda.isChecked() == true){
            sub3 = 800;
        }

        subTotal = sub1 + sub2 + sub3;

        totalH.setText("Monto por total de hijos: " + sub1);
        totalHE.setText("Monto por hijos en edad escolar: " + sub2);
        viudez.setText("Monto por viudez: " + sub3);
        subsidioTotal.setText("Subsidio Total: " +subTotal);
    }
}
