package com.groshev.lesson2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String value;
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonCleanOff;
    Button buttonDelete;
    Button buttonPercent;
    Button buttonDivision;
    Button buttonMultiplication;
    Button buttonSubtraction;
    Button buttonAddition;
    Button buttonComma;
    Button buttonEquals;
    Button buttonZero;
    Button buttonZeroZero;
    Button buttonSettings;
    TextView tvResult;
    Double valueOne;
    Double valueTwo;
    int operation;
    String input = "";
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        startListener();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("tvResult", value);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        value = savedInstanceState.getString("tvResult");
        tvResult.setText(value);
    }

    private void initView() {
        buttonOne = findViewById(R.id.button1);
        buttonTwo = findViewById(R.id.button2);
        buttonThree = findViewById(R.id.button3);
        buttonFour = findViewById(R.id.button4);
        buttonFive = findViewById(R.id.button5);
        buttonSix = findViewById(R.id.button6);
        buttonSeven = findViewById(R.id.button7);
        buttonEight = findViewById(R.id.button8);
        buttonNine = findViewById(R.id.button9);
        buttonComma = findViewById(R.id.buttonComma);
        buttonDelete = findViewById(R.id.buttonDelete);
        buttonCleanOff = findViewById(R.id.buttonCleanOff);
        buttonPercent = findViewById(R.id.buttonPercent);
        buttonMultiplication = findViewById(R.id.buttonMultiplication);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonAddition = findViewById(R.id.buttonAddition);
        buttonEquals = findViewById(R.id.buttonEquals);
        buttonSubtraction = findViewById(R.id.buttonSubtraction);
        buttonZero = findViewById(R.id.button0);
        buttonZeroZero = findViewById(R.id.button00);
        tvResult = findViewById(R.id.tvResult);
        buttonSettings = findViewById(R.id.buttonSettings);
    }

    private void Listener(Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                switch (v.getId()) {
                    case (R.id.button1): {
                        printResult(buttonOne);
                        input += btn.getText().toString();
                        break;
                    }
                    case (R.id.button2): {
                        printResult(buttonTwo);
                        input += btn.getText().toString();
                        break;
                    }
                    case (R.id.button3): {
                        printResult(buttonThree);
                        input += btn.getText().toString();
                        break;
                    }
                    case (R.id.button4): {
                        printResult(buttonFour);
                        input += btn.getText().toString();
                        break;
                    }
                    case (R.id.button5): {
                        printResult(buttonFive);
                        input += btn.getText().toString();
                        break;
                    }
                    case (R.id.button6): {
                        printResult(buttonSix);
                        input += btn.getText().toString();
                        break;
                    }
                    case (R.id.button7): {
                        printResult(buttonSeven);
                        input += btn.getText().toString();
                        break;
                    }
                    case (R.id.button8): {
                        printResult(buttonEight);
                        input += btn.getText().toString();
                        break;
                    }
                    case (R.id.button9): {
                        printResult(buttonNine);
                        input += btn.getText().toString();
                        break;
                    }
                    case (R.id.buttonMultiplication): {
                        printResult(buttonMultiplication);
                        valueOne = Double.parseDouble(input);
                        operation = 3;
                        input = "";
                        break;
                    }
                    case (R.id.buttonComma): {
                        printResult(buttonComma);
                        break;
                    }
                    case (R.id.buttonDelete): {
                        printResult(buttonDelete);
                        break;
                    }
                    case (R.id.buttonDivision): {
                        printResult(buttonDivision);
                        valueOne = Double.parseDouble(input);
                        operation = 4;
                        input = "";
                        break;
                    }
                    case (R.id.buttonAddition): {
                        printResult(buttonAddition);
                        valueOne = Double.parseDouble(input);
                        operation = 1;
                        input = "";
                        break;
                    }
                    case (R.id.buttonPercent): {
                        printResult(buttonPercent);
                        operation = 5;
                        break;
                    }
                    case (R.id.buttonEquals): {
                        printResult(buttonEquals);
                        valueTwo = Double.parseDouble(input);
                        result();
                        break;
                    }
                    case (R.id.buttonCleanOff): {
                        tvResult.setText("");
                        input = "";
                        break;
                    }
                    case (R.id.buttonSubtraction): {
                        printResult(buttonSubtraction);
                        valueOne = Double.parseDouble(input);
                        operation = 2;
                        input = "";
                        break;
                    }
                    case (R.id.button0): {
                        printResult(buttonZero);
                        break;
                    }
                    case (R.id.button00): {
                        printResult(buttonZeroZero);
                        break;
                    }
                    case (R.id.buttonSettings): {
                        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                        startActivity(intent);
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
        });
    }

    private void startListener() {
        Listener(buttonOne);
        Listener(buttonTwo);
        Listener(buttonThree);
        Listener(buttonFour);
        Listener(buttonFive);
        Listener(buttonSix);
        Listener(buttonSeven);
        Listener(buttonEight);
        Listener(buttonNine);
        Listener(buttonCleanOff);
        Listener(buttonDelete);
        Listener(buttonComma);
        Listener(buttonPercent);
        Listener(buttonDivision);
        Listener(buttonMultiplication);
        Listener(buttonSubtraction);
        Listener(buttonAddition);
        Listener(buttonEquals);
        Listener(buttonSubtraction);
        Listener(buttonZero);
        Listener(buttonZeroZero);
        Listener(buttonSettings);
    }

    private void printResult(Button button) {
        value = tvResult.getText().toString() + button.getText().toString();
        tvResult.setText(value);
    }

    void result() {
        switch (operation) {
            case 1: {
                result = String.format("%s", valueOne + valueTwo);
                input = result;
                tvResult.setText(tvResult.getText().toString() + result);
                break;
            }
            case 2: {
                result = String.format("%s", valueOne - valueTwo);
                input = result;
                tvResult.setText(tvResult.getText().toString() + result);
                break;
            }
            case 3: {
                result = String.format("%s", valueOne * valueTwo);
                input = result;
                tvResult.setText(tvResult.getText().toString() + result);
                break;
            }
            case 4: {
                result = String.format("%s", valueOne / valueTwo);
                input = result;
                tvResult.setText(tvResult.getText().toString() + result);
                break;
            }
            case 5: {
                Double f = 100.0;
                result = String.format("%s", (valueOne/f) * valueTwo);
                input = result;
                tvResult.setText(tvResult.getText().toString() + result);
                break;
            }
        }
    }
}