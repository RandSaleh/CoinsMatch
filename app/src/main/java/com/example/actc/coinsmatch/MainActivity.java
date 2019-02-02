package com.example.actc.coinsmatch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numTurn = 9;
    TextView txtWinner;
    android.support.v7.widget.GridLayout countersGridView;
    int[] memory = {4, 4, 4,
            4, 4, 4,
            4, 4, 4};
    int tagTemp = 00; // this is just the initial value
    boolean flag = false; // 0 if its yello tern

    /// The process for this method is to drop the image view off the screaan
    // then set the recourcse image for the image view
    //  drop it back again !
    public void dropIn(View view) {
        numTurn--;

        ImageView counter = (ImageView) view;
        tagTemp = Integer.parseInt(counter.getTag().toString());
        counter.setTranslationY(-1500);
        if (flag == false) {
            //// yellow turn
            counter.setImageResource(R.drawable.bitcoins);
            memory[tagTemp] = 0;
            flag = true;
            checkResult();
        } else {
            /// red turn
            counter.setImageResource(R.drawable.redcoins);
            memory[tagTemp] = 1;
            flag = false;
            checkResult();

        }
        counter.animate().translationY(30).rotationX(3600).setDuration(600);
        if (numTurn == 0)
            checkResult();
    }


    public void checkResult() {
        if (memory[0] + memory[1] + memory[2] == 3 || memory[0] + memory[3] + memory[6] == 3 ||
                memory[0] + memory[4] + memory[8] == 3) {
            txtWinner.setText("Red win  ");
        }
        if (memory[0] + memory[1] + memory[2] == 3 || memory[1] + memory[4] + memory[7] == 3 ||
                memory[2] + memory[5] + memory[8] == 3) {
            txtWinner.setText("Red win  ");
        }
        if (memory[2] + memory[4] + memory[6] == 3) {
            txtWinner.setText("Red win  ");
        }
        if (memory[0] + memory[1] + memory[2] == 3 || memory[0] + memory[3] + memory[6] == 3 ||
                memory[0] + memory[4] + memory[8] == 0) {
            txtWinner.setText("Yellow win  ");

        }
        if (memory[0] + memory[1] + memory[2] == 3 || memory[1] + memory[4] + memory[7] == 3 ||
                memory[2] + memory[5] + memory[8] == 0) {
            txtWinner.setText("Yellow win  ");
        }

        if (memory[2] + memory[4] + memory[6] == 0) {
            txtWinner.setText("Yellow win  ");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtWinner = findViewById(R.id.txtWinner);
        countersGridView = (android.support.v7.widget.GridLayout)findViewById(R.id.gridLayout);
    }

    public void playAgain(View view) {
        numTurn = 9;
        tagTemp = 00;
        flag = false;
        memory = new int[]{4, 4, 4,
                4, 4, 4,
                4, 4, 4};
        // Loop through all element in the grid view to remove the coins from it !

        for (int i = 0; i < countersGridView.getChildCount(); i++) {
            ImageView counter = (ImageView) countersGridView.getChildAt(i);
            counter.setImageResource(0);


        }


    }


}
