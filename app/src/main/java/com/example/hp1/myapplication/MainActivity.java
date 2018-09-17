package com.example.hp1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button compute;
    EditText etheight;
    EditText etweight;
   TextView bminum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compute = (Button) findViewById(R.id.compute);
        compute.setOnClickListener(this);
        etheight = (EditText) findViewById(R.id.height);
        etweight = (EditText) findViewById(R.id.weight);
        bminum = (TextView)findViewById(R.id.bmibum);
    }

    @Override
    public void onClick(View v) {
        if (v == compute) {

            String height = etheight.getText().toString();
            String weight = etweight.getText().toString();
            if (height.equals("") || weight.equals("")) {
                Toast.makeText(this,"Empty height or wight",Toast.LENGTH_SHORT);
            } else {
                double h = Double.parseDouble(height);
                double w = Double.parseDouble(weight);
               double bmi=w/(h*h);
                bminum.setText(bmi+"");
            }
        }
    }
}