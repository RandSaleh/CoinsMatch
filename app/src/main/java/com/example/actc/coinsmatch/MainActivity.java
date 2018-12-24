package com.example.actc.coinsmatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
int flag =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myFaddingMethod(View view) {
        ImageView imageView1 = findViewById(R.id.imageView1);
       // ImageView homer_apear = findViewById(R.id.imageView2);
        //imageView1.animate().translationYBy(-1500).setDuration(1000);
        //imageView1.animate().rotation(3600).alpha(0).translationYBy(1000).setDuration(1000);
       // imageView1.animate().scaleX(.5f).scaleY(.5f).setDuration(1000);
        imageView1.animate().rotation(3600).translationX(50).setDuration(5000);

    }
}
