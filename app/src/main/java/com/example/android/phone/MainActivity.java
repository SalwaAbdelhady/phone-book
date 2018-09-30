package com.example.android.phone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int number = 0 ;
    String letter = " " ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * add 1 to the text view .
     */
    public void addOne (View v) {
        number = 1 ;
        displayNumber(number);
    }

    /**
     * add 2 to the text view .
     */
    public void addTwo (View v) {
        number = 2 ;
        displayNumber(number);
    }

    /**
     * add 3 to the text view .
     */
    public void addThree (View v) {
        number = 3 ;
        displayNumber(number);
    }

    /**
     * add 4 to the text view .
     */
    public void addFour (View v) {
        number = 4 ;
        displayNumber(number);
    }

    /**
     * add 5 to the text view .
     */
    public void addFive (View v) {
        number = 5 ;
        displayNumber(number);
    }

    /**
     * add 6 to the text view .
     */
    public void addSix (View v) {
        number = 6 ;
        displayNumber(number);
    }

    /**
     * add 7 to the text view .
     */
    public void addSeven (View v) {
        number = 7 ;
        displayNumber(number);
    }

    /**
     * add 8 to the text view .
     */
    public void addEight (View v) {
        number = 8 ;
        displayNumber(number);
    }

    /**
     * add 9 to the text view .
     */
    public void addNine (View v) {
        number = 9 ;
        displayNumber(number);
    }

    /**
     * add 0 to the text view .
     */
    public void addZero (View v) {
        number = 0 ;
        displayNumber(number);
    }

    /**
     * add * to the text view .
     */
    public void addStar (View v) {
        letter = "*" ;
        displayLetter(letter);
    }

    /**
     * add # to the text view .
     */
    public void addHash (View v) {
        letter = "#" ;
        displayLetter(letter);
    }

    /**
     * delete text view
     */
    public void delete(View v) {
        number = 0 ;
        letter = " " ;
        displayLetter(letter);
        displayNumber(number );
    }

    /**
     * Displays the Number .
     */
    public void displayNumber(int number ) {
       /**
        *  TextView scoreView = (TextView) findViewById(view_number);
        *scoreView.setText(String.valueOf(number ));
        */
       TextView phoneNumber = (TextView) findViewById(R.id.text_view) ;
        String phone = phoneNumber.getText().toString() ;

    }
    /**
     * Displays the letter .
     */
    public void displayLetter(String letter) {
        TextView scoreView = (TextView) findViewById(R.id.text_view);
        scoreView.setText(String.valueOf(letter));
    }

}
