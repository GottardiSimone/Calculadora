package com.example.studente.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class OptionActivity extends AppCompatActivity {

    private ImageButton boback;
    private EditText getCode;
    private TextView viewCode;
    private Button bok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        boback = (ImageButton) findViewById(R.id.BOBACK);
        bok = (Button) findViewById(R.id.BCODE);
        viewCode = (TextView) findViewById(R.id.VIEWCODE);
        getCode = (EditText) findViewById(R.id.GETCODE);

        boback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        getCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String newString = userName1.getText().toString();
            }
        });

        bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String scode = getCode.getText().toString();
                int ncode = Integer.parseInt(scode);
                if(ncode==1510){
                    viewCode.setText("-> 753 <-");
                }
            }
        });

    }
}
