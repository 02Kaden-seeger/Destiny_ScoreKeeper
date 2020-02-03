package com.example.destiny2score;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    private void displayredpone(int number){
        TextView scoreredpone = findViewById(R.id.scoreredpone);
        scoreredpone.setText("" + number);
    }private void displayredtwo(int number){
        TextView scoreredptwo = findViewById(R.id.scoreredptwo);
        scoreredptwo.setText("" + number);
    }private void displayredthree(int number){
        TextView scoreredpthree = findViewById(R.id.scoreredpthree);
        scoreredpthree.setText("" + number);
    }
}
