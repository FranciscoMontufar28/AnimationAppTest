package com.francisco.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView planeone = findViewById(R.id.planeone);
        ImageView planetwo = findViewById(R.id.planetwo);
        planeone.animate().alpha(0f).setDuration(2000);
        planetwo.animate().alpha(1f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
