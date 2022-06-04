package com.example.moneycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.FileFilter;

public class MainActivity extends AppCompatActivity {

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
        TextView moneySummary = (TextView)findViewById(R.id.summary);
        moneySummary.setText(getMessage());
        TextView moneyTotal = (TextView) findViewById(R.id.money_total);
        moneyTotal.setText("$" + String.format("%.2f", total));
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

        message += "\nTOTAL: $" + String.format("%.2f", total);

        return message;
    }

    public void addPenny(View view){
        pennyCount++;
        total += 0.01;
    }

    public void addNickel(View view){
        nickelCount++;
        total =+ 0.05;
    }

    public void addDime(View view){
        dimeCount++;
        total += 0.10;
    }

    public void addQuarter(View view){
        quarterCount++;
        total += 0.25;
    }

    public void addOne(View view){
        dollarCount++;
        total += 1.00;
    }

    public void addTwo(View view){
        twoCount++;
        total += 2.00;
    }

    public void addFive(View view){
        fiveCount++;
        total += 5.00;
    }

    public void addTen(View view){
        tenCount++;
        total += 10.00;
    }

    public void addTwenty(View view){
        twentyCount++;
        total += 20.00;
    }

    public void addFifty(View view){
        fiftyCount++;
        total += 50.00;
    }

    public void addHundred(View view){
        hundredCount++;
        total += 100.00;
    }
}