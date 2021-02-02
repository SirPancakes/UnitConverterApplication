package com.example.unitconverterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView tempNum1, tempNum2;
    private Spinner spinnerTemp1, spinnerTemp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempNum1 = findViewById(R.id.editTempNumber1);
        tempNum2 = findViewById(R.id.editTempNumber2);
        spinnerTemp1 = findViewById(R.id.spinnerTemp1);
        spinnerTemp2 = findViewById(R.id.spinnerTemp2);
    }

    public void converted(View view) {
        String valueEntered1 = tempNum1.getText().toString();
        String valueEntered2 = tempNum2.getText().toString();


        if (spinnerTemp1.getSelectedItem().equals("Celsius") && spinnerTemp2.getSelectedItem().equals("Fahrenheit")) {
            double celsius = Double.parseDouble(valueEntered1);
            double fahrenheit = (celsius * (9/5)) + 32;
            tempNum2.setText("" + fahrenheit);


            Toast.makeText(this, "Converted", Toast.LENGTH_SHORT).show();
        }

        else if (spinnerTemp1.getSelectedItem().equals("Fahrenheit") && spinnerTemp2.getSelectedItem().equals("Celsius")) {
            double fahrenheit = Double.parseDouble(valueEntered1);
            double celsius = fahrenheit - 32 * 5/9;
            tempNum2.setText("" + celsius);


            Toast.makeText(this, "Converted", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Both can't be the same unit! Please change the other unit", Toast.LENGTH_SHORT).show();
        }
    }







/*        if (spinnerTemp1.getSelectedItem().equals("Celsius") && spinnerTemp2.getSelectedItem().equals("Fahrenheit")) {
            double celsius = Double.parseDouble(valueEntered1);
            double fahrenheit = (celsius * (9/5)) + 32;
            tempNum2.setText("" + fahrenheit + "°");


            Toast.makeText(this, "Converted", Toast.LENGTH_SHORT).show();
        }

        else if (spinnerTemp1.getSelectedItem().equals("Fahrenheit") && spinnerTemp2.getSelectedItem().equals("Celsius")) {
            double fahrenheit = Double.parseDouble(valueEntered1);
            double celsius = fahrenheit - 32 * 5/9;
            tempNum2.setText("" + celsius + "°");


            Toast.makeText(this, "Converted", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Both can't be the same unit! Please change the other unit", Toast.LENGTH_SHORT).show();
        }

        */






/*
            spinnerTemp2.equals("Fahrenheit");

            if (spinnerTemp2.equals("Fahrenheit")) {
                /*
            }

        } else if (spinnerTemp1.equals("Fahrenheit")) {
            double fahrenheit = Double.parseDouble(valueEntered1);
            spinnerTemp2.equals("Celsius");

            if (spinnerTemp2.equals("Celsius")) {
                double celsius = (fahrenheit - 32) * (5 / 9);
                tempNum2.setText("" + celsius + "°");
            }
        }
*/

    /*public void convert() {
        String valueEntered = tempNum1.getText().toString();
    }*/


}