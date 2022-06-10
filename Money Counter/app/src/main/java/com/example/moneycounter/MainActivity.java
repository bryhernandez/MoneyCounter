package com.example.moneycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.w3c.dom.Text;

import java.io.FileFilter;

public class MainActivity extends AppCompatActivity {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int pennyCount = 0;
    int nickelCount = 0;
    int dimeCount = 0;
    int quarterCount = 0;
    int dollarCount = 0;
    int twoCount = 0;
    int fiveCount = 0;
    int tenCount = 0;
    int twentyCount = 0;
    int fiftyCount = 0;
    int hundredCount = 0;

    double total = 0;


    public void reset(View view){
        pennyCount = 0;
        nickelCount = 0;
        dimeCount = 0;
        quarterCount = 0;
        dollarCount = 0;
        twoCount = 0;
        fiveCount = 0;
        tenCount = 0;
        twentyCount = 0;
        fiftyCount = 0;
        hundredCount = 0;

        total = 0;
    }

    public void displayTotal(View view){
        EditText pennyVal = findViewById(R.id.pennyVal);
        EditText nickelVal = findViewById(R.id.nickelVal);
        EditText dimeVal = findViewById(R.id.dimeVal);
        EditText quarterVal = findViewById(R.id.quarterVal);
        EditText oneVal = findViewById(R.id.oneVal);
        EditText twoVal = findViewById(R.id.twoVal);
        EditText fiveVal = findViewById(R.id.fiveVal);
        EditText tenVal = findViewById(R.id.tenVal);
        EditText twentyVal = findViewById(R.id.twentyVal);
        EditText fiftyVal = findViewById(R.id.fiftyVal);
        EditText hundredVal = findViewById(R.id.hundredVal);

        if(!pennyVal.getText().toString().matches(""))
            pennyCount = Integer.parseInt(pennyVal.getText().toString());
        if(!nickelVal.getText().toString().matches(""))
            nickelCount = Integer.parseInt(nickelVal.getText().toString());
        if(!dimeVal.getText().toString().matches(""))
            dimeCount = Integer.parseInt(dimeVal.getText().toString());
        if(!quarterVal.getText().toString().matches(""))
            quarterCount = Integer.parseInt(quarterVal.getText().toString());

        if(!oneVal.getText().toString().matches(""))
            dollarCount = Integer.parseInt(oneVal.getText().toString());
        if(!twoVal.getText().toString().matches(""))
            twoCount = Integer.parseInt(twoVal.getText().toString());
        if(!fiveVal.getText().toString().matches(""))
            fiveCount = Integer.parseInt(fiveVal.getText().toString());
        if(!tenVal.getText().toString().matches(""))
            tenCount = Integer.parseInt(tenVal.getText().toString());
        if(!twentyVal.getText().toString().matches(""))
            twentyCount = Integer.parseInt(twentyVal.getText().toString());
        if(!fiftyVal.getText().toString().matches(""))
            fiftyCount = Integer.parseInt(fiftyVal.getText().toString());
        if(!hundredVal.getText().toString().matches(""))
            hundredCount = Integer.parseInt(hundredVal.getText().toString());

        addPenny(pennyCount);
        addNickel(nickelCount);
        addDime(dimeCount);
        addQuarter(quarterCount);
        addOne(dollarCount);
        addTwo(twoCount);
        addFive(fiveCount);
        addTen(tenCount);
        addTwenty(twentyCount);
        addFifty(fiftyCount);
        addHundred(hundredCount);

        TextView moneySummary = (TextView)findViewById(R.id.summary);
        moneySummary.setText(getMessage());
        TextView moneyTotal = (TextView) findViewById(R.id.money_total);
        df.setRoundingMode(RoundingMode.UP);
        moneyTotal.setText("$" + df.format(total));
    }

    public String getMessage(){
        String message = "Money Report: ";
        message += "\n1¢: " + pennyCount;
        message += "\n5¢: " + nickelCount;
        message += "\n10¢: " + dimeCount;
        message += "\n25¢: " + quarterCount;

        message += "\n$1: " + dollarCount;
        message += "\n$2: " + twoCount;
        message += "\n$5: " + fiveCount;
        message += "\n$10: " + tenCount;
        message += "\n$20: " + twentyCount;
        message += "\n$50: " + fiftyCount;
        message += "\n$100: " + hundredCount;

        df.setRoundingMode(RoundingMode.DOWN);
        message += "\nTOTAL: $" + df.format(total);

        return message;
    }

    public void addPenny(int count){
        total += (0.01 * count);
    }

    public void addNickel(int count){
        total =+ (0.05 * count);
    }

    public void addDime(int count){
        total += (0.10 * count);
    }

    public void addQuarter(int count){
        total += (0.25 * count);
    }

    public void addOne(int count){
        total += (1.00 * count);
    }

    public void addTwo(int count){
        total += (2.00 * count);
    }

    public void addFive(int count){
        total += (5.00 * count);
    }

    public void addTen(int count){
        total += (10.00 * count);
    }

    public void addTwenty(int count){
        total += (20.00 * count);
    }

    public void addFifty(int count){
        total += (50.00 * count);
    }

    public void addHundred(int count){
        total += (100.00 * count);
    }
}