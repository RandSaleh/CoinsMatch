package com.example.actc.coinsmatch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int numTurn=9;
    int []memory={2,2,2,
                  2,2,2,
                  2,2,2};
    int tagTemp=00; // this is just the initial value
    boolean flag=false; // 0 if its yello tern
    /// The process for this method is to drop the image view off the screaan
    // then set the recourcse image for the image view
    //  drop it back again !
    public void dropIn(View view) {
        numTurn--;
        ImageView counter = (ImageView) view;
        tagTemp= Integer.parseInt(counter.getTag().toString());

        counter.setTranslationY(-1500);
        if (flag==false) {
            //// yellow turn
            counter.setImageResource(R.drawable.goldcoin);
            memory[tagTemp]=0;
            flag = true;


        }
        else {
            /// red turn
            counter.setImageResource(R.drawable.coinred);
            memory[tagTemp]=1;
            flag=false;
        }
        System.out.println("test1 "+tagTemp+"    test2   "+memory[tagTemp]);


        counter.animate().translationY(30).setDuration(500);
        if (numTurn==0){
           // Toast.makeText(MainActivity.this, "The end ", Toast.LENGTH_LONG).show();
            ShowResult();
                }
    }


    public void ShowResult(){
        if(memory[0]+memory[1]+memory[2]==3 || memory[0]+memory[3]+memory[6]==3||
                memory[0]+memory[4]+memory[8]==3 ){

            Toast.makeText(MainActivity.this, "Red win  ", Toast.LENGTH_LONG).show();
        }
        if(memory[0]+memory[1]+memory[2]==3 || memory[1]+memory[4]+memory[7]==3||
                memory[2]+memory[5]+memory[8]==3 ){

            Toast.makeText(MainActivity.this, "Red win  ", Toast.LENGTH_LONG).show();
        }

        if(memory[2]+memory[4]+memory[6]==3 ){

            Toast.makeText(MainActivity.this, "Red win  ", Toast.LENGTH_LONG).show();
        }

        ///----------------------


        if(memory[0]+memory[1]+memory[2]==3 || memory[0]+memory[3]+memory[6]==3||
                memory[0]+memory[4]+memory[8]==0 ){

            Toast.makeText(MainActivity.this, "Yellow win  ", Toast.LENGTH_LONG).show();
        }
        if(memory[0]+memory[1]+memory[2]==3 || memory[1]+memory[4]+memory[7]==3||
                memory[2]+memory[5]+memory[8]==0 ){

            Toast.makeText(MainActivity.this, "Yellow win  ", Toast.LENGTH_LONG).show();
        }

        if(memory[2]+memory[4]+memory[6]==0 ){

            Toast.makeText(MainActivity.this, "Yellow win  ", Toast.LENGTH_LONG).show();
        }




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void myFaddingMethod(View view) {


    }
}
