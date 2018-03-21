package com.green.recipecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // variables to hold references to EditText and buttons in activity_main.xml
    private EditText originalAmtEditText;
    private EditText desireAmtEditText;
    private Button calcBtn;

    // arrays to hold initial ingredient values and results
    private EditText[] ingredientsEditText = new EditText[5];
    private TextView[] ingredientResultsTextView = new TextView[5];

    //variables to hold decimal amounts
    private Double desireAmt;
    private Double originalAmt;

    //arrays to hold original decimal values and decimal results
    private Double[] ingredientsOriginal = {0.0, 0.0, 0.0, 0.0, 0.0};
    private Double[] ingredientResults = {0.0, 0.0, 0.0, 0.0, 0.0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sets references to corresponding objects in activity_main.xml
        originalAmtEditText = (EditText) findViewById(R.id.originalAmtEditText);
        desireAmtEditText = (EditText) findViewById(R.id.desireAmtEditText);
        ingredientsEditText[0] = (EditText) findViewById(R.id.ingredient1EditText);
        ingredientsEditText[1] = (EditText) findViewById(R.id.ingredient2EditText);
        ingredientsEditText[2] = (EditText) findViewById(R.id.ingredient3EditText);
        ingredientsEditText[3] = (EditText) findViewById(R.id.ingredient4EditText);
        ingredientsEditText[4] = (EditText) findViewById(R.id.ingredient5EditText);
        ingredientResultsTextView[0] = (TextView) findViewById(R.id.ingredient1ResultEditText);
        ingredientResultsTextView[1] = (TextView) findViewById(R.id.ingredient2ResultEditText);
        ingredientResultsTextView[2] = (TextView) findViewById(R.id.ingredient3ResultEditText);
        ingredientResultsTextView[3] = (TextView) findViewById(R.id.ingredient4ResultEditText);
        ingredientResultsTextView[4] = (TextView) findViewById(R.id.ingredient5ResultEditText);
        calcBtn = (Button) findViewById(R.id.calcBtn);

        // set listener on button to call onClick method when calcBtn button is clicked
        calcBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        // make sure each EditText has a String
        try {
            // set decimals values for each ingredient
            for (int i = 0; i < 5; i++) {
                ingredientsOriginal[i] = Double.parseDouble(ingredientsEditText[i].getText().toString());
            }
        }
        catch(Exception e) {
            //Toast.makeText(this, "Please enter a value for each ingredient.", Toast.LENGTH_SHORT).show();
        }


        //This is for testing only and will need removed.  Will sent results to the original values so we can test pulling values and displaying
        for (int i = 0; i < 5; i++){
            ingredientResults[i] = ingredientsOriginal[i];
        }

        //Display each value in the appropriate TextView field in acitivty_main.xml
        for (int i = 0; i < 5; i++) {
            ingredientResultsTextView[i].setText(ingredientResults[i].toString());
        }
    }
}
