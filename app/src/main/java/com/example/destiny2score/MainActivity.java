package com.example.destiny2score;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button button;
    int scoreredpone = 0;
    double KDredpone = 0;
    int deathredpone = 0;
    int deathredptwo = 0;
    double KDredptwo = 0;
    double KDbluepone = 0;
    double KDblueptwo = 0;
    double KDbluepthree = 0;
    int deathredpthree = 0;
    int deathbluepone = 0;
    int deathblueptwo = 0;
    int deathbluepthree = 0;
    int scoreredptwo = 0;
    int scoreredpthree = 0;
    double KDredpthree = 0;
    int scorebluepone = 0;
    int scoreblueptwo = 0;
    int scorebluepthree = 0;
    int bluelives = 4;
    int redlives = 4;
    int roundnum = 1;
    int redscore = 0;
    int bluescore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    // Below is the red side of scoring
    public void killredpone(View view){
        scoreredpone++;
        displayredpone(scoreredpone);
    }public void diedredpone(View view){
        redlives--;
        deathredpone++;
        if(redlives > 0){
            displayredlives(redlives);
        }else{
            redlives = 4;
            bluelives = 4;
            displaybluelives(bluelives);
            roundnum++;
            bluescore++;
            displaybluescore(bluescore);
            displayround(roundnum);
            displayredlives(redlives);
        }
    }public void killredptwo(View view){
        scoreredptwo++;
        displayredptwo(scoreredptwo);
    }public void diedredptwo(View view){
        redlives--;
        deathredptwo++;
        if(redlives > 0){
            displayredlives(redlives);
        }else{
            redlives = 4;
            roundnum++;
            bluescore++;
            bluelives = 4;
            displaybluelives(bluelives);
            displaybluescore(bluescore);
            displayround(roundnum);
            displayredlives(redlives);
        }
    }public void killredpthree(View view){
        scoreredpthree++;
        displayredthree(scoreredpthree);
    }public void diedredpthree(View view){
        redlives--;
        deathredpthree++;
        if(redlives > 0){
            displayredlives(redlives);
        }else{
            redlives = 4;
            roundnum++;
            bluescore++;
            bluelives = 4;
            displaybluelives(bluelives);
            displaybluescore(bluescore);
            displayround(roundnum);
            displayredlives(redlives);
        }
    }
    // Below is the blue side of scoring

    public void killbluepone(View view){
        scorebluepone++;
        displaybluepone(scorebluepone);
    }public void diedbluepone(View view){
        bluelives--;
        deathbluepone++;
        if(bluelives > 0){
            displaybluelives(bluelives);
        }else{
            bluelives = 4;
            roundnum++;
            redscore++;
            redlives = 4;
            displayredlives(redlives);
            displaybluescore(bluescore);
            displayround(roundnum);
            displaybluelives(bluelives);
        }
    }public void killblueptwo(View view){
        scoreblueptwo++;
        displaybluetwo(scoreblueptwo);
    }public void diedblueptwo(View view){
        bluelives--;
        deathblueptwo++;
        if(bluelives > 0){
            displaybluelives(bluelives);
        }else{
            bluelives = 4;
            roundnum++;
            redscore++;
            redlives = 4;
            displayredlives(redlives);
            displayredscore(redscore);
            displayround(roundnum);
            displaybluelives(bluelives);
        }
    }public void killbluepthree(View view){
        scorebluepthree++;
        displaybluethree(scorebluepthree);
    }public void diedbluepthree(View view){
        bluelives--;
        deathbluepthree++;
        if(bluelives > 0){
            displaybluelives(bluelives);
        }else{
            bluelives = 4;
            roundnum++;
            redscore++;
            redlives = 4;
            displayredlives(redlives);
            displayredscore(redscore);
            displayround(roundnum);
            displaybluelives(bluelives);
        }
    }
// this is the reset buttons
    public void resetround(View view){
        redlives = 4;
        displayredlives(redlives);
        bluelives = 4;
        displaybluelives(bluelives);
        scoreredpone = 0;
        displayredpone(scoreredpone);
        scoreredptwo = 0;
        displayredptwo(scoreredptwo);
        scoreredpthree = 0;
        displayredthree(scoreredpthree);
        scorebluepone = 0;
        displaybluepone(scorebluepone);
        scoreblueptwo = 0;
        displaybluetwo(scoreblueptwo);
        scorebluepthree = 0;
        displaybluethree(scorebluepthree);
    }public void resetmatch(View view){
        redlives = 4;
        displayredlives(redlives);
        bluelives = 4;
        displaybluelives(bluelives);
        scoreredpone = 0;
        displayredpone(scoreredpone);
        scoreredptwo = 0;
        displayredptwo(scoreredptwo);
        scoreredpthree = 0;
        displayredthree(scoreredpthree);
        scorebluepone = 0;
        displaybluepone(scorebluepone);
        scoreblueptwo = 0;
        displaybluetwo(scoreblueptwo);
        scorebluepthree = 0;
        displaybluethree(scorebluepthree);
        redscore = 0;
        displayredscore(redscore);
        bluescore = 0;
        displaybluescore(bluescore);
        roundnum = 1;
        displayround(roundnum);
    }public void seescores(View view){
        if(scoreredpone > 0 || deathredpone > 0){
            KDredpone = scoreredpone / deathredpone;
            displayreponeKD(KDredpone);
        }else{
            displayreponeKD(scoreredpone);
        }
        if(scoreredptwo > 0 || deathredptwo > 0){
            KDredptwo = scoreredptwo / scoreredptwo;
            displayredptwoKD(KDredptwo);
        }else{
            displayredptwoKD(scoreredptwo);
        }
        if(scoreredpthree > 0 || deathredpthree > 0){
            KDredpthree = scoreredpthree / deathredpthree;
            displayredpthreeKD(KDredpthree);
        }else{
            displayredpthreeKD(scoreredpthree);
        }

    }


    private void displayredpone(int number){
        TextView scoreredpone = findViewById(R.id.scoreredpone);
        scoreredpone.setText("" + number);
    }private void displayredptwo(int number){
        TextView scoreredptwo = findViewById(R.id.scoreredptwo);
        scoreredptwo.setText("" + number);
    }private void displayredthree(int number){
        TextView scoreredpthree = findViewById(R.id.scoreredpthree);
        scoreredpthree.setText("" + number);
    }private void displaybluepone(int number){
        TextView scorebluepone = findViewById(R.id.scorebluepone);
        scorebluepone.setText("" + number);
    }private void displaybluetwo(int number){
        TextView scoreblueptwo = findViewById(R.id.scoreblueptwo);
        scoreblueptwo.setText("" + number);
    }private void displaybluethree(int number){
        TextView scorebluepthree = findViewById(R.id.scorebluepthree);
        scorebluepthree.setText("" + number);
    }private void displayredlives(int number){
        TextView redlives = findViewById(R.id.redLives);
        redlives.setText("" + number);
    }private void displayround(int number){
        TextView round = findViewById(R.id.roundnum);
        round.setText("" + number);
    }private void displayredscore(int number){
        TextView redscore = findViewById(R.id.redteampoints);
        redscore.setText("" + number);
    }private void displaybluescore(int number){
        TextView bluescore = findViewById((R.id.blueteampoints));
        bluescore.setText(""+number);
    }private void displaybluelives(int number){
        TextView bluelives = findViewById(R.id.blueLives);
        bluelives.setText("" + number);
    }private void displayreponeKD(double number){
        TextView redponeKD = findViewById(R.id.redponeKD);
        redponeKD.setText("" + number);
    }private void displayredptwoKD(double number){
        TextView redptwoKD = findViewById(R.id.redptwoKD);
        redptwoKD.setText("" + number);
    }private void displayredpthreeKD(double number){
        TextView redpthreeKD = findViewById(R.id.redpthreeKD);
        redpthreeKD.setText("" + number);
    }}
