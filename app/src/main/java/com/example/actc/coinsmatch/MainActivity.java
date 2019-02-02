package com.example.actc.coinsmatch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numTurn = 9;
    TextView txtWinner;
    ImageView imdWinner ;
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
        } else {
            /// red turn
            counter.setImageResource(R.drawable.redcoins);
            memory[tagTemp] = 1;
            flag = false;

        }
        counter.animate().translationY(30).rotationX(3600).setDuration(600);
        if (numTurn <=6)
            checkResult();
    }


    public void checkResult() {
        if (memory[0] + memory[1] + memory[2] == 3) {
            txtWinner.setText("Red win  ");
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setImageResource(R.drawable.redcoins);
            imdWinner.setVisibility(View.VISIBLE);


        }
        if (memory[3] + memory[4] + memory[5] == 3 )
               {
            txtWinner.setText("Red win  ");
            countersGridView.setVisibility(View.INVISIBLE);
                   imdWinner.setImageResource(R.drawable.redcoins);
                   imdWinner.setVisibility(View.VISIBLE);


               }
        if (memory[6] + memory[7] + memory[8] == 3) {
            txtWinner.setText("Red win  ");
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setImageResource(R.drawable.redcoins);
            imdWinner.setVisibility(View.VISIBLE);


        }

        if (memory[0] + memory[3] + memory[6] == 3) {
            txtWinner.setText("Red win  ");
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setImageResource(R.drawable.redcoins);
            imdWinner.setVisibility(View.VISIBLE);


        }

        if (memory[1] + memory[4] + memory[7] == 3) {
            txtWinner.setText("Red win  ");
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setImageResource(R.drawable.redcoins);
            imdWinner.setVisibility(View.VISIBLE);


        }
        if (memory[2] + memory[5] + memory[8] == 3) {
            txtWinner.setText("Red win  ");
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setImageResource(R.drawable.redcoins);

            imdWinner.setVisibility(View.VISIBLE);

        }

        if (memory[0] + memory[4] + memory[8] == 3) {
            txtWinner.setText("Red win  ");
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setImageResource(R.drawable.redcoins);
            imdWinner.setVisibility(View.VISIBLE);


        }

        if (memory[2] + memory[4] + memory[6] == 3) {
            txtWinner.setText("Red win  ");
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setImageResource(R.drawable.redcoins);
            imdWinner.setVisibility(View.VISIBLE);



        }

        //----------------------------------------------------------
        if (memory[0] + memory[1] + memory[2] == 0) {
            txtWinner.setText("yelow  win  ");
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setImageResource(R.drawable.bitcoins);
            imdWinner.setVisibility(View.VISIBLE);


        }
        if (memory[3] + memory[4] + memory[5] == 0 )
        {
            txtWinner.setText("yellow win  ");
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setImageResource(R.drawable.bitcoins);
            imdWinner.setVisibility(View.VISIBLE);



        }
        if (memory[6] + memory[7] + memory[8] == 0) {
            txtWinner.setText("Yellow  win  ");
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setImageResource(R.drawable.bitcoins);
            imdWinner.setVisibility(View.VISIBLE);



        }

        if (memory[0] + memory[3] + memory[6] == 0) {
            txtWinner.setText("Yellow  win  ");
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setImageResource(R.drawable.bitcoins);
            imdWinner.setVisibility(View.VISIBLE);



        }

        if (memory[1] + memory[4] + memory[7] == 0) {
            txtWinner.setText("Yellow win  ");
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setImageResource(R.drawable.bitcoins);
            imdWinner.setVisibility(View.VISIBLE);


        }
        if (memory[2] + memory[5] + memory[8] == 0) {
            txtWinner.setText("Yellow win  ");
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setImageResource(R.drawable.bitcoins);
            imdWinner.setVisibility(View.VISIBLE);


        }

        if (memory[0] + memory[4] + memory[8] == 0) {
            txtWinner.setText("Yellow win  ");
            imdWinner.setImageResource(R.drawable.bitcoins);
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setVisibility(View.VISIBLE);

        }

        if (memory[2] + memory[4] + memory[6] == 0) {
            txtWinner.setText("Yellow win  ");
            imdWinner.setImageResource(R.drawable.bitcoins);
            countersGridView.setVisibility(View.INVISIBLE);
            imdWinner.setVisibility(View.VISIBLE);

        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtWinner = findViewById(R.id.txtWinner);
        countersGridView = (android.support.v7.widget.GridLayout)findViewById(R.id.gridLayout);
        imdWinner=findViewById(R.id.imgWinner);
    }

    public void playAgain(View view) {
        txtWinner.setText("");
        imdWinner.setVisibility(View.INVISIBLE);
        countersGridView.setVisibility(View.VISIBLE);
        numTurn = 9;
        tagTemp = 00;
        flag = false;
        memory = new int[]{99, 99, 99,
                99, 99, 99,
                99, 99, 99};
        // Loop through all element in the grid view to remove the coins from it !
        for (int i = 0; i < countersGridView.getChildCount(); i++) {
            ImageView counter = (ImageView) countersGridView.getChildAt(i);
            counter.setImageResource(0);

        }


    }


}
