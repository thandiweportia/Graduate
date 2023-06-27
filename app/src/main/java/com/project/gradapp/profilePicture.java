package com.project.gradapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class profilePicture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_picture);

        Button finishBtn = (Button) findViewById(R.id.finishBtn);
        finishBtn.setOnClickListener(v -> openexploreScreen());
    }

    public void openexploreScreen() {
        Intent intent = new Intent(this, exploreScreen.class);
        startActivity(intent);
    }
}