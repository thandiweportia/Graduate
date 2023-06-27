package com.project.gradapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Complete extends AppCompatActivity {
    EditText username;
    EditText email;
    Button loginButton;

    String[] institution = { "University of Johannesburg", "Wits",
            "University of Pretoria", "University of Cape Town",
            "University of Western Cape", "University of South Africa" };
    String[] streams = { "Web", "Data structures",
            "Mobile", "Desktop Application",
            "DSA with java", "UI/UX" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Spinner institution = findViewById(R.id.institutionSpinner);
        Spinner streams = findViewById(R.id.streamSpinner);

        //spin.setOnItemSelectedListener(this);

        // Create the instance of ArrayAdapter
        // having the list of courses



        username = findViewById(R.id.nameEdit);
        email = findViewById(R.id.emailEdit);
        loginButton = findViewById(R.id.continueBtn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && email.getText().toString().equals("1234")) {
                    Toast.makeText(Complete.this, "Login successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Complete.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}