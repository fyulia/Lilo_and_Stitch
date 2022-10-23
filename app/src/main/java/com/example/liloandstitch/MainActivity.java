package com.example.liloandstitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isStitchVisible = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eraseStitch(View view) {

        ImageView stitchImage = findViewById(R.id.stitchImage);
        ImageView liloImage = findViewById(R.id.liloImage);
        liloImage.animate().alpha(1).scaleX(0).scaleY(0).setDuration(3000);


        if (isStitchVisible){
            stitchImage.animate().alpha(0).rotation(stitchImage.getRotation()+3600).scaleX(0).scaleY(0).setDuration(3000);
            liloImage.animate().alpha(1).rotation(liloImage.getRotation()+3600).scaleX(1).scaleY(1).setDuration(3000);

            isStitchVisible = false;
        }else{
            stitchImage.animate().alpha(1).rotation(stitchImage.getRotation()+3600).scaleX(1).scaleY(1).setDuration(3000);
            liloImage.animate().alpha(0).rotation(liloImage.getRotation()+3600).scaleX(0).scaleY(0).setDuration(3000);

            isStitchVisible = true;
        }




    }
}