package com.example.studente.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;
import de.congrace.exp4j.UnknownFunctionException;
import de.congrace.exp4j.UnparsableExpressionException;

public class FinalCalculadoraActivity extends AppCompatActivity {

    private Button bf0;
    private Button bf1;
    private Button bf2;
    private Button bf3;
    private Button bf4;
    private Button bf5;
    private Button bf6;
    private Button bf7;
    private Button bf8;
    private Button bf9;

    private Button bfpiu;
    private Button bfmen;
    private Button bfper;
    private Button bfdiv;
    private Button bfris;

    private Button bfpun;

    private TextView tvfris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_calculadora);

        bf0 = (Button) findViewById(R.id.BF0);
        bf1 = (Button) findViewById(R.id.BF1);
        bf2 = (Button) findViewById(R.id.BF2);
        bf3 = (Button) findViewById(R.id.BF3);
        bf4 = (Button) findViewById(R.id.BF4);
        bf5 = (Button) findViewById(R.id.BF5);
        bf6 = (Button) findViewById(R.id.BF6);
        bf7 = (Button) findViewById(R.id.BF7);
        bf8 = (Button) findViewById(R.id.BF8);
        bf9 = (Button) findViewById(R.id.BF9);

        bfpiu = (Button) findViewById(R.id.BFPIU);
        bfmen = (Button) findViewById(R.id.BFMEN);
        bfper = (Button) findViewById(R.id.BFPER);
        bfdiv = (Button) findViewById(R.id.BFDIV);
        bfris = (Button) findViewById(R.id.BFRIS);

        bfpun = (Button)findViewById(R.id.BFPUN);

        tvfris = (TextView)findViewById(R.id.TVFRIS);


        bf0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "0");
            }
        });

        bf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "1");
            }
        });

        bf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "2");
            }
        });

        bf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "3");
            }
        });

        bf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "4");
            }
        });

        bf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "5");
            }
        });

        bf6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "6");
            }
        });

        bf7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "7");
            }
        });

        bf8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "8");
            }
        });

        bf9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "9");
            }
        });

        bfpiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "+");
            }
        });

        bfmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "-");
            }
        });

        bfper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "*");
            }
        });

        bfdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + "/");
            }
        });

        bfpun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "" + tvfris.getText();
                tvfris.setText(s + ".");
            }
        });

        bfris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String calcs = (String) tvfris.getText();
                Calculable exp = null;
                try {
                    exp = new ExpressionBuilder(calcs).build();
                } catch (UnknownFunctionException e) {
                    e.printStackTrace();
                } catch (UnparsableExpressionException e) {
                    e.printStackTrace();
                }
                double fris = exp.calculate();
                String sfris = Double.toString(fris);
                ;
                tvfris.setText(sfris);
            }
        });
    }

}
