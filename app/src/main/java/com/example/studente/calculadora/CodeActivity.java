package com.example.studente.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class CodeActivity extends AppCompatActivity {

    private ImageButton boback;
    private TextView killAppWarn;
    private TextView bWhat;
    private EditText getPCode;
    private Button bpcok;
    int nError = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        boback = (ImageButton) findViewById(R.id.BOBACK);
        killAppWarn = (TextView) findViewById(R.id.KAW);
        bWhat = (TextView) findViewById(R.id.BWHAT);
        getPCode = (EditText) findViewById(R.id.GETPCODE);
        bpcok = (Button) findViewById(R.id.BPCOK);

        bpcok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strCode = getPCode.getText().toString();
                int finalCode = Integer.parseInt(strCode);
                if(finalCode == 10848){
                    Intent finalCalculadora = new Intent(CodeActivity.this,FinalCalculadoraActivity.class);
                    startActivity(finalCalculadora);
                }
                else{
                    Toast.makeText(getBaseContext(), "E R R O R" , Toast.LENGTH_SHORT ).show();
                    killAppWarn.setText("YOU CAN'T GO WRONG ANYMORE");
                    bWhat.setText("?????");
                    nError ++;
                    if(nError == 2){
                        int X = 1/0;
                    }
                }
            }
        });

        boback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nError<1){
                    finish();
                }
            }
        });
    }
}
