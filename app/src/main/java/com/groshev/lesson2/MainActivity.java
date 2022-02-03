package com.groshev.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*private int valueButtonOne = 1;
    private int valueButtonTwo = 2;
    private int valueButtonThree = 3;
    private int valueButtonFor = 4;
    private int valueButtonFive = 5;
    private int valueButtonSix = 6;
    private int valueButtonSeven = 2;
    private int valueButtonEight = 2;
    private int valueButtonNine = 2;*/
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    /*Button buttonCleanOff;
    Button buttonDelete;
    Button buttonPercent;
    Button buttonDivision;
    Button buttonMultiplication;
    Button buttonSubtraction;
    Button buttonAddition;
    Button buttonComma;
    Button buttonEquals;*/
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Listener(buttonOne);
        Listener(buttonTwo);
        Listener(buttonThree);
        Listener(buttonTwo);
    }

    private void Listener(Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case (R.id.button1): {
                        printResult(buttonOne);
                    }
                    case (R.id.button2): {
                        printResult(buttonTwo);
                    }
                    case (R.id.button3): {
                        printResult(buttonThree);
                    }
                    case (R.id.button4): {
                        printResult(buttonFour);
                    }
                    case (R.id.button5): {
                        printResult(buttonFive);
                    }
                    case (R.id.button6): {
                        printResult(buttonSix);
                    }
                    case (R.id.button7): {
                        printResult(buttonSeven);
                    }
                    case (R.id.button8): {
                        printResult(buttonEight);
                    }
                    case (R.id.button9): {
                        printResult(buttonNine);
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
        tvResult = findViewById(R.id.tvResult);
    }

    private void printResult(Button button) {
        String d = (String) button.getText();
        tvResult.setText(d);
        Log.d("myTag","значение: "+ d);
    }

}