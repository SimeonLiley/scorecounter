package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Team A +3 Point button is clicked.
     */
    public void teamAScore3(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the Team A +2 Point button is clicked.
     */
    public void teamAScore2(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the Team A FreeThrow button is clicked.
     */
    public void teamAScore1(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * This method is called when the Team B +3 Point button is clicked.
     */
    public void teamBScore3(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the Team B +2 Point button is clicked.
     */
    public void teamBScore2(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the Team B FreeThrow button is clicked.
     */
    public void teamBScore1(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * This method is called when the Reset button is clicked.
     */
    public void scoreReset(View view) {
        displayPreviousScoreB(scoreTeamB);
        displayPreviousScoreA(scoreTeamA);
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * Displays previous matches score for team a when reset button is pressed
     */
    public void displayPreviousScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.previous_team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }
    /**
     * Displays previous matches score for team b when reset button is pressed
     */
    public void displayPreviousScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.previous_team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

}
