package com.example.mishk.bbq;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    }

    public void onRadioButton1Clicked(View view) {
        // Is the button now checked?
        boolean button1Checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1a1:
                if (button1Checked)
                    // 6-10 sec
                    break;
            case R.id.q1a2:
                if (button1Checked)
                    // 18-23 sec
                    totalScore = totalScore + 1;
                break;
            case R.id.q1a3:
                if (button1Checked)
                    // 10-18 sec
                    break;
        }
    }

    public void onRadioButton2Clicked(View view) {
        boolean button2Checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q2a1:
                if (button2Checked)
                    // 6-8 sec
                    break;
            case R.id.q2a2:
                if (button2Checked)
                    // 1-3 sec
                    totalScore = totalScore + 1;
                break;
            case R.id.q2a3:
                if (button2Checked)
                    // 10 sec
                    break;
        }
    }

    public void onRadioButton3Clicked(View view) {
        boolean button3Checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q3a1:
                if (button3Checked)
                    // 1,2,2
                    totalScore = totalScore + 1;
                break;
            case R.id.q3a2:
                if (button3Checked)
                    // 3,4,5
                    break;
            case R.id.q3a3:
                if (button3Checked)
                    // 1,2,3
                    break;
        }
    }

    public void onRadioButton4Clicked(View view) {
        boolean button4Checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q4a1:
                if (button4Checked)
                    // 1,2,2
                    break;
            case R.id.q4a2:
                if (button4Checked)
                    // 3,4,5
                    totalScore = totalScore + 1;
                break;
            case R.id.q4a3:
                if (button4Checked)
                    // 2,3,5
                    break;
        }
    }

    public void onCheckboxClicked(View view) {
        boolean button5Checked = ((CheckBox) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.checkbox1:
                if (button5Checked)
                    // CDL
                    break;
            case R.id.checkbox2:
                if (button5Checked)
                    // FW
                    totalScore = totalScore + 1;
                break;
            case R.id.checkbox3:
                if (button5Checked)
                    // LM
                    totalScore=totalScore+1;
                    break;
        }
    }

    public void onRadioButton6Clicked(View view) {
        boolean button6Checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q6a1:
                if (button6Checked)
                    // CM, LM
                    break;
            case R.id.q6a2:
                if (button6Checked)
                    // flat white, latte macchiato
                    totalScore = totalScore + 1;
                break;
            case R.id.q6a3:
                if (button6Checked)
                    // Any macchiato
                    break;
        }
    }



    public void onRadioButton8Clicked(View view) {
        boolean button8Checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q8a1:
                if (button8Checked)
                    // Ristretto
                    totalScore = totalScore + 1;
                break;
            case R.id.q8a2:
                if (button8Checked)
                    // Long
                    break;
            case R.id.q8a3:
                if (button8Checked)
                    // Regular
                    break;
        }
    }

    public void onRadioButton9Clicked(View view) {
        boolean button9Checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q9a1:
                if (button9Checked)
                    //
                    break;
            case R.id.q9a2:
                if (button9Checked)
                    //
                    break;
            case R.id.q9a3:
                if (button9Checked)
                    //
                    totalScore = totalScore + 1;
                break;
        }
    }

    public void onRadioButton10Clicked(View view) {
        boolean button10Checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q10a1:
                if (button10Checked)
                    //
                    break;
            case R.id.q10a2:
                if (button10Checked)
                    //
                    break;
            case R.id.q10a3:
                if (button10Checked)
                    //
                    totalScore = totalScore + 1;
                break;
        }
    }

    public void displayScore(View view) {
        EditText questionAnswer = (EditText) findViewById(R.id.question7);
        String question7 = questionAnswer.getText().toString();
        String rightAnswer1="macchiato";
        String rightAnswer2="macchiatos";
        if (question7.equalsIgnoreCase(rightAnswer1) || question7.equalsIgnoreCase(rightAnswer2) ){
            totalScore = totalScore + 1;
        }
        if (totalScore == 11) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_toast,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = (TextView) layout.findViewById(R.id.text);
            text.setText("Your score is " + totalScore + "." + "\nYou`ve definitely mastered barista basics!");
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }
        if ((totalScore > 6) && (totalScore <= 9)) {

            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_toast,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = (TextView) layout.findViewById(R.id.text);
            text.setText("Your score is " + totalScore + "." + "\nYou`re close to perfection, but need to refresh your knowledge.");
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();

        }
        if (totalScore <= 6) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_toast,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = (TextView) layout.findViewById(R.id.text);
            text.setText("Your score is " + totalScore + "." + "\nOh no! Seems that your memory let you down. \nPartner with your TL and go through the basics once again.");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }
    }
}


