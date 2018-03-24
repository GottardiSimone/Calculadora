package com.example.studente.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button bvirg;
    private Button bc;
    private Button bpiu;
    private Button bmeno;
    private Button bper;
    private Button bdiv;
    private Button bperc;
    private Button bris;
    private Button bopc;
    private Button bsecret;
    private TextView ris;

    private String strNum1;
    private String strNum2;
    private int priorita=1; //1 -> primo numero; 2 -> secondo numero
    private int operatore=0; //1+ 2- 3x 4: 5%

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.B0);
        b1 = (Button) findViewById(R.id.B1);
        b2 = (Button) findViewById(R.id.B2);
        b3 = (Button) findViewById(R.id.B3);
        b4 = (Button) findViewById(R.id.B4);
        b5 = (Button) findViewById(R.id.B5);
        b6 = (Button) findViewById(R.id.B6);
        b7 = (Button) findViewById(R.id.B7);
        b8 = (Button) findViewById(R.id.B8);
        b9 = (Button) findViewById(R.id.B9);
        bvirg = (Button)findViewById(R.id.BVIRG);
        bc = (Button) findViewById(R.id.BC);
        bperc = (Button) findViewById(R.id.BPERC);
        bpiu = (Button) findViewById(R.id.BPIU);
        bmeno = (Button) findViewById(R.id.BMENO);
        bper = (Button) findViewById(R.id.BPER);
        bdiv = (Button) findViewById(R.id.BDIV);
        bris = (Button) findViewById(R.id.BRIS);
        ris = (TextView)findViewById(R.id.CALC);
        bopc = (Button)findViewById(R.id.BOPCIONES);
        bsecret = (Button) findViewById(R.id.B);

        //Log.i("botton",bsecret.toString());

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + ris.getText();
                ris.setText(s + "0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + ris.getText();
                ris.setText(s + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + ris.getText();
                ris.setText(s + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + ris.getText();
                ris.setText(s + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + ris.getText();
                ris.setText(s + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + ris.getText();
                ris.setText(s + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + ris.getText();
                ris.setText(s + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + ris.getText();
                ris.setText(s + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + ris.getText();
                ris.setText(s + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + ris.getText();
                ris.setText(s + "9");
            }
        });

        bvirg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Reservado para usuarios pagados" , Toast.LENGTH_SHORT ).show();
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ris.setText("");
            }
        });

        bperc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Reservado para usuarios pagados" , Toast.LENGTH_SHORT ).show();
            }
        });

        bpiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(priorita==1){
                    strNum1 = ris.getText().toString();
                    priorita = 2;
                    operatore = 1;
                }
                ris.setText("");
            }
        });

        bmeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(priorita==1){
                    strNum1 = ris.getText().toString();
                    priorita = 2;
                    operatore = 2;
                }
                ris.setText("");
            }
        });

        bper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(priorita==1){
                    strNum1 = ris.getText().toString();
                    priorita = 2;
                    operatore = 3;
                }
                ris.setText("");
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(priorita==1){
                    strNum1 = ris.getText().toString();
                    priorita = 2;
                    operatore = 4;
                }
                ris.setText("");
            }
        });

        bris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = 0;
                if(priorita == 2 && operatore == 1) {
                    strNum2 = ris.getText().toString();
                    int n1 = Integer.parseInt(strNum1);
                    int n2 = Integer.parseInt(strNum2);
                    res = n1 + n2;
                }
                if(priorita == 2 && operatore == 2) {
                    strNum2 = ris.getText().toString();
                    int n1 = Integer.parseInt(strNum1);
                    int n2 = Integer.parseInt(strNum2);
                    res = n1 - n2;
                }
                if(priorita == 2 && operatore == 3) {
                    strNum2 = ris.getText().toString();
                    int n1 = Integer.parseInt(strNum1);
                    int n2 = Integer.parseInt(strNum2);
                    res = n1 * n2;
                }
                if(priorita == 2 && operatore == 4) {
                    strNum2 = ris.getText().toString();
                    int n1 = Integer.parseInt(strNum1);
                    int n2 = Integer.parseInt(strNum2);
                    res = n1 / n2;
                }
                String strRis = String.valueOf(res);
                ris.setText(strRis);
                if(priorita == 1) {
                    ris.setText("");
                }
                priorita = 1;
                operatore = 0;
            }
        });

        bsecret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = ris.getText().toString();
                int n = Integer.parseInt(str);
                switch (n) {
                    case 753:
                        Intent code = new Intent(MainActivity.this, CodeActivity.class);
                        startActivity(code);
                        break;
                    case 357:
                        Intent converter = new Intent(MainActivity.this, ConverterActivity.class);
                        startActivity(converter);
                        break;
                }
            }
        });

        bopc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent opt = new Intent(MainActivity.this,OptionActivity.class);
                startActivity(opt);
            }
        });
    }
}
