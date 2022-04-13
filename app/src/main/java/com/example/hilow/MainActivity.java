package com.example.hilow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    public void randomNumberGenerator(){
        Random random = new Random();
        randomNumber = random.nextInt(20)+1;
    }
    public void onGuess(View view){
        String message;
        EditText editTextNumber = findViewById(R.id.edtText);

        int guessedNumber = Integer.parseInt(editTextNumber.getText().toString());

        if (guessedNumber < randomNumber){
            message = "Terlalu rendah";
        }
        else if (guessedNumber > randomNumber){
            message = "Terlalu tinggi";
        }
        else {
            message = "BENER BOSS";
            randomNumberGenerator();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        randomNumber = random.nextInt(20)+1;

    }
}