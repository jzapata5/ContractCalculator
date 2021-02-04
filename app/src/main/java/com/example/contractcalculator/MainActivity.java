package com.example.contractcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initCalculateButton();
    }


    private void initCalculateButton() {
        Button calculateButton = findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                //double taxrate = .05;

                EditText labor = (EditText)findViewById(R.id.editLaborText);
                EditText material = (EditText)findViewById(R.id.editMaterialText);
                TextView subtotalDisplay = findViewById(R.id.subtotalDisplay);
                TextView totalDisplay = findViewById(R.id.totalDisplay);
                TextView taxDisplay = findViewById(R.id.taxDisplayText);

                double subtotal = (Double.parseDouble(labor.getText().toString())) +
                        (Double.parseDouble(material.getText().toString()));
                double tax = subtotal * .05;
                double total = tax + subtotal;

                subtotalDisplay.setText(String.format("$%.2f",subtotal));
                taxDisplay.setText(String.format("$%.2f", tax));
                totalDisplay.setText(String.format("$%.2f",total));

            }
        });
    }

}






