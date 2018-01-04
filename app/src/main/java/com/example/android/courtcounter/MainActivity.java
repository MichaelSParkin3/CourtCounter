package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamA(scoreB);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the scoreA for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreA++;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the scoreA for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreA = scoreA +2;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the scoreA for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    /**
     * Set the scoreA for Team A back to 0 then display it.
     */

    public void resetScoreA(View v) {
        scoreA = 0;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the scoreB for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreB++;
        displayForTeamB(scoreB);
    }

    /**
     * Increase the scoreB for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreB = scoreB +2;
        displayForTeamB(scoreB);
    }

    /**
     * Increase the scoreB for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    /**
     * Set the scoreB for Team B back to 0 then display it.
     */

    public void resetScoreB(View v) {
        scoreB = 0;
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given scoreA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given scoreB for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
