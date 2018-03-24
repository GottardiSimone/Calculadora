package com.example.studente.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ConverterActivity extends AppCompatActivity {

    private ImageButton boback;
    private Button bConv;
    private TextView viewConv;
    private EditText getNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        boback = (ImageButton) findViewById(R.id.BOBACK);
        bConv = (Button) findViewById(R.id.BCONV);
        viewConv = (TextView) findViewById(R.id.VIEWNUM);
        getNum = (EditText) findViewById(R.id.GETNUM);

        bConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sConv = getNum.getText().toString();
                int nDecConv = Integer.parseInt(sConv);
                String nHexConv = Integer.toHexString(nDecConv);
                viewConv.setText(nHexConv);
            }
        });

        boback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
