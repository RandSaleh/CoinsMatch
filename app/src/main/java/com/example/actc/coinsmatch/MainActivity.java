package com.example.actc.coinsmatch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    /// The process for this method is to drop the image view off the screaan
    // then set the recourcse image for the image view
    //  drop it back again !
    public void dropIn(View view) {
        ImageView counter = (ImageView) view;
        counter.setTranslationY(-1500);
        counter.setImageResource(R.drawable.goldcoin);
        counter.animate().translationY(30).setDuration(500);
      //  counter.setTranslationY(1500);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myFaddingMethod(View view) {


    }
}
