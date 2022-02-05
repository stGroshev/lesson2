package com.groshev.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        startListener();
    }

    private void Listener(Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case (R.id.button1): {
                        printResult(buttonOne);
                        break;
                    }
                    case (R.id.button2): {
                        printResult(buttonTwo);
                        break;
                    }
                    case (R.id.button3): {
                        printResult(buttonThree);
                        break;
                    }
                    case (R.id.button4): {
                        printResult(buttonFour);
                        break;
                    }
                    case (R.id.button5): {
                        printResult(buttonFive);
                        break;
                    }
                    case (R.id.button6): {
                        printResult(buttonSix);
                        break;
                    }
                    case (R.id.button7): {
                        printResult(buttonSeven);
                        break;
                    }
                    case (R.id.button8): {
                        printResult(buttonEight);
                        break;
                    }
                    case (R.id.button9): {
                        printResult(buttonNine);
                        break;
                    }
                    case (R.id.buttonMultiplication): {
                        printResult(buttonMultiplication);
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
                        break;
                    }
                    case (R.id.buttonAddition): {
                        printResult(buttonAddition);
                        break;
                    }
                    case (R.id.buttonPercent): {
                        printResult(buttonPercent);
                        break;
                    }
                    case (R.id.buttonEquals): {
                        printResult(buttonEquals);
                        break;
                    }
                    case (R.id.buttonCleanOff): {
                        printResult(buttonCleanOff);
                        break;
                    }
                    case (R.id.buttonSubtraction): {
                        printResult(buttonSubtraction);
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
                    default: {
                        break;
                    }
                }
            }
        });
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
    }

    private void printResult(Button button) {
        String d = (String) button.getText();
        tvResult.setText(d);
        Log.d("myTag", "значение: " + d);
    }
}