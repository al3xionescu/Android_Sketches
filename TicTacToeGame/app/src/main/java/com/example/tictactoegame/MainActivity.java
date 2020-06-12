package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BuClick(View view) {
        Button buSelected = (Button) view;
        int cellId = 0;
        switch ((buSelected.getId())) {
            case R.id.bu1:
                cellId = 1;
            break;
            case R.id.bu2:
                cellId = 2;
            break;
            case R.id.bu3:
                cellId = 3;
            break;
            case R.id.bu4:
                cellId = 4;
            break;
            case R.id.bu5:
                cellId = 5;
            break;
            case R.id.bu6:
                cellId = 6;
            break;
            case R.id.bu7:
                cellId = 7;
            break;
            case R.id.bu8:
                cellId = 8;
            break;
            case R.id.bu9:
                cellId = 9;
            break;
        }
        PlayGame(cellId, buSelected);
    }

    int activePlayer = 1;  // 1 - first, 2 - second
    ArrayList<Integer> player1 = new ArrayList<Integer>(); // hold player 1 data
    ArrayList<Integer>  player2 = new ArrayList<Integer>(); // hold player 2 data

    void PlayGame(int cellId, Button buSelected) {
        Log.d("Player:", String.valueOf(cellId));

        if (activePlayer == 1) {
            buSelected.setText("X");
            activePlayer = 2;
            player1.add(cellId);
            buSelected.setBackgroundColor(Color.GREEN);

        } else {
            buSelected.setText("O");
            activePlayer = 1;
            player2.add(cellId);
            buSelected.setBackgroundColor(Color.RED);
        }

        CheckWinner();
    }

    void CheckWinner() {
        int winner = -1;
        // row 1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winner = 1;
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winner = 2;
        }

        // row 2
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winner = 1;
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winner = 2;
        }

        // row 3
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winner = 1;
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winner = 2;
        }

        // col 1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winner = 1;
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winner = 2;
        }

        // col 2
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winner = 1;
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winner = 2;
        }

        // col 3
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winner = 1;
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 2;
        }

        // main diag
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            winner = 1;
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            winner = 2;
        }

        // secondary diag
        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            winner = 1;
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            winner = 2;
        }

        if (winner != -1) {
            if (winner == 1) {
                Toast.makeText(this,"player 1 is the winner", Toast.LENGTH_LONG).show();
                finish();
            }
            if (winner == 2) {
                Toast.makeText(this,"player 2 is the winner", Toast.LENGTH_LONG).show();
                finish();
            }
        }
    }

}
