package com.example.android.forestryquizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    /**
     * THIS METHOD IS CALLED WHEN THE SUBMIT BUTTON IS CLICKED
     */
    public void oderIt(View veiw) {
        int score = 0;

        EditText text = (EditText) findViewById(R.id.typename);
        String value = text.getText().toString();

        CheckBox oneC = (CheckBox) findViewById(R.id.checkbox1c);
        Boolean BOXc = oneC.isChecked();
        if (BOXc) {
            score += 1;
        }

        RadioButton oneA = (RadioButton) findViewById(R.id.radio1a);
        Boolean R1A = oneA.isChecked();
        if (BOXc) {
            score += 1;
        }


        RadioButton twoA = (RadioButton) findViewById(R.id.radio2a);
        Boolean R2A = twoA.isChecked();
        if (BOXc) {
            score += 1;
        }


        RadioButton threeA = (RadioButton) findViewById(R.id.radio3a);
        Boolean R3A = threeA.isChecked();
        if (R3A) {
            score += 1;
        }


        RadioButton fourA = (RadioButton) findViewById(R.id.radio4a);
        Boolean R4A = fourA.isChecked();
        if (R4A) {
            score += 1;
        }


        RadioButton fiveA = (RadioButton) findViewById(R.id.radio5a);
        Boolean R5A = fiveA.isChecked();
        if (R5A) {
            score += 1;
        }

        RadioButton sixA = (RadioButton) findViewById(R.id.radio6a);
        Boolean R6A = sixA.isChecked();
        if (R6A) {
            score += 1;
        }


        RadioButton sevenb = (RadioButton) findViewById(R.id.radio7b);
        Boolean R7A = sevenb.isChecked();
        if (R7A) {
            score += 1;
        }

        RadioButton eightb = (RadioButton) findViewById(R.id.radio8b);
        Boolean R8b = eightb.isChecked();
        if (R8b) {
            score += 1;
        }

        int win = Calculatescore(score);
        String totalmessage = CreateTotalSummary(value, win, score);
        displaymessage(totalmessage);


    }

    private void display(int yes) {
        TextView scoreTextveiw = (TextView) findViewById(R.id.score_text);
        scoreTextveiw.setText("" + yes);
    }


    /**
     * calculates TOTAL of quizz
     *
     * @ return total score
     */
    private int Calculatescore(int score) {
        int TOTAL = score;
        return TOTAL;
    }

    /***
     * displaymessage method
     */
    private void displaymessage(String message) {
        TextView totalTextveiw = (TextView) findViewById(R.id.totalscore_text);
        totalTextveiw.setText(message);
    }
    /**
     * return value
     */

    /***
     * create total score of quiz
     * @ param score of quis
     * @return summary
     */
    private String CreateTotalSummary(String value, int win, int score) {
        String totalmessage = "NAME:" + value;
        totalmessage += "\n score:" + score + "/9";
        return totalmessage;
    }

    //
    public void Resetit(View veiw) {
        int score = 0;
        EditText text = (EditText) findViewById(R.id.typename);
        String value = "";

        int win = Calculatescore(score);
        String totalmessage = CreateTotalSummary(value, win, score);
        displaymessage(totalmessage);


    }
}









