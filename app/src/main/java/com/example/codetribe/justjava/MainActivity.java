package com.example.codetribe.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtViewDisplay;
    private Button btnDecrement, btnIncrement;
    private CheckBox chkEspresso,chkLongB,chkLongMacchiato,chkCaffeL,chkRistretto,chkShortMacchiato;
    private int quantity = 0;
    private String list = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDecrement = (Button) findViewById(R.id.btnDecrement);
        btnIncrement = (Button) findViewById(R.id.btnIncrement);
        txtViewDisplay = (TextView) findViewById(R.id.textView_quantity);
        chkCaffeL = (CheckBox) findViewById(R.id.chkLatte);
        chkEspresso = (CheckBox) findViewById(R.id.chkEspres);
        chkLongB = (CheckBox) findViewById(R.id.chkLBlack);
        chkLongMacchiato = (CheckBox) findViewById(R.id.chkLMacchiato);
        chkRistretto = (CheckBox) findViewById(R.id.chkRistretto);
        chkShortMacchiato = (CheckBox) findViewById(R.id.chkSMacchiato);
    }

    public void increment(View view)
    {
        quantity ++;
        txtViewDisplay.setText(""+quantity);
    }

    public void decrement(View view)
    {
        if(quantity > 0)
        {
            quantity --;
            txtViewDisplay.setText(""+quantity);
        }

    }

    public void order(View view)
    {
        if(chkEspresso.isChecked())
        {
            list = list + chkEspresso.getText() + ", ";
        }
        if(chkShortMacchiato.isChecked())
        {
            list = list + chkShortMacchiato.getText() + ", ";
        }
        if(chkLongMacchiato.isChecked())
        {
            list = list + chkLongMacchiato.getText() + ", ";
        }
        if(chkRistretto.isChecked())
        {
            list = list + chkRistretto.getText() + ", ";
        }
        if(chkCaffeL.isChecked())
        {
            list = list + chkCaffeL.getText() + ", ";
        }
        if(chkLongB.isChecked())
        {
            list = list + chkLongB.getText() + ", ";
        }

        Toast.makeText(this,quantity + " " + list +  " orderd",Toast.LENGTH_LONG).show();
        list = "";
    }
}
