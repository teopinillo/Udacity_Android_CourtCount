package android.example.com.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textScoreA;
    TextView textScoreB;
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void javaAddPoints_3_A(View view) {
        scoreTeamA += 3;
        showScores();

    }

    public void javaAddPoints_2_A(View view) {
        scoreTeamA += 2;
        showScores();
    }

    public void javaAddPoints_1_A(View view) {
        scoreTeamA++;
        showScores();
    }

    public void javaAddPoints_3_B(View view) {
        scoreTeamB += 3;
        showScores();
    }

    public void javaAddPoints_2_B(View view) {
        scoreTeamB += 2;
        showScores();
    }

    public void javaAddPoints_1_B(View view) {
        scoreTeamB++;
        showScores();
    }

    public void showScores() {
        textScoreA = findViewById(R.id.textScoreTeamA);
        textScoreB = findViewById(R.id.textScoreTeamB);
        textScoreA.setText(String.valueOf(scoreTeamA));
        textScoreB.setText(String.valueOf(scoreTeamB));
    }

    public void btnResetClick(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        showScores();
    }
}
